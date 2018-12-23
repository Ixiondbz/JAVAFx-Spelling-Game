package application;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ConfirmBox {
	public static void display(String title,String confirmwhat,Stage MAINWINDOW) {
		Stage window = new Stage();
		window.setTitle(title);
		Text t1 = new Text(confirmwhat+"\n");
		Scene scene;
		
		Button YES = new Button("Yes");
		YES.setMinSize(30, 30);
		YES.setOnAction(e-> {window.close();MAINWINDOW.close();});
		Button NO  = new Button("No");
		NO.setMinSize(30,30);
		NO.setOnAction(e->{window.close();});
		VBox vbox = new VBox();

		vbox.getChildren().addAll(t1,YES,NO);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(2);
		BorderPane pane = new BorderPane();
		pane.setCenter(vbox);
		
		scene = new Scene(pane,250,200);
		window.setScene(scene);
		window.show();
		
	}
}
