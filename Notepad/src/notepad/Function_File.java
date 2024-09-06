package notepad;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Function_File {
PrajwalNotepad praz;
String Filename;
String Fileaddress;
	
	public Function_File(PrajwalNotepad praz) {
		this.praz=praz;
	}
	
	//New Ko lagi Function 
	public void newfile() {
		praz.textarea.setText("");
		praz.window.setTitle("New");
		Filename=null;
		Fileaddress=null;
	}
	
	//Open Ko lagi Function 
		public void openfile() {
			FileDialog openn=new FileDialog(praz.window,"Open",FileDialog.LOAD);
	
			openn.setVisible(true);
			if(openn.getFile()!=null) {
				Filename=openn.getFile();
				Fileaddress=openn.getDirectory();
				
				praz.window.setTitle(Filename);
			}
			System.out.println("Opened File Name is " + Filename + "\n" +"File Address is:" + Fileaddress);
			//File ko contents show garna try and catch use gareko
			try {
				//We need  a address to read a file
				BufferedReader bf=new BufferedReader(new FileReader(Fileaddress+Filename));
				praz.textarea.setText("");
				String line=null;
				
				while((line=bf.readLine())!=null){
					praz.textarea.append(line + "\n");
					
				}
				bf.close();
				
			    }catch(Exception e) {
					System.out.println("File Not Opened!!");
				}
			
			
			
		}

		//How to save the file
		public void save() {
			if(Filename==null) {
				saveAs();
			}
			else {
				try {
					FileWriter fw=new FileWriter(Fileaddress+Filename);
					fw.write(praz.textarea.getText());
					fw.close();
					
				}catch(Exception e) {
					System.out.println("Something is wrong!!");
				}
			}
			
		}
		public void saveAs() {
			FileDialog fil=new FileDialog(praz.window,"Save",FileDialog.SAVE);
			fil.setVisible(true);
			
			if(fil.getFile()!=null) {
				Filename=fil.getFile();
				Fileaddress=fil.getDirectory();
				praz.window.setTitle(Filename);
				
			}
			//save using try and catch
			try {
				FileWriter fw=new FileWriter(Fileaddress+Filename);
				fw.write(praz.textarea.getText());
				fw.close();
				
			}catch(Exception e) {
				System.out.println("Something is wrong!!");
			}
		}
		
		//Exit Garney code
		public void Exit() {
			System.exit(0);
		}
		
}
