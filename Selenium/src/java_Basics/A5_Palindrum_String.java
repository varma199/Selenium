package java_Basics;

import java.util.Scanner;

public class A5_Palindrum_String {
	
	public static void str_Palindrum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String:  ");
		String str = sc.next();
		
		String original_str = str;
		
		String rev_str = "";
		int length = str.length();
		
		for(int i = length-1; i>=0; i--) {
			rev_str= rev_str+str.charAt(i);
		}
		System.out.println("Revers String :   "+ rev_str);
		if(rev_str.equals(rev_str)) {
			System.out.println(original_str+ " is Palindrum");
		}else {
			System.out.println(original_str+ " is not Palindrum");
		}
		
		
	}
	

	public static void main(String[] args) {
		str_Palindrum();

	}

}
