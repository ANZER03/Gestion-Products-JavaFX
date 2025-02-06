module ma.enset.gestionproductsjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens ma.enset.gestionproductsjavafx to javafx.fxml;
    exports ma.enset.gestionproductsjavafx;
}