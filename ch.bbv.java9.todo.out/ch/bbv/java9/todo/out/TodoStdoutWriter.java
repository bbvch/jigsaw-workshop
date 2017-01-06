package ch.bbv.java9.todo.out;

import ch.bbv.java9.todo.model.entity.TodoItem;
import ch.bbv.java9.todo.spi.TodoWriter;

/**
 * TodoWriter to write a {@link TodoItem} to Stdout
 * Created by Daniel on 06.01.2017.
 */
public class TodoStdoutWriter extends TodoWriter {
    @Override
    public void write(TodoItem todoItem) {
        System.out.println(todoItem);
    }
}
