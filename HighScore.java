package application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HighScore{
	static int score = 0; 
	public static void display()
	{	
		Stage window = new Stage();
		Scene scene;
		BorderPane layout = new BorderPane();
		
		
		Text t = new Text("\n\n\n\n\t     Highscore:     " + score);
		t.setStyle("-fx-font: 15 arial");
		HBox hbox = new HBox(); 
		hbox.getChildren().add(t);
		layout.getChildren().add(hbox);
		BorderPane.setAlignment(hbox, Pos.BASELINE_CENTER);
		scene  = new Scene(layout,200,200);
		window.setScene(scene);
		window.show();
		
	}	
	
	public static void increase()
	{
		score++;
	}
	
	public static int getScore() {
		return score;
	}
}		