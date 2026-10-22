package arrays.practice;

public class minNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,4,6,2,5};
        System.out.println("minmum number: " + smallest(numbers));
    }
    public static int smallest(int[] nums) {
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] < largest) {
               largest = nums[i];
           }
        }
        return largest;
    }
}
