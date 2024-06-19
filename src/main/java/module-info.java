module com.example.schiffeFE {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.schiffeFE to javafx.fxml;
    exports com.example.schiffeFE;
}