module com.mycompany.ejercicio5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio5 to javafx.fxml;
    exports com.mycompany.ejercicio5;
}
