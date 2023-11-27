package java_Basics;

import java.util.Arrays;

import javax.net.ssl.SSLEngineResult.Status;

public class B16_compare_two_Arrays {
	public static void compare2arrays1() {
		int[] a = {1,2,4,5,8,9,3,8};
		int[] b = {1,2,4,5,8,9,3,8};
		
		boolean status =  Arrays.equals(a, b);
		if(status == true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
	
	public static void compare2arrays2() {
		int[] a = {1,2,4,5,8,9,3,8};
		int[] b = {1,2,4,5,8,9,3,8};
		boolean status = true;
		if(a.length == b.length) {
			for(int i =0; i<=a.length-1;i++) {
				if(a[i]!=b[i]) {
					status = false;
				}	
			}
		}else {
			status = false;
		}
		if(status == true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare2arrays1();
		compare2arrays2();

	}

}
