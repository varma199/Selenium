package java_Basics;

public class B11_Check_given_Num_is_Prime_or_Not {
	
	public static void primeoOrNot() {
		int num = 97;
		int count = 0;
		
		if(num>1) {
			for(int i = 1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
				if(count>2) {
					System.out.println(num+ "is not prime number");
				}else {
					System.out.println(num+ "is prime number");
				}
			
			
		}else {
			System.out.println("Enter a number is grater then 1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeoOrNot();
	}

}
