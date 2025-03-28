package sample;

public class FindOutMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] k = {1,3,4,5};
			int sum = 0;
			
			for(int i : k) {
				sum = sum+i;
			}
			System.out.println("sum of given numbers  :  "+ sum);
			int sum2 = 0;
			for(int j = 1; j<=5; j++) {
				sum2 = sum2+j;
			}
			System.out.println("sum of 1 to 5    : "+ sum2);
			int missing_num = sum2-sum;
			System.out.println("missing number  :  "+ missing_num);
	}

}
