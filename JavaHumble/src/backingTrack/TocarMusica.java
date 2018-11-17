package backingTrack;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class TocarMusica {

	public static void main(String[] args)  {
		playMusic("Dr. Dre The next episode instrumental.mp3");

	}

	public static void playMusic(String filepath)  {
		FileInputStream music;
		
			try {
				music = new FileInputStream(new File(filepath));
				BufferedInputStream go =new BufferedInputStream(music);
				try {
					Player player = new Player(go);
					player.play();
				}catch(JavaLayerException ex) {}
				
			} catch (Exception e) {
				
				JOptionPane.showMessageDialog(null, "ERRO");
				e.printStackTrace();
			}
			
		
			//File file = new File("/JavaHumble/src/backingTrack/Dr. Dre The next episode instrumental.mp3");
		
	}
	
	/*public AudioStream convertSong() {
		try {
			
			
			return audio;
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
		
	}*/
}
