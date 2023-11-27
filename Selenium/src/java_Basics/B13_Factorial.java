package java_Basics;

public class B13_Factorial {
	
	public static void factorialOfNum(){
		int num = 10;
		
		long factorial = 1;
		for(int i = 1; i<=num; i++) {
			factorial = factorial*i;
		}
		
		System.out.println("fatorial of num "+ num+"is :  "+ factorial);
	}
	
	public static void factorialOfNum2(){
		int num = 10;
		
		long factorial = 1;
		for(int i = num; i>=1;i-- ) {
			factorial = factorial*i;
		}
		
		System.out.println("fatorial of num "+ num+"is :  "+ factorial);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialOfNum();
		factorialOfNum2();
	}

}
