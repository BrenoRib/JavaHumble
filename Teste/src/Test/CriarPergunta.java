package Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CriarPergunta {
	
	@FXML
    private TextArea txtPergunta;
	
	@FXML
    private RadioButton rb1;

    @FXML
    private RadioButton rb2;

    @FXML
    private RadioButton rb4;

    @FXML
    private RadioButton rb3;

    @FXML
    private TextField txtAlternativa1;

    @FXML
    private TextField txtAlternativa2;

    @FXML
    private TextField txtAlternativa3;

    @FXML
    private TextField txtAlternativa4;


	
	private void salvar(ActionEvent e) {
	Pergunta pergunta = new Pergunta();
	pergunta.setPergunta(txtPergunta.getText());
	pergunta.setAlternativas(txtAlternativa1.getText(),txtAlternativa2.getText(),txtAlternativa3.getText(),txtAlternativa4.getText());
	if(rb1.isSelected() == true)
		pergunta.setCorreta(0);
	else if (rb2.isSelected() == true)
		pergunta.setCorreta(1);
	else if (rb3.isSelected() == true)
		pergunta.setCorreta(2);
	else if (rb4.isSelected() == true)
		pergunta.setCorreta(3);
	try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("perguntas.ser"));
		os.writeObject(pergunta);
	} catch (IOException ex) {
		ex.printStackTrace();
		}
	}
}
