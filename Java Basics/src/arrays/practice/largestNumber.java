package arrays.practice;

public class largestNumber {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,2,5};
        System.out.println("largest number: " + largest(numbers));
    }
    public static int largest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}



