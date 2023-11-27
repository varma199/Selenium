package java_Basics;

public class A9_LargestNumOf3 {
	public static void larezstNum1(int x, int y, int z) {
		int a = x;
		int b= y;
		int c = z;
		
		if(a>b && a>c) {
			System.out.println("  a is largest number "+ a);
		}else if (b>a && b>c) {
			System.out.println("  b is largest number "+ b);
		}else {
			System.out.println("  c is largest number "+ c);
		}
	}
		
		public static void larezstNum2(int x, int y, int z) {
			int a = x;
			int b= y;
			int c = z;
			
			int k = a>b?a:b;
			int largest = k>c?k:c;
			System.out.println("largest number is :  "+largest);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		larezstNum1(500,900, 200);
		larezstNum2(100, 1000, 990);
	}

}
