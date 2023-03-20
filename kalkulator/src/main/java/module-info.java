module com.mycompany.kalkulator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.kalkulator to javafx.fxml;
    exports com.mycompany.kalkulator;
}
