package dao;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.neo4j.configuration.Dynamic;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.io.fs.FileUtils;
import parser.*;
import parser.Entity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class IfcMetaData {

    List<Entity> entityList = null;

    private static final File databaseDirectory = new File( "target/neo4j-hello-db" );

    // START SNIPPET: vars
    GraphDatabaseService graphDb;

    private enum RelTypes implements RelationshipType
    {
        HAS_ATTR
    }


    public IfcMetaData(String filePath) {
        try {

            CharStream input = CharStreams.fromFileName(filePath);

            ExpressGrammarLexer lexer = new ExpressGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpressGrammarParser parser = new ExpressGrammarParser(tokens);
            ParseTree tree = parser.schema();


            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            ExpressSchemaParser extractor = new ExpressSchemaParser();
            walker.walk(extractor, tree); // initiate walk of tree with listener
            extractor.getDerivedAttributes();
            entityList = extractor.getEntityList();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void createDb() throws IOException
    {
        FileUtils.deleteRecursively( databaseDirectory );

        // START SNIPPET: startDb
        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase( databaseDirectory );
        registerShutdownHook( graphDb );

        // START SNIPPET: transaction
        try ( Transaction tx = graphDb.beginTx() )
        {
            // Database operations go here
            // END SNIPPET: transaction
            // START SNIPPET: addData
            for (Entity entity: entityList) {
                Node entityNode = graphDb.createNode();
                List<Attribute> attrs = entity.getAttributes();
                entityNode.setProperty("name", entity.getName());
                entityNode.setProperty("version", entity.getVersion());
                for (Attribute attr: attrs) {
                    Node attrNode = graphDb.createNode();
                    attrNode.setProperty("name", attr.getName());
                    attrNode.setProperty("index", attr.getIndex());
                    entityNode.createRelationshipTo(attrNode, RelTypes.HAS_ATTR);
                }
            }



            // START SNIPPET: transaction
            tx.success();
        }
    }


    void shutDown()
    {
        System.out.println();
        System.out.println( "Shutting down database ..." );
        // START SNIPPET: shutdownServer
        graphDb.shutdown();
        // END SNIPPET: shutdownServer
    }

    // START SNIPPET: shutdownHook
    private static void registerShutdownHook( final GraphDatabaseService graphDb )
    {
        // Registers a shutdown hook for the Neo4j instance so that it
        // shuts down nicely when the VM exits (even if you "Ctrl-C" the
        // running application).
        Runtime.getRuntime().addShutdownHook( new Thread()
        {
            @Override
            public void run()
            {
                graphDb.shutdown();
            }
        } );
    }

    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\ifc4.exp";
        IfcMetaData meta = new IfcMetaData(path);

        meta.createDb();
        meta.shutDown();
    }
}
