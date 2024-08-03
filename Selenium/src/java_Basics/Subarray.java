package java_Basics;
public class Subarray
{
public static int maxSubArraySum(int[] nums)
{
int maxSum = nums[0];
int currentSum = nums[0];
for (int i = 1; i < nums.length; i++)
{
 currentSum = Math.max(nums[i], currentSum + nums[i]);
maxSum = Math.max(maxSum, currentSum);
}
return maxSum;
}
public static void main(String[] args) {
int[] array = {1, -2, 3, 4, -1, 2, 1, -5, 4};
System.out.println("Largest subarray sum: " + maxSubArraySum(array));
}
}
