/**
 * Main Application module
 * Created by Daniel on 03.01.2017.
 */
module ch.bbv.java9.todo.app {
    exports ch.bbv.java9.todo.app.api;
    requires ch.bbv.java9.todo.model;
    requires ch.bbv.java9.todo.util;
}