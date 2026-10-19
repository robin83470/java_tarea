module com.mycompany.ejercicio4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio4 to javafx.fxml;
    exports com.mycompany.ejercicio4;
}
