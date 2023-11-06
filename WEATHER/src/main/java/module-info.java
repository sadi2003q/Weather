module com.example.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.weather;
    exports com.example.weather;
}