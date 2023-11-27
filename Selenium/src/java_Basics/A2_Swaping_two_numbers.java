package java_Basics;

public class A2_Swaping_two_numbers {
	
	public static void swapNumber1() {
		
		System.out.println("--------------------------method 1: with 3 variables-----------------------------");
		int a, b, c;
		a = 20;
		b = 40;
	System.out.println("a, b values before swaping  a value = "+ a+",   b value   = "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("a, b values after swaping  a value = "+ a+",   b value   = "+b);
	}
	
	 public static void swapNumber2() {
		 System.out.println("--------------------------Method 2: with 2 variables-----------------------------");
			int a, b;
			a = 20;
			b = 40;
			System.out.println("a, b values before swaping  a value = "+ a+",   b value   = "+b);
			a = a+b; //60
			b = a-b; //20
			a = a-b; // 40
			System.out.println("a, b values after swaping  a value = "+ a+",   b value   = "+b);
	 }
	 
	 public static void swapNumber3() {
		 System.out.println("--------------------------Method 3: with 2 variables-----------------------------");
			int a, b;
			a = 20;
			b = 40;
			System.out.println("a, b values before swaping  a value = "+ a+",   b value   = "+b);
			a = a*b; //800
			b = a/b; //20
			a = a/b; // 40
			System.out.println("a, b values after swaping  a value = "+ a+",   b value   = "+b);
	 }
	 
	 public static void swapNumber4() {
		 System.out.println("--------------------------Method 4: with XOR-----------------------------");
			int a, b;
			a = 20;
			b = 40;
			System.out.println("a, b values before swaping  a value = "+ a+",   b value   = "+b);
			a = a^b; //800
			b = a^b; //20
			a = a^b; // 40
			System.out.println("a, b values after swaping  a value = "+ a+",   b value   = "+b);
	 }
	 
	 public static void swapNumber5() {
		 System.out.println("--------------------------Method 5: Singel Statement-----------------------------");
			int a, b;
			a = 20;
			b = 40;
			System.out.println("a, b values before swaping  a value = "+ a+",   b value   = "+b);
			b = a+b-(a=b);
			System.out.println("a, b values after swaping  a value = "+ a+",   b value   = "+b);
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		swapNumber1();
		swapNumber2();
		swapNumber3();
		swapNumber4();
		swapNumber5();
		
		
		
	}

}
