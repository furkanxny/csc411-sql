module com.example.csc411sql {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.csc411sql to javafx.fxml;
    exports com.example.csc411sql;
    exports com.example.csc411sql.controllers.auth;
    opens com.example.csc411sql.controllers.auth to javafx.fxml;
}