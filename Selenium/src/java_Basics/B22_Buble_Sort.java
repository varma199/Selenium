package java_Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B22_Buble_Sort {
	public static void sort1() {
		int[] a = {4,2,5,1,3,};
		
		System.out.println("Array befor soarting : "+ Arrays.toString(a));
		
		int size = a.length;
		for(int i =0; i<size-1; i++) {
			for(int j=0;j<size-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array after soarting : "+ Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort1();
	}

}
