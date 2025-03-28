package sample;

public class Print_even_odd_from_array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k = {1,2,3,4,5,6,7,8,9,10};
		int[] even;
		
		for(int i = 0;i<=k.length; i++) {
			int temp = k[i];
			if(temp%2==0) {
				System.out.println(" Even number  :   "+ temp);
				
			}else {
				System.out.println("odd number :  "+temp  );
			}
		}
		

	}

}
