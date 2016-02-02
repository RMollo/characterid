
import java.awt.*;
import java.applet.*;



public class AppWindow extends Applet {
	
	TextField t1, t2;
	public void init() {
		Label lblCharacter = new Label("Enter your character");
		
		TextField txtCharacter = new TextField("Character", 20);
		
	

		add(lblCharacter);                
		add(txtCharacter);                
		
	}

}
