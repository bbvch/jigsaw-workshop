package ch.bbv.java9.todo.util.api;

import ch.bbv.java9.todo.model.entity.TodoItem;

import java.util.List;

/**
 * Interface for Importer implementations that import a list of TodoItems from a given source
 * Created by Daniel on 03.01.2017.
 */
public interface TodoImporter {

    /**
     * import a list of {@link TodoItem} instances from given source
     * @return the imported list of items
     */
    List<TodoItem> imporItems();
}
