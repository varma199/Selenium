package java_Basics;

public class B24_Removing_junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "#$#90909#$%^6^^&^&%$# Java 8 selenium 3.12";
		str = str.replaceAll("[^0-9a-zA-Z.]", "");
		System.out.println(str);

	}

}
