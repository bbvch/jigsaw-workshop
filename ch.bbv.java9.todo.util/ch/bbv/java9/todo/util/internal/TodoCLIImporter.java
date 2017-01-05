package ch.bbv.java9.todo.util.internal;

import ch.bbv.java9.todo.model.entity.TodoItem;
import ch.bbv.java9.todo.util.api.TodoImporter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daniel on 03.01.2017.
 */
public class TodoCLIImporter implements TodoImporter {


    private final String[] args;

    public TodoCLIImporter(String[] args) {
        this.args = args;
    }

    @Override
    public List<TodoItem> importItems() {
        return Arrays.stream(args)
                .map(TodoItem::new)
                .collect(Collectors.toList());
    }
}
