module br.edu.calcjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.calcjavafx to javafx.fxml;
    exports br.edu.calcjavafx;
}