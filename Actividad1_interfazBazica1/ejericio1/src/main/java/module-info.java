module com.mycompany.ejericio1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejericio1 to javafx.fxml;
    exports com.mycompany.ejericio1;
}
