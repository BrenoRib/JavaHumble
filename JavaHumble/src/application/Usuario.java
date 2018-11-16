package application;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Usuario {

	private String senha;
	private String email;
	private String nome;
	private String proeficiencia;
	private String nickname;
	public ArrayList<Usuario> amigos;
	private int nivel;
	private int xp;
	private String sexo;

	public Usuario(String nome, String nickname, String email) {
		this.email = email;
		this.nome = nome;
		this.nickname = nickname;
		amigos = new ArrayList<Usuario>();

	}

	@FXML
	private TextField txtNickname;

	@FXML
	private TextField txtSenha;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextField txtRepitaSenha;

	@FXML
	private TextField txtSobrenome;

	@FXML
	private TextField txtNome;
	
	

	

	public void adicionarAmigo(Usuario x, Usuario y) {

	}

	public void aumentarNivel() {
		setNivel(getNivel() + 1);

	}

	public void alterarNickname() {
		this.setNickname("");
	}

	public void alterarSenha() {
		this.setSenha("");
	}

	public void alterarEmail() {
		this.setEmail("");
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProeficiencia() {
		return proeficiencia;
	}

	public void setProeficiencia(String proeficiencia) {
		this.proeficiencia = proeficiencia;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
