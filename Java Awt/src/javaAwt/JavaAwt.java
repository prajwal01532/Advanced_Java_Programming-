package javaAwt;
import java.awt.*;
import java.awt.event.*;
public class JavaAwt extends WindowAdapter{
Frame f;
	Button b1,b2,b3,b4;

public  JavaAwt() {
	f=new Frame();
	f.addWindowListener(this);
f.setTitle("Border Layout");
f.setSize(400,500);
	f.setLayout(new BorderLayout());
 b1=new Button("Button 1");
 b2=new Button("Button 2");
 b3=new Button("Button 3");
 b4=new Button("Button 4");
	f.add(b1,BorderLayout.CENTER);
	f.add(b2,BorderLayout.EAST);
    f.add(b3,BorderLayout.WEST);
   f.add(b4,BorderLayout.NORTH);
   
   
   f.setVisible(true);
}

//Closing Window in Awt 
public void windowClosing(WindowEvent e) {
	f.dispose();
}
	public static void main(String[] args) {
		new JavaAwt();

	}

}
