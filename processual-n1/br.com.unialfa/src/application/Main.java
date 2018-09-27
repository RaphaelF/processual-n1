package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import controller.*; 


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			AnchorPane root =  FXMLLoader.load(
//	                getClass().getResource("../view/FXMLPrincipal.fxml"));
			AnchorPane root = new AnchorPane(); 
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/FXMLPrincipal.fxml"));
			root = fxmlLoader.load(); 
			Scene scene = new Scene(root,800,600);
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
