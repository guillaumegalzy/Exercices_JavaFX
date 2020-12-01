package org.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Form1Controller {
    @FXML
    public TextField textfield1;
    @FXML
    public Button button1;
    @FXML
    public Label label1;

    public void button1_click(ActionEvent actionEvent) {
        this.label1.setText("Bonjour " + this.textfield1.getText());
    }
}
