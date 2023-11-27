package java_Basics;

public class B20_findNum_Array {
	
	public static void find_num_in_Array() {
		int[] a = {14,25,65,85,74,12,45,78,96,73,92,71};
		int req_element = 1000;
		boolean flag = true;
		for(int i = 0; i<a.length-1; i++) {
			int tem = a[i];
			if(tem == req_element) {
				System.out.println("required element is present in the array");
				flag = false;
				break;
				
			}
		}
		if(flag == true) {
			System.out.println("required element is not  present in the array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_num_in_Array();
	}

}
