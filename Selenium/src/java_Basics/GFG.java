package java_Basics;

import java.util.Arrays;


	// Java program to remove duplicate character
	// from character array and print in sorted
	// order
	
	
public class GFG {
		static String removeDuplicate(char str[], int n)
		{
			// Used as index in the modified string
			int index = 0;

			// Traverse through all characters
			for (int i = 0; i < n; i++)
			{

				// Check if str[i] is present before it 
				int j;
				for (j = 0; j < i; j++) 
				{
					if (str[i] == str[j])
					{
						break;
					}
				}

				// If not present, then add it to
				// result.
				if (j == i) 
				{
					str[index++] = str[i];
				}
			}
			return String.valueOf(Arrays.copyOf(str, index));
		}

		// Driver code
		public static void main(String[] args)
		{
			String given_sting = "Ravitejavarma";
			char str[] = given_sting.toCharArray();
			int n = str.length;
			System.out.println(removeDuplicate(str, n));
		}
	}

	// This code is contributed by Rajput-Ji



