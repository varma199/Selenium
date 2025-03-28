package automationClass;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class Java_Selection_Statments {
	
	public static void if_loop_Example(int num) {
		if(num>10) {
			System.out.println("Given number is Greater then 10 ; given number --->"+num);
		}
		
	}
	/* 50,000/-
	 * 
	 * i phone = 1,00,000/-
	 * samsung= 75,000/-
	 * Google = 50,000/-
	 * Redmi = 30,000/-
	 *  cost<= 5000
	 */
	
	public static void if_Else_Example(int num2) {
		if(num2>=35) {
			System.out.println("Given number is grater then 10; The given number ---->"+num2);
			System.out.println("Pass Marks");
		}else {
			System.out.println("Given number is less  then 100; The given number ---->"+num2);
			System.out.println("Fail Marks");
		}
	}
	
	public static void evenNumber(int num3) {
		if(num3>=2) {
		if(num3%2==0) {
			System.out.println("given number is even number   "+ num3);
		}else {
			System.out.println("given number is odd  number   "+num3);
		}
		}else {
			System.out.println("Please enter valid number");
		}
	}
	
	public static void nested_if_Example(int num4) {
		if(num4<10000) { //true
			if(num4<5000) { //true
				if(num4<1000) {// true
					if(num4==100) { //true
						System.out.println("given number is equal to 100");
					}
					
				}else {
					System.out.println("given number is not less then 5000");
				}
				
			}else {
				System.out.println("given number is not less then 5000");
			}
		}else {
			System.out.println("given number is not less then 10000");
		}
	}
	
	
	public static void switchCase_Example(int day) {
	 
        String dayName;

        switch(day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println(dayName);  // Output: Wednesday
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//note: we need call here ,  the required method to execute
		switchCase_Example(4);
			}

}
