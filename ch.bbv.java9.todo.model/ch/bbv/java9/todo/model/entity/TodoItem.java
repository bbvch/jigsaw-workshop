package ch.bbv.java9.todo.model.entity;

import ch.bbv.java9.todo.model.internal.TodoItemStatus;

/**
 * Item representing something to do
 * Created by Daniel on 03.01.2017.
 */
public class TodoItem {

    // explanatory message: What is to do?
    private String message = null;
    // status of item
    private TodoItemStatus status;

    public TodoItem(String message){
        this.message = message;
        this.status = TodoItemStatus.NEW;
    }

    public TodoItem(String message, TodoItemStatus status) {
        this(message);
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "message='" + message + '\'' +
                '}';
    }
}
