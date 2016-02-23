import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//a more in-depth attempt at a dropdown
public class Dropdown{
	
	public static void main ( String[] args) throws FileNotFoundException{
	
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	      String[] names = ge.getAvailableFontFamilyNames();
      
	      for ( int i=0; i<names.length; i++ )
	    	      	  String input = (String) JOptionPane.showInputDialog(null, "Testing123...", JOptionPane.QUESTION_MESSAGE, null
	    			  
//	    			  names,
//	    			  names[1];
//	    	  System.out.println(input);
//	    	  
//	}	
}
