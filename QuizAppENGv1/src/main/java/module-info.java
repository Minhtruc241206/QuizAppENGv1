module com.nmt.quizappengv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmt.quizappengv1 to javafx.fxml;
    exports com.nmt.quizappengv1;
}
