package java_Basics;

import java.util.Arrays;
import java.util.Collections;

public class B23_Sorting {
	
	public static void sorting1() {
		int[] a = {20,40, 70,50,30,40,90,10,50,80,70,60};
		System.out.println("Befor soarting "+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("after soarting "+ Arrays.toString(a));
		}
	public static void sorting2() {
		int[] a = {20,30,40,90,10,50,80,70,60};
		System.out.println("Befor soarting "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after soarting "+ Arrays.toString(a));
		}
	
	public static void sorting3() {
		Integer[] a = {20,30,40,90,10,50,80,70,60,700,500,900,200,800};
		System.out.println("Befor soarting "+ Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("after soarting revers order "+ Arrays.toString(a));
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sorting1();
		sorting2();
		sorting3();
	}

}
