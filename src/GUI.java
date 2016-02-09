
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends Applet implements ActionListener{
	TextField tf = new TextField(20);
	
	public GUI() {
		add(tf);
		tf.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = tf.getText();
		String sUp = s.toUpperCase();
		tf.setText(sUp);
		
		
	}
}
