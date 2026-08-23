module com.mycompany.anotacoes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.anotacoes to javafx.fxml;
    exports com.mycompany.anotacoes;
}
