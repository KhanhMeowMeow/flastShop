module src {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens mainClass to javafx.fxml;
    exports mainClass;
}