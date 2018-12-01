package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

//import ArquivosJava.Pergunta;
//import connectivity.ConnectionClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class ControllerExplicacao {

    @FXML
    private Label lblNick;

    @FXML
    private Label lblNivel;

    @FXML
    private Label lblNumNivel;

    @FXML
    private ProgressBar barraprogress;

    @FXML
    private Label lblExplicacao;
    
  //Não sei o nome q vc deu no banco de dados para a parte da "explicação"
    
    /*public void Explicar() {
		try {
			
			
			Connection con = ConnectionClass.ligar();
			String sql = "select * from perguntas where ID = "+ random+ "";
			
			
			con.close();
		} catch (SQLException e) {
			 TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}*/

}

