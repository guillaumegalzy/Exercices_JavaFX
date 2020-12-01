package calculatrice.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Arrays;

public class CalcController {
    @FXML
    public Button button0;

    @FXML
    public Button button1;

    @FXML
    public Button button2;

    @FXML
    public Button button3;

    @FXML
    public Button button4;

    @FXML
    public Button button5;

    @FXML
    public Button button6;

    @FXML
    public Button button7;

    @FXML
    public Button button8;

    @FXML
    public Button button9;

    @FXML
    public TextArea result;

    @FXML
    public Button buttonCalculer;

    @FXML
    public Button buttonVider;

    public void buttonVider_Click(ActionEvent actionEvent) {
        this.result.clear();
    }

    public void buttonCalculer_Click(ActionEvent actionEvent) {
        int calc = 0;
        String[] chiffre = this.result.getText().split("[+]");
        for (String element: chiffre) {
            calc += Integer.parseInt(element);
        }
        this.result.appendText("=" + calc);
    }

    public void button0_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("0");
        }else {
            this.result.appendText("+"+0);
        }
    }

    public void button2_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("2");
        }else {
            this.result.appendText("+"+2);
        }
    }

    public void button4_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("4");
        }else {
            this.result.appendText("+"+4);
        }
    }

    public void button3_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("3");
        }else {
            this.result.appendText("+"+3);
        }
    }

    public void button1_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("1");
        }else {
            this.result.appendText("+"+1);
        }
    }

    public void button5_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("5");
        }else {
            this.result.appendText("+"+5);
        }
    }

    public void button6_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("6");
        }else {
            this.result.appendText("+"+6);
        }
    }

    public void button7_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("7");
        }else {
            this.result.appendText("+"+7);
        }
    }

    public void button8_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("8");
        }else {
            this.result.appendText("+"+8);
        }
    }

    public void button9_Click(ActionEvent actionEvent) {
        if (this.result.getLength() == 0){
            this.result.appendText("9");
        }else {
            this.result.appendText("+"+9);
        }
    }
}
