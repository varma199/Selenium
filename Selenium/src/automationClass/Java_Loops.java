package automationClass;import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Java_Loops {
	
	/*
	 * What is a Loop?
		A loop in programming is a control flow statement
		that allows code to be executed repeatedly based on a condition.
		It automates repetitive tasks.
		
		Advantages:
		Avoid the repetition
		Increase Efficiency
		Flexibility and Readability
		

	 */
	
	/*
	 * While loop
	 * 
	 * 
	 * Do While loop
	 * for Loop
	 * Enhanced for Loop
	 * Pifalls of loop
	 */
	
	//while loop
	public static void while_Loop_Example() {
		System.out.println("-----------------While loop Expample--------------------");
		int wh = 1;
		
		while(wh<=10){
			System.out.println("value of ' wh' is --->:"+wh);
			wh++; 
		}
		System.out.println("value of ' wh' is --->:"+wh);
	}
	
	public static void while_loop_Example2() {
		System.out.println("-----------------While loop Expample 2 --------------------");
		int a = 20;
		while(a>=10) {
			System.out.println("value of ' a' is --->:"+ a);
			a--;
		}
		System.out.println("value of ' a' after loop --->:"+ a);
	}
	
	public static void do_while_loop_example() {
		System.out.println("-----------------Do - While loop Expample --------------------");
		int a = 1;
		do {
				System.out.println("Value of 'a' is ---> "+a);
				a++;
				
		} while (a<=10);
		System.out.println("Value of 'a' atere do while loop ---> "+a);
	}

	
	
	public static void do_while_loop_Example2() {
		System.out.println("-----------------Do - While loop Expample 2 --------------------");
		int a = 30;
		int k = 0;
		do {
			System.out.println("Value of 'a' is ---> "+a);
			a--;
			k++;
		}while(a>=10);
		System.out.println("Value of 'a' atere do while loop ---> "+a);
		System.out.println("Value of 'k' atere do while loop ---> "+k);
	}
	
	public static void for_loop_Example() {
		System.out.println("-----------------For loop Expample--------------------");
		int a = 0;
		for( a= 0;a<=10; a++) {
			System.out.println("Value of 'a' is ---> "+a);
		}
		System.out.println("Value of 'a' after loop ---> "+a);
	}
	
	public static void enhance_For_loop_Example() {

		System.out.println("-----------------Ehanced For loop Expample--------------------");
		//String topice[] = {"Manual testing", "Automation Testing", "Selenium", "core java", "XL operations", "frame works"};
		String languages[] = {"Egnlish", "Tamil", "kannada", "Telugu", "Hindi", "Telugu", "malayalam", "Marati", "Telugu", "Gujarthi"};
		int  telugu_language = 0;
		for(String language:languages) {
			System.out.println("topics to cover under testing----->"+language);
			if(language.equals("Gujarthi")) {
				System.out.println("Telugu languag is available");
				telugu_language++;
				
			}
		}
		System.out.println(telugu_language+" tims telugu language is available");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while_Loop_Example();
		//while_loop_Example2();
		//do_while_loop_example();
		//do_while_loop_Example2();
		//for_loop_Example();
		enhance_For_loop_Example();

	}

}
