package java_Basics;

public class B14_SumOfArray {
	
	public static void arraySum() {
		int[] a = {4, 8, 9, 7, 6, 7, 3};
		
		int sum = 0;
		for(int i = 0; i<=a.length-1;i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of arrays elements : "+ sum);
	}
	
	public static void arraySum1() {
		int[] a = {4, 8, 9, 7, 6, 7, 3, 8,25,67};
		int sum = 0;
		for(int value : a) {
			sum = sum + value;
		}
		System.out.println("Sum of arrays elements : "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraySum();
		arraySum1();
	}

}
