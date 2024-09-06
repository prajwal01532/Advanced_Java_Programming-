package prajwalhacker;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		try {
		FileOutputStream mcflo=new FileOutputStream("D:\\Prazzol\\prazzol.txt");
		String s="Hello! It's me Prajwal Pokhrel";
		char b[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			mcflo.write(b[i]);
			
		}
		mcflo.close();
		}
		finally {
		System.out.println("Sucess");
		}
		
		
		
	}

}
