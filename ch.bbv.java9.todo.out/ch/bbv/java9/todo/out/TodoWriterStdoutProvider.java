package ch.bbv.java9.todo.out;

import ch.bbv.java9.todo.spi.TodoWriter;
import ch.bbv.java9.todo.spi.TodoWriterProvider;

/**
 * Service Provider Implementation for instances of {@link TodoWriter}
 * Created by Daniel on 06.01.2017.
 */
public class TodoWriterStdoutProvider implements TodoWriterProvider {
    @Override
    public TodoWriter open() {
        return new TodoStdoutWriter();
    }
}
