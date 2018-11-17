package application;
	
//import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {

	private static Stage principalStage = new Stage();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			backingTrack.TocarMusicaFx.playFx("src/backingTrack/Dr. Dre The next episode instrumental.mp3");
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/menuLogarCadastrar.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("JavaHumble");
			primaryStage.setScene(scene);
			primaryStage.show();
			setPrincipalStage(primaryStage);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

	public static Stage getPrincipalStage() {
		return principalStage;
	}

	public static void setPrincipalStage(Stage primaryStage) {
		Main.principalStage = primaryStage;
	}
}