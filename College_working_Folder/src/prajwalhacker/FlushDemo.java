package prajwalhacker;

import java.io.FileOutputStream;
public class FlushDemo {
	public static void main(String[] args) {
		FileOutputStream fo=null;
		int i;
		String name="can you spell your name?";
		try {
			fo=new FileOutputStream("D:\\Prazzol\\prazzol.txt");
			fo.write(name.getBytes());
			fo.flush();
			fo.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

