module com.mycompany.ejercicio3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio3 to javafx.fxml;
    exports com.mycompany.ejercicio3;
}
