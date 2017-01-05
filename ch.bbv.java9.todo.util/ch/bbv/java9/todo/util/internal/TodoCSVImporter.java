package ch.bbv.java9.todo.util.internal;

import ch.bbv.java9.todo.model.entity.TodoItem;
import ch.bbv.java9.todo.util.api.TodoImporter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 03.01.2017.
 */
public class TodoCSVImporter implements TodoImporter {

    private final String filename;
    private CSVParser records = null;

    public TodoCSVImporter(String filename){
        this.filename = filename + ".csv";
    }

    @Override
    public List<TodoItem> importItems() {
        List<TodoItem> todoItems = new ArrayList<>();
        try{
            records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(new FileReader(filename));
            for (CSVRecord record : records){
                String message = record.get("message");
                todoItems.add(new TodoItem(message));
            }
        }
        catch(IOException e){
            System.out.println("Can't read file: " + filename);
        }
        return todoItems;
    }
}
