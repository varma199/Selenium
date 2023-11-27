package java_Basics;

public class A8_SumOfDigits_ofGivenNum {
	
	public static void sumofDigits() {
		int num =939485;
		
		int sum = 0;
		while(num>0) {
			int temp = num%10;
			sum = sum+temp;
			num = num/10;
		}
		
		System.out.println("Sum of digits : "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumofDigits();
	}

}
