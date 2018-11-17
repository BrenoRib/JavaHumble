package Test;

import java.io.Serializable;

public class Pergunta implements Serializable{
	
	private String pergunta;
	private Resposta resposta;
	private String conteudoRespondido;
	private String explicacao;
	private String alternativas[] = new String [4];
	private int correta;
	
	public void setPerguntas(String pergunta) {
		this.pergunta = pergunta;
	}
	
	public void setAlternativas(String alternativa1, String alternativa2, String alternativa3, String alternativa4) {
		alternativas[0] = alternativa1;
		alternativas[1] = alternativa2;
		alternativas[2] = alternativa3;
		alternativas[3] = alternativa4;
		
	}
	
	public void setCorreta(int correta) {
		this.correta = correta;
	}
	
/*public Pergunta(String pergunta, Resposta resposta, String conteudoRespondido) {
		
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
		/*
		lblQuestion.setText(pergunta);
		
		p1.setText(alternativas[0]);
		p2.setText(alternativas[1]);
		p3.setText(alternativas[2]);
		p4.setText(alternativas[3]);
		}*/
		

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
