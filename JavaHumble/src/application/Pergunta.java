package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Pergunta {
	
	private String pergunta;
	private Resposta resposta;
	private String conteudoRespondido;
	private String explicacao;
	private String[] alternativas = new String [4];
	
	@FXML
	private Label p1;
	
	@FXML
	private Label p2;
	
	@FXML
	private Label p3;
	
	@FXML
	private Label p4;
	
	@FXML
	private Label lblQuestion;
	
	
	
	
	public Pergunta(String pergunta, Resposta resposta, String conteudoRespondido) {
		
		this.pergunta = pergunta;
		this.resposta = resposta;
		this.conteudoRespondido = conteudoRespondido;
	}

	public boolean verificarResposta(){
		if(getConteudoRespondido() == resposta.getResposta())
			return true;
		else 
			return false;
	}
	
	public void setTextoPergunta() {
		
		lblQuestion.setText(pergunta);
		
		p1.setText(alternativas[0]);
		p2.setText(alternativas[1]);
		p3.setText(alternativas[2]);
		p4.setText(alternativas[3]);
		
		
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}
	public String getConteudoRespondido() {
		return conteudoRespondido;
	}

	public void setConteudoRespondido(String conteudoRespondido) {
		this.conteudoRespondido = conteudoRespondido;
	}

	public String getExplicacao() {
		return explicacao;
	}

	public void setExplicacao(String explicacao) {
		this.explicacao = explicacao;
	}

	public String[] getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}
	
}
