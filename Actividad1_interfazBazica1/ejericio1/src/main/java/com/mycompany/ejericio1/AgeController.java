package com.mycompany.ejericio1;


import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class AgeController {
    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;
    
    @FXML
    private void calcular() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacimiento = LocalDate.parse(txtFecha.getText(), formato);
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(nacimiento, hoy);
        lblResultado.setText("Tiene " + edad.getYears() + " años con " + edad.getMonths() + " meses");
    }
    
    @FXML
    private void limpiar() {
        txtFecha.clear();
        lblResultado.setText("");
    }
    
}