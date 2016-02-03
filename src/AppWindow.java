import java.util.Scanner;
import java.awt.*;
import java.applet.*;






public class AppWindow extends Applet {
	
	TextField t1, t2;
	public void init() {
		Scanner in = new Scanner(System.in);
		Label lblCharacter = new Label("Enter your character");
		
		TextField txtCharacter = new TextField("Character", 20);
		
		
		
		
		


		add(lblCharacter);                
		add(txtCharacter);                
		
		char userChoice;
		userChoice = in.next().charAt(0);
		
		
	}

}
