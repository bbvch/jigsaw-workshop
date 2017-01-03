package ch.bbv.java9.todo.app.api;

import ch.bbv.java9.todo.model.entity.TodoItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Daniel on 03.01.2017.
 */
public class TodoApplication {

    public static void main(String[] args) {
        Arrays.asList(args).stream()
                .map(TodoItem::new)
                .forEach(System.out::println);

    }
}
