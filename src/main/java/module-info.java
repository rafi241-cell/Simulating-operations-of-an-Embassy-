module com.example.simulating_operations_of_an_embassy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_an_embassy to javafx.fxml;
    exports com.example.simulating_operations_of_an_embassy;
}