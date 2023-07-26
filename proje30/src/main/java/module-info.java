module com.example.proje30 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.proje30 to javafx.fxml;
    exports com.example.proje30;
}