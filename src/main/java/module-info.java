module com.juanite {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.juanite to javafx.fxml;
    exports com.juanite;
}
