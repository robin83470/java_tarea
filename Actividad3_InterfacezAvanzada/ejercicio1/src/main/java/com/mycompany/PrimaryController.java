package com.mycompany;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    private int clics = 0;
    
    @FXML
    Label lblContor;   
    @FXML
    ProgressBar progressBar;   
    @FXML
    Button esperarButton;
    @FXML
    private void btnContar2_click() {
        clics++;
        if (clics > 100){
            clics = 0;
        }
        lblContor.setText(clics + "");
    }
    
@FXML
    private void btnEsperar1_click() {
        esperarButton.setDisable(true);
        progressBar.setProgress(0.0);
        
        Thread hilo = new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    final double progreso = i / 100.0;                 
                    Platform.runLater(() -> {
                        progressBar.setProgress(progreso);
                    });                    
                    Thread.sleep(100); 
                }
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo");
            }           
            Platform.runLater(() -> {
                esperarButton.setDisable(false);
            });
        });        
        hilo.setDaemon(true);
        hilo.start();
    }
}
