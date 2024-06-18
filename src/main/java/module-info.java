module com.example.schiffefe {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.schiffefe to javafx.fxml;
    exports com.example.schiffefe;
}