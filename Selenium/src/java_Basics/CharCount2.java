package java_Basics;

public class CharCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String str = "aaammbbllccc"; // OUTPUT = 3a2b3c2l2m
		    StringBuilder op = new StringBuilder(); // Use StringBuilder for efficient concatenation
		    int[] freq = new int[20]; // Array to store frequency of characters

		    // Count frequency of each character
		    for (char c : str.toCharArray()) {
		        freq[c]++;
		    }

		    // Build the output string
		    for (char c : str.toCharArray()) {
		        if (freq[c] != 0) { // Process the character only if its count is non-zero
		            op.append(freq[c]).append(c);
		            freq[c] = 0; // Mark the character as processed
		        }
		    }

		    System.out.println("Output: " + op);
		}

	

}
