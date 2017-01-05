package ch.bbv.java9.todo.util.api;

import ch.bbv.java9.todo.util.internal.TodoCLIImporter;
import ch.bbv.java9.todo.util.internal.TodoCSVImporter;

/**
 * Factory class for instances of {@link TodoImporter}
 * Created by Daniel on 03.01.2017.
 */
public class TodoImporterFactory {

    /**
     * Create an instance of {@link TodoImporter} for an array of command line arguments
     * @param args
     * @return
     */
    public static TodoImporter from(String[] args){
        TodoImporter importer = null;
        switch (args.length){
            case 1:
                System.out.println("using CSV importer");
                importer = new TodoCSVImporter(args[0]);
                break;
            default:
                System.out.println("using CLI importer");
                importer = new TodoCLIImporter(args);
                break;
        }
        return importer;
    }
}
