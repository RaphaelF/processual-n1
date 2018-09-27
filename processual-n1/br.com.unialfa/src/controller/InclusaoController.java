package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Model.Usuario; 



public class InclusaoController {
	
	Usuario u = new Usuario();

    @FXML
    private Label lblSenha;

    @FXML
    private ComboBox<?> cmbxCargo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Label lblUsuario;

    @FXML
    private TextField txtSenha;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtEmail;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblCargo;

    @FXML
    private Button btnLimpar;

    @FXML
    private TextField txtUsuario;

    @FXML
    void salvar(ActionEvent event) {
    	u.setUsuario(txtUsuario.getText());
    	u.setEmail(txtEmail.getText());
    	u.setSenha(txtSenha.getText());
    	
    }

    @FXML
    void limpar(ActionEvent event) {
    	
    	Usuario u = new Usuario();
    	txtUsuario.setText("");
    	txtEmail.setText("");
    	txtSenha.setText("");

    }
    
    public void populaCombo(Usuario u) {
    	
    	for (String c: u.cargo) {
    		cmbxCargo.getSelectionModel().getSelectedItem() ;
    	}
    	
    }

}
