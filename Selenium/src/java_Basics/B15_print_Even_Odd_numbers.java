package java_Basics;

import java.util.ArrayList;

public class B15_print_Even_Odd_numbers {
	
	public static void printEevenOddNum() {
		int[] a = {12,15,69,85,75,52,42,62,85};
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer>  odd = new ArrayList<Integer>();
		for(int value : a) {
			if(value%2 == 0) {
			even.add(value);
			}else {
				odd.add(value);
			}			
		}
		System.out.println("Even values form array"+ even);
		System.out.println("odd values form array"+ odd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEevenOddNum();
	}

}
