/**
 * Main Application module
 * Created by Daniel on 03.01.2017.
 */
module ch.bbv.java9.todo.app {
    exports ch.bbv.java9.todo.app.api;
    exports ch.bbv.java9.todo.spi;
    requires public ch.bbv.java9.todo.util;
    uses ch.bbv.java9.todo.spi.TodoWriterProvider;
}