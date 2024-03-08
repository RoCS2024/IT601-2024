module com.video.rental.app {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.video.rental.app to javafx.fxml;
    opens com.video.rental.app.controllers.main to javafx.fxml;
    opens com.video.rental.app.controllers.dashboard to javafx.fxml;

    exports com.video.rental.app;
    exports com.video.rental.app.controllers.main;
    exports com.video.rental.app.controllers.dashboard;
}