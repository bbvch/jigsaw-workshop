/**
 * Service provider module for implementation of ch.bbv.java9.todo.spi.TodoWriterProvider
 * Created by Daniel on 06.01.2017.
 */
module ch.bbv.java9.todo.out {
    exports ch.bbv.java9.todo.out;
    requires ch.bbv.java9.todo.app;
    provides ch.bbv.java9.todo.spi.TodoWriterProvider
        with ch.bbv.java9.todo.out.TodoWriterStdoutProvider;
}