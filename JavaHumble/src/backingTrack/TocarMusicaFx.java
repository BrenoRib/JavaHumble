package backingTrack;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class TocarMusicaFx {

	
	public static void playFx(String caminho) {
		
		MediaPlayer mediaplayer;
		String path = new File(caminho).getAbsolutePath();
		Media song = new Media(new File(path).toURI().toString());
		mediaplayer = new MediaPlayer(song);
		mediaplayer.setAutoPlay(true);
		
	}
}
