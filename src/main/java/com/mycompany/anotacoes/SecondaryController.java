package com.mycompany.anotacoes;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {
    
    @FXML 
    private Label mensagem_bv; 
    

    public void nomeUsuario(String nome){
        mensagem_bv.setText("Bem-vindo(a), " + nome);
    } 
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("inicial");
    }
}