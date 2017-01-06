package ch.bbv.java9.todo.spi;

import ch.bbv.java9.todo.model.entity.TodoItem;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Service Interface for {@link TodoWriter} instances
 * Created by Daniel on 06.01.2017.
 */
public abstract class TodoWriter {

    /**
     * Get instance of {@link TodoWriter} implementation via service loader
     * @return an implementation of {@link TodoWriter}
     */
    public static TodoWriter get(){
        ServiceLoader<TodoWriterProvider> sl = ServiceLoader.load(TodoWriterProvider.class);
        Iterator<TodoWriterProvider> it = sl.iterator();
        if(!it.hasNext()){
            throw new RuntimeException("No service provider found for ch.bbv.java9.todo.spi.TodoWriterProvider");
        }
        return it.next().open();
    }

    /**
     * Writes a {@link TodoItem} to somewhere
     * @param todoItem a single {@link TodoItem}
     */
    public abstract void write(TodoItem todoItem);
}
