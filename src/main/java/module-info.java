module com.example.proyectoborderpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoborderpane to javafx.fxml;
    exports com.example.proyectoborderpane;
}