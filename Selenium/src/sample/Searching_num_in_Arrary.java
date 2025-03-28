package sample;

public class Searching_num_in_Arrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k[] = {10, 20,30, 40, 50, 60, 70, 80, 90, 100};
		int num_looking = 150;
		boolean num = false;
		for(int i : k) {
			if(i == num_looking) {
				System.out.println("number is available in the array "+ num_looking);
				num = true;
				break;
			}
		}
		
		if(num == false) {
			System.out.println("number is not availabel in the array");
		}

		
	}

}
