package br.edu.calcjavafx;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    private Label lblRes;
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;

    @FXML
    public void Calcular(Event e) {
        Integer num1 = Integer.parseInt(txtnum1.getText());
        Integer num2 = Integer.parseInt(txtnum2.getText());
        Integer soma = num1 + num2;
        lblRes.setText(String.valueOf(soma));
    }
}