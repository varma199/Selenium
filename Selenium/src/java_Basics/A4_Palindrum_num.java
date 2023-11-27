package java_Basics;

import java.util.Scanner;

public class A4_Palindrum_num {
	
	public static void palindrum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		
		int num = sc.nextInt();
		
		int original_number = num;
		
		int rev_num = 0;
		while(num != 0) {
			int remainder = num%10;
			rev_num = rev_num*10+remainder;
			num= num/10;
		}
		
		
		System.out.println("revers number :  "+rev_num);
		if(original_number==rev_num) {
			System.out.println(rev_num+"  is a polindrum number");
		}else {
			System.out.println(rev_num+"  is not a polindrum number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrum();
	}

}
