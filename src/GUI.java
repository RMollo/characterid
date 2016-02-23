
import java.applet.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JButton;

import java.awt.event.*;
import javax.swing.*;


public class GUI extends Applet implements ActionListener{
{

	JFrame frame = new JFrame("Window");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	panel.add(button);
	
	TextField tf = new TextField(20);
	TextField tf2 = new TextField(20);
	
	add(tf);
	tf.addActionListener(this);
	add(tf2);
	tf2.addActionListener(this);

	Label lbltf = new Label("Enter your character");
	add(lbltf);
	String s = tf.getText();
	button.addActionListener(new Action());
	
}
	static class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
		
		public void actionPerformed (ActionEvent e) {
		
		
		
		 char[] chars = s.toCharArray();
	      StringBuffer hex = new StringBuffer();
	      for (int i = 0; i < chars.length; i++)
	      {
	         hex.append(Integer.toHexString((int) chars[i]));
	      }
	      tf2.setText(hex.toString());
	      
	      
	
	
		}

}