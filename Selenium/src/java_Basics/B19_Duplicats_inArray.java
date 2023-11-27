package java_Basics;

public class B19_Duplicats_inArray {
	
	public static void duplicates() {
		String[] str = {"java", "c", "c++", "java", "ruby", "python", "c"};
		boolean flag = false;
		int dup_count = 0;
		String dup_value="";
		for(int i = 0; i<str.length; i++) {
			for(int j = i+1; j<str.length; j++) {
				if(str[i]==str[j] ) {
					System.out.println("found duplicate element: "+str[i]);
					flag = true;
					dup_count++;
					
					
				}
			}
			
		}
		
		if(flag == false) {
			System.out.println("No duplicate found");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates();
	}

}
