module com.mycompany.ejercicio2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio2 to javafx.fxml;
    exports com.mycompany.ejercicio2;
}
