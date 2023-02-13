module com.sidiki.application11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sidiki.application11 to javafx.fxml;
    exports com.sidiki.application11;
}