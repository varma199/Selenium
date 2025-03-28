package javaBasic_udayme;

public class Day5_Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome";
		
		int numOfChars = s.length();
		System.out.println("num of chars in given string   : "+ numOfChars);
		
		System.out.println(s.substring(1,3));
		//in sub string method we need to provide starting and ending index 
		// here we need to remember the starting index starts from '0' and ending index start form '1'

	}

}
