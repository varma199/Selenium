package java_Basics;

public class B18_Find_Max_Min_inArray {
	public static void max_min_Num() {
		int a[] = {12,45,32,98,74,36,25,85,75};
		
		int max = a[0];
		
		for(int i = 0; i<=a.length-1; i++) {
			if(a[i]>max) {
				a[0] = a[i];
			}
		}
		
		System.out.println("maximum number of array is :   "+ a[0]);
		
		int min = a[0];
		for(int i = 0; i<=a.length-1; i++) {
			if(a[i]<min) {
				a[0] = a[i];
			}
		}
		System.out.println("nimimum number of array is :   "+ a[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_min_Num();
	}

}
