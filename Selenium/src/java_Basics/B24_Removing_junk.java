package java_Basics;

public class B24_Removing_junk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str = "#$#90909#$%^6^^&^&%$# Java 8 selenium 3.12";
		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);*/

		
		String st2 = "Testing123@#$ Testing";
		st2 = st2.replaceAll("[^a-zA-Z]", "");
		System.out.println(st2);
	}

}
