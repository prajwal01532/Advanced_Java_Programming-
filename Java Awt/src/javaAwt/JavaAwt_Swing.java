package javaAwt;

import java.awt.*;
import javax.swing.*;



public class JavaAwt_Swing extends Frame{
	
		JFrame f=new JFrame();
			JButton b1,b2,b3,b4;

		public  JavaAwt_Swing() {
			f.setTitle("Border Layout");
			f.setLayout(new BorderLayout());
			JButton b1=new JButton("Button 1");
			JButton b2=new JButton("Button 2");
			JButton b3=new JButton("Button 3");
			JButton b4=new JButton("Button 4");
			f.add(b1,BorderLayout.CENTER);
			f.add(b2,BorderLayout.EAST);
			f.add(b3,BorderLayout.WEST);
			f.add(b4,BorderLayout.NORTH);
			f.setSize(200,200);
			f.setVisible(true);
		}
			public static void main(String[] args) {
				new JavaAwt_Swing();

			}

		}

