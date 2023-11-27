package java_Basics;

public class B25_RemoveUnwantedSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "selenium       with      core        java";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
