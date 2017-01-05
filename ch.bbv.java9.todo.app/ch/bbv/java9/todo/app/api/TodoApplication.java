package ch.bbv.java9.todo.app.api;

import ch.bbv.java9.todo.model.entity.TodoItem;

import java.util.Arrays;

/**
 * Todo-Application to create and print things to do to stdout
 * Created by Daniel on 03.01.2017.
 */
public class TodoApplication {

    public static void main(String[] args) {
        Arrays.stream(args)
                .map(TodoItem::new)
                .forEach(System.out::println);

    }
}
