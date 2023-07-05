module com.kimikevin.bestandsliste {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
                            
    opens com.kimikevin.bestandsliste to javafx.fxml;
    exports com.kimikevin.bestandsliste;
    exports com.kimikevin.bestandsliste.controller;
    opens com.kimikevin.bestandsliste.controller to javafx.fxml;
}