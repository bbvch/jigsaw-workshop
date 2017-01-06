package ch.bbv.java9.todo.app.api;

import ch.bbv.java9.todo.spi.TodoWriter;
import ch.bbv.java9.todo.spi.TodoWriterProvider;
import ch.bbv.java9.todo.util.api.TodoImporter;
import ch.bbv.java9.todo.util.api.TodoImporterFactory;

/**
 * Todo-Application to create and print things to do to stdout
 * Created by Daniel on 03.01.2017.
 */
public class TodoApplication {

    public static void main(String[] args) {
        TodoImporter importer = TodoImporterFactory.from(args);
        TodoWriter writer = TodoWriter.get();
        importer.importItems()
                .forEach(writer::write);
    }
}
