package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
//import javafx.scene.text.Text;


public class Main extends Application { 
	Button CLOSE,PLAY,HIGHSCORE;
	
	Stage window;
	Scene scene;
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Spelling Game");

		window.setOnCloseRequest(e->{e.consume();closeprogram();});
		
		CLOSE = new Button("Close");
		CLOSE.setTextFill(Color.SADDLEBROWN);
		CLOSE.setStyle("-fx-font: 12 arial");
		CLOSE.setOnAction(e-> closeprogram());
		CLOSE.setMinSize(70, 50);
		HIGHSCORE = new Button("HighScore");
		HIGHSCORE.setTextFill(Color.BLUE);
		HIGHSCORE.setStyle("-fx-font: 12 arial");
		HIGHSCORE.setOnAction(e-> highscore());
		HIGHSCORE.setMinSize(70, 50);
		PLAY = new Button("Play");
		PLAY.setTextFill(Color.BLACK);
		PLAY.setStyle("-fx-font: 12 arial");
		PLAY.setOnAction(e->  play());
		PLAY.setMinSize(70, 50);
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(PLAY,HIGHSCORE,CLOSE);
		vbox.setSpacing(2);
		vbox.setAlignment(Pos.CENTER);
		BorderPane layout = new BorderPane();
		//layout.getChildren().addAll(vbox);
		layout.setCenter(vbox);
		
		scene = new Scene(layout,300,300);
		
		
		
		window.setScene(scene);
		window.show();
	}
	
	private void closeprogram() {
		ConfirmBox.display("Warning", "Are you sure you want to exit?",window);
		
	}
	
	private void play() {
		Play.display(window,scene);
	}
	
	private void highscore() {
		HighScore.display();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
}
