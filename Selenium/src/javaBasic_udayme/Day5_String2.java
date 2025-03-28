package javaBasic_udayme;

import java.util.Scanner;

public class Day5_String2 {
	
	//verifyng the string present in the array or not
	public static void searching_String_in_Array() {
		String[] citys = {"Hyderabad", "Vijayavada", "Amaravathi", "Bengulur", "Chinnai"};
		
		String city = "Hyderabad";
		boolean b = false;
		for(String c : citys) {
			if( c.equals(city)) {
				b = true;
			}
		}
		
		if(b==true) {
			System.out.println(city +"  :  is available in the array list");
		}else {
			System.out.println(city +"  :   is not available in the array list");
		}
	}
	
	//Reveres string 
	public static void revers_string1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
			
		}
		System.out.println("after revers  :  "+ rev);
	}

	public static void revers_String2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2nd string");
		String str = sc.nextLine();
		String rev = "";
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1; i>=0;i--) {
			rev = rev+ch[i];
		}
		System.out.println("after revers String 2   :  "+ rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		searching_String_in_Array();
//		revers_string1();
		revers_String2();
	}

}
