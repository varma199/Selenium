package java_Basics;

public class A3_Revers_String {

	
	
	public static void revers_String1() {
		System.out.println("-------------------Method 1 -----------------");
		System.out.println("-------------------By using logic -----------------");
		String str = "Varma";
		String rev = "";
		int length = str.length(); // if it is String we need to use length() method 
		for(int i = length-1; i>=0; i--) {
			rev = rev+str.charAt(i);
			}
		
		System.out.println("Revers String : "+ rev);
	}
	
	public static void revers_String2() {
		System.out.println("-------------------Method 2 -----------------");
		System.out.println("-------------------By using char [] -----------------");
		String str = "CRTV";
		char[] ch = str.toCharArray(); // if it is char arry ----> we need to use .length to know size
		
		String rev = "";
		int length = ch.length;
		for(int i = length-1; i>=0; i--) {
			rev = rev+ch[i];
			}
		
		System.out.println("Revers String : "+ rev);
	}
	
	public static void revers_String3() {
		System.out.println("-------------------Method 3 -----------------");
		System.out.println("-------------------By using String buffer class -----------------");
		String str = "CRTV";
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println("Revers String : "+ rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revers_String1();
		revers_String2();
		revers_String3();
	}

}
