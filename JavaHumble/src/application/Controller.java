package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

	@FXML
	private Label status;
	
	@FXML
	private Label lblSenhaIncorreta;

	@FXML
	private TextField txtNickname;

	@FXML
	private TextField txtSenha;

	@FXML
	private Button irCadastro;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextField txtRepitaSenha;

	@FXML
	private TextField txtSobrenome;

	@FXML
	private TextField txtNome;

	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnPlay;
	
	@FXML
	private Button btnLogin;
	
	@FXML
	private RadioButton radioMasculino;
	
	@FXML
	private RadioButton radioFeminino;
	
	public void Login(ActionEvent event) throws Exception {
		
		
		try {
			Connection con =  ConnectionClass.ligar();
			
			String sql = "select * from usuario where nickname = ? and senha = ?;";
			
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, txtNickname.getText() );
			stmt.setString(2, txtSenha.getText() );
			
			ResultSet rs = stmt.executeQuery();
			//
			if(rs.next()) {
				
				JOptionPane.showMessageDialog(null, "Esse usuário existe");
				Parent root = FXMLLoader.load(getClass().getResource("/application/selecionarLinguagem.fxml"));
				Scene scene = new Scene(root, 600, 400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage primaryStage = new Stage();
				primaryStage.setScene(scene);
				primaryStage.show();
				Main.getPrincipalStage().close();
				Main.setPrincipalStage(primaryStage);
				
			}else{
				JOptionPane.showMessageDialog(null, "Esse usuário não existe");
			}
			stmt.close();
			con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		

	public void cadastrar(ActionEvent event) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/application/cadastro.fxml"));
		Scene scene = new Scene(root, 600, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
		Main.getPrincipalStage().close();
		Main.setPrincipalStage(primaryStage);
	//	backingTrack.TocarMusica.playMusic("Dr. Dre The next episode instrumental.mp3");
		

	}
	
	public void cadastroUsuario(ActionEvent event) throws Exception  {

		try {
			Connection con = ConnectionClass.ligar();

			String sql = "INSERT INTO usuario (nome, nickname, senha, email,sexo) VALUES (?, ?, ?, ?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, txtNome.getText());
			stmt.setString(2, txtNickname.getText());
			stmt.setString(4, txtEmail.getText());
			stmt.setString(5, "m");

			if (txtSenha.getText().equals(txtRepitaSenha.getText())) {
				stmt.setString(3, txtSenha.getText());
				stmt.execute();
				JOptionPane.showMessageDialog(null, "Saving Successfull");
				
				Parent root = FXMLLoader.load(getClass().getResource("/application/menuLogarCadastrar.fxml"));
				Scene scene = new Scene(root, 600, 400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage primaryStage = new Stage();
				primaryStage.setScene(scene);
				primaryStage.show();
				Main.getPrincipalStage().close();
				Main.setPrincipalStage(primaryStage);
				
				
			}else{
				
				lblSenhaIncorreta.setText("Senhas diferentes!");
	
			}
			

			txtNome.setText("");
			txtNickname.setText("");
			txtEmail.setText("");
			txtSenha.setText("");
			txtRepitaSenha.setText("");
			
			
			stmt.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public static void sair() {
		//btnSair.setOnAction(e -> System.exit(0));
		Main.getPrincipalStage().close();
	}
	
	
	
	public void IrLinguagem(ActionEvent event) throws Exception{
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/selecionarLinguagem.fxml"));
		Scene scene = new Scene(root, 600, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
