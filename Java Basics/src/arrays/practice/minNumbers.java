package arrays.practice;

public class minNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,2,5};
        System.out.println("largest number: " + minimum(numbers));
    }
    public static int minimum(int[] nums) {
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}
