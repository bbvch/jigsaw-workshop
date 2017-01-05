package ch.bbv.java9.todo.util.internal;

import ch.bbv.java9.todo.model.entity.TodoItem;
import ch.bbv.java9.todo.util.api.TodoImporter;
import org.apache.commons.csv.CSVParser;

import java.util.List;

/**
 * Created by Daniel on 03.01.2017.
 */
public class TodoCSVImporter implements TodoImporter {

    private CSVParser records = null;

    @Override
    public List<TodoItem> importItems() {
        return null;
    }
}
