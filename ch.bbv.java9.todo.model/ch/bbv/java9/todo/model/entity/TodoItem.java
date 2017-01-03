package ch.bbv.java9.todo.model.entity;

/**
 * Created by Daniel on 03.01.2017.
 */
public class TodoItem {

    private String message = null;

    public TodoItem(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
