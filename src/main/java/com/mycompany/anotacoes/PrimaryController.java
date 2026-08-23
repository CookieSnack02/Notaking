package com.mycompany.anotacoes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    
    @FXML 
    public TextField nomeEstudante; 
    public Button botaoSalvarEst; 
    private String nomeValidado;

    
    /* 
        Se o campo não estiver vazio e se o botão for clicado captura o nome
    */
    
    @FXML
    private void salvarNomeEst(ActionEvent event) throws IOException{
        String textoDigitado = nomeEstudante.getText();
        
        if(textoDigitado == null || textoDigitado.trim().isEmpty()){
            System.out.println("Por favor, digite um nome: ");
            return; 
        }
        
        /* FXMLLoader ler um arquivo .fxml e transforma ele em objetos Java */
        FXMLLoader loader = new FXMLLoader(App.class.getResource("entrada.fxml"));
        Parent root = loader.load(); //Aqui ele traduz todo o arquivo entrada.fxml
        /* 
        Ele cria duas coisas: 
        A tela visual pronta
        Controller -> Ponte entre FXML e os dados
        */
        
        /* SecondaryController é apenas um desempactoador do loader() - tira a tela e o controller*/
        SecondaryController secondaryController = loader.getController();
        secondaryController.nomeUsuario(textoDigitado);
        
        
        App.setRoot(root);
    }
    

}
