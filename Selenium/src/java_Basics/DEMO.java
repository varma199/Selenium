package java_Basics;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Helloworld";
		
		String vow = str.replaceAll("(?i)[^aeiou]", "");
		String con = str.replaceAll("(?i)[aeiou]", "");
		
		System.out.println("volesl : "+ vow);
		
		System.out.println("constatns : "+ con);
		
		char[] vow2 = vow.toCharArray();
		System.out.println(vow2);
		int vow_size = vow2.length;
		
		char[] con2 = con.toCharArray();
		System.out.println(con2);
		int con_size = con2.length;
		
		int difference = con_size-vow_size;
		
		System.out.println("Operations required : "+ difference);
				
				
		
		
		
	}
}
