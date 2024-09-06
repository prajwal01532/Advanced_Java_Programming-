package prajwalhacker;
import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {
JTextField t;
JLabel l;
	public SwingFrame(){
		setSize(400,400);
		setTitle("Swing Title");
		setLayout(null);
		//for label
		l=new JLabel("Name:");
		l.setBounds(100,70,100,20);
		add(l);
		
		//for text
		
		t=new JTextField("My name");
		t.setBounds(100,100,150,20);
		add(t);
		setVisible(true);
	}
	public static void main(String[] args) {
	 new SwingFrame();

	}

}
