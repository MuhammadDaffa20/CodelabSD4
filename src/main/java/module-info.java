module com.example.codelabsd4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codelabsd4 to javafx.fxml;
    exports com.example.codelabsd4;
}