package java_Basics;

public class CharCount {

	public static void main(String[] args) {
		String str = "aaammbbllccc"; //OUTPUT = 3a2b3c2l2m
		int count=0;
		String cc="";
		String op = "";
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			for(int i = 0; i<=ch.length-1; i++) {
				if(ch[i]==c) {
					count++;
						cc = String.valueOf(c);
					
				}
			}
			op= op+count+cc;
			cc= "";
			count=0;
		}
		
System.out.println("out put  :  "+ op);
	}
	
}
