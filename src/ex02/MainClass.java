package ex02;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("11111");
		Parent root =FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		System.out.println("22222");
		Scene scene =new Scene(root);
		System.out.println(33333);
		
				
		
		
		
		
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}