package notepad;

import java.awt.Font;

public class Function_Format {

	PrajwalNotepad praz;
	Font arial,constantina,timesNewRoman;
	String Selectedfont;
	public Function_Format(PrajwalNotepad praz) {
		//this keyword is used
		this.praz=praz;
	}
	
	//word wrapping ko lagi
	public void WordWrap() {
		if(praz.WordWrapOn==false) {
			praz.WordWrapOn=true;
			praz.textarea.setLineWrap(true);
			praz.textarea.setWrapStyleWord(true);
			praz.iwrap.setText("Word Wrap:On");
		}
		else if(praz.WordWrapOn==true) {
			praz.WordWrapOn=false;
			praz.textarea.setLineWrap(false);
			praz.textarea.setWrapStyleWord(false);
			praz.iwrap.setText("Word Wrap:Off");
		}
	}
	
	//Font Style ko lagi
	public void createfont(int fontsize) {
		arial=new Font("Arial",Font.PLAIN,fontsize);
		
		constantina=new Font("Constantina",Font.PLAIN,fontsize);
		setFont(Selectedfont);
		
	timesNewRoman=new Font("Times New Roman",Font.PLAIN,fontsize);
		setFont(Selectedfont);
		
		
	}
	
	//set font
	public void setFont(String font) {
		Selectedfont=font;
		
		switch(Selectedfont) {
		
		case "Arial":
			praz.textarea.setFont(arial);
			break;
			
		case "Constantina":
			praz.textarea.setFont(constantina);
			break;
			
		case "Times New Roman":
			praz.textarea.setFont(timesNewRoman);
			break;
			
		}
	}
	public void TxtBold(String font, int fontSize) {
	    Selectedfont = font;
	    praz.textarea.setFont(new Font(Selectedfont, Font.BOLD, fontSize));
	}

}
