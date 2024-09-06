package notepad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class PrajwalNotepad implements ActionListener {
	
 JFrame window;
 
 //THIS IS FOR TEXT AREA 
 JTextArea textarea;
 JScrollPane scrollpane;
 boolean WordWrapOn=false;
 
//THIS IS FOR TOP MENUBAR
 JMenuBar menubar;
 JMenu filemenu,Editmenu,formatmenu,txtbold,colormenu;
 
 //THIS IS FOR FILE ITEMS
 JMenuItem inew,iopen,isave,isaveas,iexit;
 
 //This for Edit Menubar
 JMenuItem iundo,iredo;
 
 //THIS IS FOR FORMAT MENUBAR
 JMenuItem iwrap,ifontarial,ifontconstantina,ifonttimes,ifontsize12,ifontsize14,ifontsize16,ifontsize18,ifontsize20,ifontsize22,ifontsize24,ifontsize28,ifontsize32,ifontsize36,ifontsize40;
 JMenu ifont,ifontsize;
 
 //This is for color menu
 JMenuItem icolor1,icolor2,icolor3;
 
 Function_File file=new Function_File(this);
 Function_Format format=new Function_Format(this);
 Function_color color=new Function_color(this);
 Function_edit edit=new Function_edit(this);
 
 KeyHandeler_KeyShortcut key=new  KeyHandeler_KeyShortcut(this);
 
 UndoManager um=new UndoManager();

	public static void main(String[] args) {
		new PrajwalNotepad();

	}
	
	
public  PrajwalNotepad(){
	//calling constructor
	createwindow();
	create_Text_Area();
	createmenubar();
	createfileitems();
	createformat();
	createcolormenu();
	create_editmenu();
	//Default Settings Creating
	format.Selectedfont="Arial";
	format.createfont(24);
	format.WordWrap();
	
	//Default color
	color.setColor("Green");
	
	window.setVisible(true);
	
}


//Window ko lagi
public void createwindow() {
	window=new JFrame("Prazzol-Notepad");
	window.setSize(800,600);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

//Text Area ko lagi
public void create_Text_Area() {
	textarea=new JTextArea();
	textarea.addKeyListener(key);
	
	textarea.getDocument().addUndoableEditListener(
			new UndoableEditListener() {
				public void undoableEditHappened(UndoableEditEvent e) {
					um.addEdit(e.getEdit());
				}
				
			});
	
	//Scroll bar appears when needed
	scrollpane=new JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	scrollpane.setBorder(BorderFactory.createEmptyBorder());
	
	window.add(scrollpane);
	
	//(This will block scroll bar )window.add(textarea);
}

//menubarko lagi
public void createmenubar() {
	menubar=new JMenuBar();
	window.setJMenuBar(menubar);
	
	//To open File Alt +F
	filemenu=new JMenu("File");
	menubar.add(filemenu);
	
	Editmenu=new JMenu("Edit");
	menubar.add(Editmenu);
	
	formatmenu=new JMenu("Format");
	menubar.add(formatmenu);
	
	txtbold=new JMenu("Bold");
	txtbold.addActionListener(this);
	txtbold.setActionCommand("Bold");
	menubar.add(txtbold);
	
	colormenu=new JMenu("Color");
	menubar.add(colormenu);
	
	
}
//File vitrako Items haruko lagi
public void createfileitems() {
	inew=new JMenuItem("New");
	inew.addActionListener(this);
	inew.setActionCommand("New");
	filemenu.add(inew);
	
	iopen=new JMenuItem("Open");
	iopen.addActionListener(this);
	iopen.setActionCommand("Open");
	filemenu.add(iopen);
	
	isave=new JMenuItem("Save");
	isave.addActionListener(this);
	isave.setActionCommand("Save");
	filemenu.add(isave);
	
	isaveas=new JMenuItem("Save As");
	isaveas.addActionListener(this);
	isaveas.setActionCommand("Save As");
	filemenu.add(isaveas);
	
	iexit=new JMenuItem("Exit");
	iexit.addActionListener(this);
	iexit.setActionCommand("Exit");
	filemenu.add(iexit);
	
	
}


//Creating a format menu
public void createformat() {
	//word wrapko lagi
	iwrap=new JMenuItem("Word Wrap:off");
	iwrap.addActionListener(this);
	iwrap.setActionCommand("Word Wrap");
	formatmenu.add(iwrap);
	
	//font ko lagi
	ifont=new JMenu("Font");
	ifont.addActionListener(this);
	ifont.setActionCommand("Font");
	formatmenu.add(ifont);
	
	//fontformat ko lagi like arial etc...
	ifontarial=new JMenuItem("Arial");
	ifontarial.addActionListener(this);
	ifontarial.setActionCommand("Arial");
	ifont.add(ifontarial);
	
	ifontconstantina=new JMenuItem("Constantina");
	ifontconstantina.addActionListener(this);
	ifontconstantina.setActionCommand("Constantina");
	ifont.add(ifontconstantina);
	
	
	ifonttimes=new JMenuItem("Times New Roman");
	ifonttimes.addActionListener(this);
	ifonttimes.setActionCommand("Times New Roman");
	ifont.add(ifonttimes);
	
	
	
	
	//Font size ko lagi
	ifontsize=new JMenu("Font Size");
	ifontsize.addActionListener(this);
	ifont.setActionCommand("Font Size");
	formatmenu.add(ifontsize);
	
	
	ifontsize12=new JMenuItem("12");
	ifontsize12.addActionListener(this);
	ifontsize12.setActionCommand("12");
	ifontsize.add(ifontsize12);
	
	ifontsize14=new JMenuItem("14");
	ifontsize14.addActionListener(this);
	ifontsize14.setActionCommand("14");
	ifontsize.add(ifontsize14);
	
	ifontsize16=new JMenuItem("16");
	ifontsize16.addActionListener(this);
	ifontsize16.setActionCommand("16");
	ifontsize.add(ifontsize16);
	
	ifontsize18=new JMenuItem("18");
	ifontsize18.addActionListener(this);
	ifontsize18.setActionCommand("18");
	ifontsize.add(ifontsize18);
	
	ifontsize20=new JMenuItem("20");
	ifontsize20.addActionListener(this);
	ifontsize20.setActionCommand("20");
	ifontsize.add(ifontsize20);
	
	ifontsize22=new JMenuItem("22");
	ifontsize22.addActionListener(this);
	ifontsize22.setActionCommand("22");
	ifontsize.add(ifontsize22);
	
	ifontsize24=new JMenuItem("24");
	ifontsize24.addActionListener(this);
	ifontsize24.setActionCommand("24");
	ifontsize.add(ifontsize24);
	
	ifontsize28=new JMenuItem("28");
	ifontsize28.addActionListener(this);
	ifontsize28.setActionCommand("28");
	ifontsize.add(ifontsize28);
	
	ifontsize32=new JMenuItem("32");
	ifontsize32.addActionListener(this);
	ifontsize32.setActionCommand("32");
	ifontsize.add(ifontsize32);
	
	ifontsize36=new JMenuItem("36");
	ifontsize36.addActionListener(this);
	ifontsize36.setActionCommand("36");
	ifontsize.add(ifontsize36);
	
	ifontsize40=new JMenuItem("40");
	ifontsize40.addActionListener(this);
	ifontsize40.setActionCommand("40");
	ifontsize.add(ifontsize40);
	
}
public void createcolormenu() {
	//Colormenuko lagi
	icolor1=new JMenuItem("White");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("White");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Blue");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Blue");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Black");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Black");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Pink");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Pink");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Yellow");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Yellow");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Gray");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Gray");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Magenta");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Magenta");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Cyan");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Cyan");
	colormenu.add(icolor1);
	
	icolor1=new JMenuItem("Orange");
	icolor1.addActionListener(this);
	icolor1.setActionCommand("Orange");
	colormenu.add(icolor1);
	
	
	
}

//Edit menubarko lagi
public void create_editmenu() {
	iundo=new JMenuItem("Undo");
	iundo.addActionListener(this);
	iundo.setActionCommand("Undo");
	Editmenu.add(iundo);
	
	iredo=new JMenuItem("Redo");
	iredo.addActionListener(this);
	iredo.setActionCommand("Redo");
	Editmenu.add(iredo);
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String command =e.getActionCommand();
	
	switch(command) {
	case "New":file.newfile(); break;
	
	case "Open":file.openfile(); break;
	
	case "Save":file.save();break;
	
	case "Save As":file.saveAs();break;
	
	case "Exit":file.Exit();break;
	
	case "Word Wrap":format.WordWrap();break;
	
	case "Arial":format.setFont(command);break;
	
	case "Constantina":format.setFont(command);break;
	
	case "Times New Roman":format.setFont(command);break;
	
	case "12":format.createfont(12);break;
	
	case "14":format.createfont(14);break;
	
	case "16":format.createfont(16);break;
	
	case "18":format.createfont(18);break;
	
	case "20":format.createfont(20);break;
	
	case "22":format.createfont(22);break;
	
	case "24":format.createfont(24);break;
	
	case "28":format.createfont(28);break;
	
	case "32":format.createfont(32);break;
	
	case "36":format.createfont(36);break;
	
	case "40":format.createfont(40);break;
	
	case "Bold":format.TxtBold("Arial" ,12);break;
	
	case "White":color.setColor(command);break;
	
	case "Blue":color.setColor(command);break;
	
	case "Black":color.setColor(command);break;
	
	case "Pink":color.setColor(command);break;
	
	case "Yellow":color.setColor(command);break;
	
	case "Gray":color.setColor(command);break;
	
	case "Magenta":color.setColor(command);break;
	
	case "Cyan":color.setColor(command);break;
	
	case "Orange":color.setColor(command);break;
	
	case "Undo":edit.setUndo();break;
	
	case "Redo":edit.setRedo();break;
	
		
	}
}

}
