module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    exports com.example.javafx.Controllers;
    exports com.example.javafx.Controllers.Admin;
    exports com.example.javafx.Controllers.Client;
    exports com.example.javafx.Models;
    exports com.example.javafx.Views;

}