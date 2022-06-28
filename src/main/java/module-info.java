module com.scooteq {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.scooteq to javafx.fxml;
    exports com.scooteq;
}
