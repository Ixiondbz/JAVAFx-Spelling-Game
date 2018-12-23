package application;
import java.awt.Color;
import java.awt.Font;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.*;
public class GAMEOVER {
	public static void display(Stage window) {
		window.setTitle("*********************");
		Text text = new Text("\n\n\tGAMEOVER");
		text.setStyle("-fx-font: 30 calibri");
		text.setFill(javafx.scene.paint.Color.RED);
		BorderPane layout = new BorderPane();
		HBox hbox = new HBox();
		hbox.getChildren().add(text);
		layout.getChildren().add(hbox);
		layout.setAlignment(text, Pos.CENTER);
		Scene scene = new Scene(layout,250,150);
		
		window.setScene(scene);
		
		window.setOnCloseRequest(e->window.close());
		
	}
}
