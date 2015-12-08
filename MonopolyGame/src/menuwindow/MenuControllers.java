package menuwindow;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.*;
import javafx.scene.layout.Pane;



public class MenuControllers  {
	@FXML
	private Pane content;
	@FXML
	private Button newGameButton;
	
	@FXML
	private Button settingsButton;
	
	@FXML
	private Button exitButton;
	
	public void newGameClicked() 
	{
		Stage primaryStage = new Stage();
		newGameButton.setOnAction(e -> {
			
	
		try {
		
		Parent root = FXMLLoader.load(getClass().getResource("GameWindow.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		} catch (Exception e1) {
			e1.printStackTrace();

		}
		});
	

}
}