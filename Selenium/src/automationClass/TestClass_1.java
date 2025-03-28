package automationClass;

public class TestClass_1 {
	
	
	int val ;
	
	
	public  void addTwoNumbers() {
		System.out.println(" add method ");
		
		int a = 100;
		int b = 200;
		int  c = a+b;
		System.out.println("sum of a, b---->"+c);
	}
	
	
	
	public  void primitivDataTypes() {
		//100.1234567678
		
		
		char ch = 'c';
		System.out.println("char ch value--->"+ ch);
		
		String str = "Ravi";
		System.out.println("String str value---->"+str);
		
		
		
		
		
		
	}
	
	public static void demoStatic() {
		System.out.println("sttic method");
	}
	
	/*
	 * name 
	 * class
	 * fees
	 * 
	 * rank 
	 * marks
	 */

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TestClass_1 ts = new TestClass_1();
		
		System.out.println("in side main method");
		ts.addTwoNumbers();
		ts.primitivDataTypes();
		
		System.out.println("value of val varible"+ts.val);
		
		demoStatic();
		
		TestClass_1.demoStatic();
	}

}
