module com.kimikevin.bestandsliste {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.kimikevin.bestandsliste to javafx.fxml;
    exports com.kimikevin.bestandsliste;
    exports com.kimikevin.bestandsliste.view;
    opens com.kimikevin.bestandsliste.view to javafx.fxml;
    exports com.kimikevin.bestandsliste.controller;
    opens com.kimikevin.bestandsliste.controller to javafx.fxml;
}