package com.beorn.todolist;

import com.beorn.todolist.datamodel.TodoData;
import com.beorn.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.awt.TextArea;
import java.time.LocalDate;

/**
 * Created by Beorn on 2018-03-20.
 */
public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailArea;
    @FXML
    private DatePicker deadlinePicker;

    public void processReasults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoData.getInsance().addTodoItem(new TodoItem(shortDescription, details, deadlineValue));
    }
}
