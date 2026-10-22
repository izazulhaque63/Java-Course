package arrays.practice;

public class linearSearch {
    public static int [] linearSer(int number[] , int key) {
       for (int i = 0; i < number.length; i++) {
           if (number[i] == key) {
               return number;
           }
       }
        return  null;
    }
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        int key = 10;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                System.out.println(number[i]);
//            }else  {
//                System.out.println(number[i]);
            }
        }

    }
}
