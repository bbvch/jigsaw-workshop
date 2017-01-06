package ch.bbv.java9.todo.spi;

/**
 * Service provider interface for instances of {@link TodoWriter}
 * Created by Daniel on 06.01.2017.
 */
public interface TodoWriterProvider {

    TodoWriter open();
}
