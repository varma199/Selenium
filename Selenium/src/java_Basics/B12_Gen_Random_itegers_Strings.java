package java_Basics;

import java.util.Random;

public class B12_Gen_Random_itegers_Strings {
	
	public static void random_int1() {
		Random rd = new Random();
		int two_digit = rd.nextInt(100);
		int three_digit = rd.nextInt(1000);
		System.out.println("2 digt Random num  :  "+ two_digit);
		System.out.println("3 digt Random num  :  "+ three_digit);
	}
	
	public static void random_decimel() {
		 	Random rd = new Random();
		 	double db = rd.nextDouble();
		 	float fr = rd.nextFloat();
		 	long lg = rd.nextLong();
		 	
		 	System.out.println("Random double  :  "+ db);
		 	System.out.println("Random flote  :  "+ fr);
		 	System.out.println("Random long  :  "+ lg);
	}
	public static void random_by_math()
	{
		System.out.println(Math.random());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random_int1();
		random_decimel();
		random_by_math();
	}

}
