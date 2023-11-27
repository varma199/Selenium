package sample;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Day111623 {
	
	public static void Fibonacci_Series() {
		// 0 1  1 2 3 5 8 13 21 ...
		
		int n1 = 0;
		int n2 = 1;
		ArrayList< Integer> se = new ArrayList<Integer>();
		
		for(int i = 0; i<=6; i++) {
			int temp = n1 +n2;
			n1 = n2;
			n2 =  temp;
			se.add(temp);
		}
		System.out.println(se);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci_Series();
	}

}
