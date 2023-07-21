package java_Basics;

public class FirstFor {
	
	public  void numbedrs() {
	//first 20 numbers
		for(int i= 1;i<=20;i++) {
			System.out.println(" i valuse  ="+i);
		}
	}
	
	public static void evenNumbers() {
		System.out.println("Static Method");
		//Even numbers form 0 to 20
		for(int j = 2; j<=20; j++) {
			
			if(j%2==0) {
				System.out.println("Even Number  :  "+j);
			}else {
				System.out.println("odd number");
			}
		}
	}

	public static void numbers() {
		System.out.println("Static Method");
		for (int g =200;g>=100;g-- ) {
			if(g%2==1) {
				System.out.println("0dd number="+g);
			}else {
				System.out.println("fghjk");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FirstFor.evenNumbers();
		System.out.println("main  method executed");
		//FirstFor hyu = new FirstFor();
		FirstFor.numbers();
		//hyu.numbedrs();

		
		
		
	}
		
	
		
	}


