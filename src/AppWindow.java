
import java.awt.*;
import java.applet.*;
import javax.swing.*;


public class AppWindow extends Applet {
	
	TextField t1, t2;
	public void init() {
		Label lblCharacter = new Label("Enter your character");
		
		TextField txtCharacter = new TextField("Character", 20);
		
		
		Label lblHex = new Label("Hex");
		TextField txtHex = new TextField("Hex", -10);
		String CharChoice = txtCharacter.getText();

		add(lblCharacter);                
		add(txtCharacter);                
		
	}

}
