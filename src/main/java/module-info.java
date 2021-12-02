module com.example.a03v2jdk11 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.a03v2jdk11 to javafx.fxml;
    exports com.example.a03v2jdk11;
}