package java_Basics;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B29_Read_data_from_TextFile {
	
	public static void readData1() throws Throwable {
		FileReader fi = new FileReader("C:\\Users\\ravit\\Desktop\\CRTV\\Text1.txt");
		BufferedReader br = new BufferedReader(fi);
		
		String str ;
		str = br.readLine();
		
			System.out.println(str);
			br.close();
		
		
		
	}
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		readData1();
	}

}
