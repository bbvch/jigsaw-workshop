package ch.bbv.java9.todo.model.entity;

/**
 * Item representing something to do
 * Created by Daniel on 03.01.2017.
 */
public class TodoItem {

    // explanatory message: What is to do?
    private String message = null;

    public TodoItem(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
