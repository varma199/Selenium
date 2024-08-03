package java_Basics2;

import java.util.ArrayList;

public class Simple_ArrayList {
	
	
	public static void addStringElementsIn_ArrayList() {
		ArrayList<String> name =  new ArrayList<String>();
		
		
		name.add("Ravi");
		name.add("Teja");
		name.add("Varma");
		
		System.out.println("name is : "+ name);
	}
	
	public static void addStringElement_with_index() {
		ArrayList<String> name2 = new ArrayList<String>();
		name2.add(0, "Chittari");
		name2.add(1, "Ravi");
		
		name2.add(2, "teja");
		name2.add(3, "Varma");
		
	
		System.out.println("name is    "+ name2 );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addStringElementsIn_ArrayList();
		
		addStringElement_with_index();
	}

}
