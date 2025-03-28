package java_Basics;

public class B26_OcceranceOfChars {
	
	public static void occerance1() {
String str = "Chittari Ravi Teja Varma";
		
		int withChar = str.length();
		
		String str2 = str.replace("a", "");
		int withOutChar = str2.length();
		
		int occerance = withChar-withOutChar;
		System.out.println("occarance of char : "+occerance);


	}
	
	public static void occeranceCar() {
		String str = "rav teja varma";
		int count = 0;
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
		 for(int i =0;i<=ch.length-1; i++) {
			 
			 if(c==ch[i]) {
				 count++;
			 }
		 }
		 System.out.println("character   "+ c+"  repeted  "+count+"   times");
		 count = 0;
		 
		}
		
	}

	public static void main(String[] args) {
		occeranceCar();
		
			}

}
