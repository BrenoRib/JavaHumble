package application;

import java.util.ArrayList;

public class Topico {

	private String nome;
	private ArrayList<Pergunta>perguntas;
	private int quantidadeXp;
	
	public Topico(String nome, ArrayList<Pergunta> perguntas, int quantidadeXp) {
		this.nome = nome;
		this.perguntas = perguntas;
		this.quantidadeXp = quantidadeXp;
	}
	
	public void responderPerguntas(){
		
	}

	public void aumentarLevelUsuario(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(ArrayList<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public int getQuantidadeXp() {
		return quantidadeXp;
	}

	public void setQuantidadeXp(int quantidadeXp) {
		this.quantidadeXp = quantidadeXp;
	}
	
}
