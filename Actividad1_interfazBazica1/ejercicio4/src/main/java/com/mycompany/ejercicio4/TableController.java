package com.mycompany.ejercicio4;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TableController {
    @FXML private TextField txtNumero;
    @FXML private TextArea txtResultado;

    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += numero + "x" + i + " = " + (numero * i) + "\n";
        }
        txtResultado.setText(resultado);
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtResultado.clear();
    }
}