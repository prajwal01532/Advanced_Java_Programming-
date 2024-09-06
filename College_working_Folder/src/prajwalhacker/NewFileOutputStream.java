package prajwalhacker;

import java.io.FileOutputStream;
import java.io.IOException;
public class NewFileOutputStream {
	public static void main(String[] args) throws IOException{
		try {
		FileOutputStream fou=new FileOutputStream("D:\\Prazzol\\prazzol.txt");
		String so="Hello! Gaurab sie can you help me?";
		byte be[]=so.getBytes();
		fou.write(be);
		fou.close();
		System.out.println("success");
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
