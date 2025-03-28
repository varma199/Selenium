package sample;

public class Sum_of_Arrays {
	public static void main(String[] args) {
		
		int a[]  = {100, 140, 250, 360, 470, 580,};
		
		int sum = 0;
		
		for(int i = 0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("Sum of given array   :   "+ sum);
	}
}
