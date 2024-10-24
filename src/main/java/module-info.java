module com.example.loginwithfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginwithfxml to javafx.fxml;
    exports com.example.loginwithfxml;
}