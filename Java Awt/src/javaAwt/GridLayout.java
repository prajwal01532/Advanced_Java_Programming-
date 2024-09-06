package javaAwt;
import java.awt.*;
import java.awt.event.*;
public class GridLayout extends WindowAdapter{

	Frame f;
	Button b1,b2,b3,b4;
	public GridLayout() {
		f=new Frame();
		f.addWindowListener(this);
		f.setTitle("Grid Layout");
		f.setSize(400,500);
		f.setLayout(new java.awt.GridLayout(0,3));
		b1=new Button("Button 1");
		b2=new Button("Button 2");
		b3=new Button("Button 3");
		b4=new Button("Button 4");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setVisible(true);
	}
	//closing window
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	public static void main(String[] args) {
		new GridLayout();
	}

}
