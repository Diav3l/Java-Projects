package Problem_01;

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class Problem01 extends Application 
{ 
  @Override
  public void start(Stage primaryStage) {
		Random R = new Random();
 		Label[] label = new Label[5];
		HBox hbox = new HBox();

	  for(int i = 0; i < label.length; i++){
			label[i] = new Label("Java");
			label[i].setRotate(90);
			label[i].setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			Color color = new Color(R.nextFloat(), R.nextFloat(), R.nextFloat(), R.nextFloat());
			label[i].setTextFill(color);
			hbox.getChildren().add(label[i]);
		}
		
		hbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(hbox, 300, 200);

    primaryStage.setTitle("Problem01");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 