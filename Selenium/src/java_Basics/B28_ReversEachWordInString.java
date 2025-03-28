package java_Basics;

public class B28_ReversEachWordInString {
	public static void reversString1() {
		// TODO Auto-generated method stub
				String str = "welcom to java";
				String[] s = str.split(" ");
				String reversString = "";
				for(String w : s) {
					String reversWord = "";
					for(int i = w.length()-1; i>=0; i--) {
						reversWord = reversWord+w.charAt(i);
					}
					reversString = reversString+reversWord+" ";
				}
				System.out.println("Revers String  :  "+reversString);

	}
	public static void reversString2() {
		String str = "welcom to java";
		String[] s = str.split(" ");
		String reversString = "";
		for(String w : s) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reversString = reversString+sb.toString()+ " ";
		}
		System.out.println("Revers String  :  "+reversString);
	}
	
	public static void revers_words_inString() {
		String str =  "Ravi Teja";
		String s[] = str.split(" ");
		String reves_words= "";
		for(String st : s) {
			reves_words = st+reves_words;
		}
		System.out.println("String afer reversing words --->"+ reves_words);
		
	}

	public static void main(String[] args) {
		reversString1();
		reversString2();
		revers_words_inString();
		
			}

}
