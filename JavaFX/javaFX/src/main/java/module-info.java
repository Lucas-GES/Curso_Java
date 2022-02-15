module application.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.javafx to javafx.fxml;
    exports application.javafx;
}