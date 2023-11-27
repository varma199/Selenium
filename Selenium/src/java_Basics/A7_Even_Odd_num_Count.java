package java_Basics;

public class A7_Even_Odd_num_Count {
	
	public static void evenOddCount() {
		int num = 274854;
		
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int temp = num%10;
			if(temp%2==0) {
				System.out.println("this digit is Even "+temp);
				even_count++;
			}else {
				System.out.println("this digit is Odd "+temp);
				odd_count++;
			}
			num= num/10;
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Even digits count :   "+ even_count);
		System.out.println("Odd digits count :   "+ odd_count);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddCount();
	}

}
