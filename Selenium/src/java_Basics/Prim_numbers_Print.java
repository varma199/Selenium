package java_Basics;

import java.util.ArrayList;
import java.util.List;

public class Prim_numbers_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int num = 0;
		
		String str = "";
		List<String> prime_num = new ArrayList<String>();
		
		for(i = 1; i<=100;i++) {
			int counter = 0;
			for(num = i; num>=1; num-- ) {
				if(i%num == 0) {
					counter = counter + 1;
				}
			}
			if(counter==2) {
				str = str +i +" ";
				System.out.println("prime number :"+i);
				
			}
		}
		//System.out.println("prime number up to 100");
	//	System.out.println(str);
	}
	
	

}
