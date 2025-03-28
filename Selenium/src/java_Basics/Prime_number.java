package java_Basics;

public class Prime_number {
public static void primeOrNot(int n) {
int  num = n;
int counter =0;

if(num<=1) {
	System.out.println("provide valid number");
}
	for(int i = 1; i <= num; i++) {
		if(num %i == 0 ) {
			counter++;
		}
	}
	
	if(counter==2) {
		System.out.println(" given num is prime number"+num);
	} else {
		System.out.println(" given num is not prime number"+num);
	}
}
	
	public static void main(String[] args) {
		
		primeOrNot(2);
		primeOrNot(20);
	}
	
	

}
