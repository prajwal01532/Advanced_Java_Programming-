package notepad;

import java.awt.Color;

public class Function_color {
PrajwalNotepad praz;

//No void is used for creating a constructor
public Function_color(PrajwalNotepad praz) {
	this.praz=praz;
}

public void setColor(String color) {
	switch(color) {
	case "White":
		praz.window.getContentPane().setBackground(Color.white);
		praz.textarea.setBackground(Color.white);
		praz.textarea.setForeground(Color.black);
		break;
		
	case "Blue":
		praz.window.getContentPane().setBackground(Color.blue);
		praz.textarea.setBackground(Color.blue);
		praz.textarea.setForeground(Color.white);
		break;
		
		
		case "Black":
			praz.window.getContentPane().setBackground(Color.black);
			praz.textarea.setBackground(Color.black);
			praz.textarea.setForeground(Color.white);
			break;
			
			
			
		case "Green":
			praz.window.getContentPane().setBackground(Color.green);
			praz.textarea.setBackground(Color.green);
			praz.textarea.setForeground(Color.white);
			break;
			
		case "Yellow":
			praz.window.getContentPane().setBackground(Color.yellow);
			praz.textarea.setBackground(Color.yellow);
			praz.textarea.setForeground(Color.white);
			break;
			
			
		case "Gray":
			praz.window.getContentPane().setBackground(Color.GRAY);
			praz.textarea.setBackground(Color.GRAY);
			praz.textarea.setForeground(Color.white);
			break;
			
			
		case "Magenta":
			praz.window.getContentPane().setBackground(Color.magenta);
			praz.textarea.setBackground(Color.magenta);
			praz.textarea.setForeground(Color.white);
			break;
			
			
		case "Cyan":
			praz.window.getContentPane().setBackground(Color.CYAN);
			praz.textarea.setBackground(Color.CYAN);
			praz.textarea.setForeground(Color.white);
			break;
			
			
		case "Orange":
			praz.window.getContentPane().setBackground(Color.orange);
			praz.textarea.setBackground(Color.orange);
			praz.textarea.setForeground(Color.white);
			break;
			
				}
}
}
