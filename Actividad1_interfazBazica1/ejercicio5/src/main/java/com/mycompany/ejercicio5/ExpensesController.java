package com.mycompany.ejercicio5;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ExpensesController {
    @FXML private TextField txtAlimentacion, txtRefrigerios, txtTransporte, txtTelefonia, txtOtros, txtTotal, txtMayor;

    @FXML
    private void calcular() {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());

        int total = alimentacion + refrigerios + transporte + telefonia + otros;
        txtTotal.setText(String.valueOf(total));

        int mayor = alimentacion;
        String nombre = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            nombre = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            nombre = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            nombre = "Telefonía";
        }
        if (otros > mayor) {
            nombre = "Otros";
        }

        txtMayor.setText(nombre);
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMayor.clear();
    }
}