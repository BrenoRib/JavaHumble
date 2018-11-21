package arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lerArq {

	public static void main(String[] args) {
		try {
			String nome;
			BufferedReader br = new BufferedReader(new FileReader("D:/JavaHumble/perguntinhas.txt"));
			while(br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			br.close();
			String respostas;
			BufferedReader rb = new BufferedReader(new FileReader("D:/JavaHumble/respostas.txt"));
			while(rb.ready()) {
				String line = rb.readLine();
				System.out.println(line);
			}
			rb.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
