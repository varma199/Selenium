package java_Basics;

import java.util.Scanner;

public class A1_Revers_Number {
	
	public static void revers_Num1() {
		System.out.println("-----------Method 1 -------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
		int rev = 0;
		while(num!= 0) {
			rev = rev*10 +num%10;
			
			num = num/10;
		}
		
		System.out.println("Revers Number : "+ rev);
		
		
	}

	public static void revers_Num2() {
		System.out.println("-----------Method 2 -------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
		int rev = 0;
		while(num!= 0) {//456
			
			int remainder = num%10; //rem = 6 //5 // 4
			rev = rev*10+remainder; // rev = 6 // 60+ 5 = 65// 650 + 4 = 654
			
			num = num/10; // 45  / 4/ 0
		}
		
		System.out.println("Revers Number2 : "+ rev);
		
		
	}
	
	public static void revers_Numm3() {
System.out.println("-----------Method 3 -------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		String str = String.valueOf(num);
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev_str = sb.reverse();
		
		System.out.println("Revers Number 3 :"+ rev_str);
		
	}
	
	public static void revers_Num4() {
		System.out.println("-----------Method 4 -------------------");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number:");
				int num = sc.nextInt();
				
				StringBuilder sbl = new StringBuilder();
				sbl.append(num);
				StringBuilder rev_str = sbl.reverse();
						
				System.out.println("Revers Number 3 :"+ rev_str);
				
			}


	public static void main(String[] args) {
		//revers_Num1();
		//revers_Num2();
		//revers_Numm3();
		revers_Num4();

	}

}
