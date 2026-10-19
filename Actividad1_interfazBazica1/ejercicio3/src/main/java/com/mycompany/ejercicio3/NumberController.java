package com.mycompany.ejercicio3;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class NumberController {
    @FXML private TextField txtNumero, txtCantidad, txtImpares, txtPares, txtSuma, txtMayor, txtMenor;
    @FXML private TextArea txtDivisores;
    @FXML
    private void analizar() {
        int numero = Integer.parseInt(txtNumero.getText());
        int n = numero;
        int cantidad = 0, impares = 0, pares = 0, suma = 0;
        int mayor = 0, menor = 9;
        while (n > 0) {
            int cifra = n % 10;
            cantidad++;
            suma += cifra;
            if (cifra % 2 == 0) pares += cifra;
            else impares += cifra;
            if (cifra > mayor) mayor = cifra;
            if (cifra < menor) menor = cifra;
            n /= 10;
        }
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) divisores += i + "\n";
        }
        txtCantidad.setText(String.valueOf(cantidad));
        txtImpares.setText(String.valueOf(impares));
        txtPares.setText(String.valueOf(pares));
        txtSuma.setText(String.valueOf(suma));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));
        txtDivisores.setText(divisores);
    }
    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtCantidad.clear();
        txtImpares.clear();
        txtPares.clear();
        txtSuma.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
    }

}