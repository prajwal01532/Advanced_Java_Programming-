package notepad;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandeler_KeyShortcut implements KeyListener {
	PrajwalNotepad praz;
	  int colorIndex = 0;
	
public KeyHandeler_KeyShortcut(PrajwalNotepad praz) {
	this.praz=praz;
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
					
					//Shortcut key for color menu bar File i.e Alt+F
					if(e.isAltDown() && e.getKeyCode()==KeyEvent.VK_M) {
						
						 switch (colorIndex) {
	                     case 0:
	                       praz.color.setColor("Pink");
	                         break;
	                     case 1:
	                       praz.color.setColor("Blue");
	                         break;
	                     case 2:
	                        praz.color.setColor("Black");
	                         break;
	                         
	                     case 3:
		                        praz.color.setColor("Green");
		                         break;
		                         
	                     case 4:
		                        praz.color.setColor("Yellow");
		                         break;
		                         
		                         
	                     case 5:
		                        praz.color.setColor("Gray");
		                         break;
		                         
		                         
	                     case 6:
		                        praz.color.setColor("Magenta");
		                         break;
		                         
		                         
	                     case 7:
		                        praz.color.setColor("Cyan");
		                         break;
		                         
		                         
	                     case 8:
		                        praz.color.setColor("Orange");
		                         break;
		                      
	                 }
	                 // Update the color index for the next press
	                 colorIndex = (colorIndex + 1) % 9; // Cycle between 0, 1, and 2
	             }
				
				
		
		
		//Shortcut key for Opening menu bar File i.e Alt+F
		if(e.isAltDown() && e.getKeyCode()==KeyEvent.VK_F) {
			praz.filemenu.doClick();
		}
		
		
		//Shortcut key for New files i.e ctrl+N
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_N) {
					praz.file.newfile();
				}
		
		//Shortcut key for Opening Existing  files from computer i.e ctrl+O
				if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_O) {
					praz.file.openfile();
				}
		
				//Shortcut key for save As files i.e shift+ctrl+s
				if(e.isShiftDown() && e.isControlDown() && e.getKeyCode()==KeyEvent.VK_S) {
					praz.file.saveAs();
				}
				
		//Shortcut key for saving files i.e ctrl+s
		if(e.isControlDown() && e.getKeyCode()==KeyEvent.VK_S) {
			praz.file.save();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
