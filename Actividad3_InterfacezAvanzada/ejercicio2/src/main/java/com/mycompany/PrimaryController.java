package com.mycompany;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Label lblLiebre, lblTortuga;
    @FXML private ProgressBar progressBarLiebre, progressBarTortuga;
    @FXML private Button btnIniciar;

    @FXML
    private void btnIniciarCarrera_click() {
        progressBarLiebre.setProgress(0);
        progressBarTortuga.setProgress(0);
        btnIniciar.setDisable(true);

        Thread liebre = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    int progreso = i;
                    Platform.runLater(() -> progressBarLiebre.setProgress(progreso / 100.0));

                    if (i == 50) {
                        Platform.runLater(() -> lblLiebre.setText("La liebre se durmió"));
                        Thread.sleep(8000);
                        Platform.runLater(() -> lblLiebre.setText("La liebre despertó"));
                    }

                    Thread.sleep(30);
                }
                Platform.runLater(() -> lblLiebre.setText("La liebre llegó"));
            } catch (InterruptedException e) {
            }
        });

        Thread tortuga = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    int progreso = i;
                    Platform.runLater(() -> progressBarTortuga.setProgress(progreso / 100.0));
                    Thread.sleep(100);
                }

                Platform.runLater(() -> {
                    lblTortuga.setText("La tortuga llegó y ganó!");
                    btnIniciar.setDisable(false);
                });
            } catch (InterruptedException e) {
            }
        });

        liebre.start();
        tortuga.start();
    }
}