package java_Basics;

public class B26_OcceranceOfChars {

	public static void main(String[] args) {
		
		
		String str = "Chittari Ravi Teja Varma";
		
		int withChar = str.length();
		
		String str2 = str.replace("a", "");
		int withOutChar = str2.length();
		
		int occerance = withChar-withOutChar;
		System.out.println("occarance of char : "+occerance);

	}

}
