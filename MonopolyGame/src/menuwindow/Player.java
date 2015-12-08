package menuwindow;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Player 
{
String name;
int money;
int idCard;
@FXML
private ImageView player1;
@FXML
private ImageView player2;

public void movePlayer() 
{
	
}

public Player (String n, int m, int id)
{
	name=n;
	money=m;
	idCard=id;
}


}
