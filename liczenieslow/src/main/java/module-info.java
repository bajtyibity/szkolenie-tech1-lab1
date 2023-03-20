module com.mycompany.liczenieslow {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.liczenieslow to javafx.fxml;
    exports com.mycompany.liczenieslow;
}
