package application;

import java.util.ArrayList;

public class Ranking {
	
	public ArrayList<Usuario>usuarios;
	
	Ranking (){
		usuarios = new ArrayList<Usuario>();
	}
	
	public void ordenarRanking(){
		usuarios.sort(null);
	}
	
	public void adicionarUsuario(){
		
	}
}
