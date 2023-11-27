package java_Basics;

public class A6_Digit_count {
	
	public static void Count() {
		int a = 15768;
		int count = 0;
		while(a>0) {
			a = a/10;
			count++;
		}
		
		System.out.println("Number of digits in given nuber :  "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count();
	}

}
