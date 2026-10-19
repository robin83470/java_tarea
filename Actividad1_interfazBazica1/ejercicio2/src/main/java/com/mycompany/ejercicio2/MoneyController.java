package com.mycompany.ejercicio2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MoneyController {
    @FXML private TextField txtDinero;
    @FXML private Label lbl500, lbl200, lbl100, lbl50, lbl20, lbl10, lbl5, lbl2, lbl1;
    @FXML
    private void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());
        int c500 = dinero / 500;
        dinero %= 500;
        int c200 = dinero / 200;
        dinero %= 200;
        int c100 = dinero / 100;
        dinero %= 100;
        int c50 = dinero / 50;
        dinero %= 50;
        int c20 = dinero / 20;
        dinero %= 20;
        int c10 = dinero / 10;
        dinero %= 10;
        int c5 = dinero / 5;
        dinero %= 5;
        int c2 = dinero / 2;
        dinero %= 2;
        int c1 = dinero;
        lbl500.setText(String.valueOf(c500));
        lbl200.setText(String.valueOf(c200));
        lbl100.setText(String.valueOf(c100));
        lbl50.setText(String.valueOf(c50));
        lbl20.setText(String.valueOf(c20));
        lbl10.setText(String.valueOf(c10));
        lbl5.setText(String.valueOf(c5));
        lbl2.setText(String.valueOf(c2));
        lbl1.setText(String.valueOf(c1));
    }
    @FXML
    private void limpiar() {
        txtDinero.clear();
        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");
    }
}