package java_Basics;

public class B10Fibonacci_series {
	
	public static void febonacci_series() {
	int n1 = 0;
	int n2 = 1;
	System.out.println("Febonacci Series 1 number : "+n1);
	System.out.println("Febonacci Series 2 number : "+n2);
	
	int sum  = 0;
	
	for(int i = 3; i<=10; i++) {
		sum = n1+n2;
		System.out.println("Febonacci Series"+i+" number : "+sum);
		n1 = n2;
		n2 = sum;
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		febonacci_series();
	}

}
