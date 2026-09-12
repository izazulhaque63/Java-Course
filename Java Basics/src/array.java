import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("welcome to array");
//        int[] myarray = new int[5];
//        myarray[0] = 98;
//        myarray[1] = 94;
//        myarray[2] = 93;
//        myarray[3] = 95;
//        myarray[4] = 96;

//        System.out.println(myarray[0]);
//        System.out.println(myarray[1]);
//        System.out.println(myarray[2]);
//        System.out.println(myarray[3]);
//        System.out.println(myarray[4]);



//        int[] myarray = {98, 94, 93, 95,96};
//
//        System.out.println(myarray[0]);
//        System.out.println(myarray[1]);
//        System.out.println(myarray[2]);
//        System.out.println(myarray[3]);
//        System.out.println(myarray[4]);


//        int[] myarray = {98, 94, 93, 95,96};
//        int index = 2;
//        System.out.println(myarray[0]);
//        System.out.println(myarray[1]);
//        System.out.println(myarray[index]);
//        System.out.println(myarray[3]);
//        System.out.println(myarray[4]);


//        int[] myarray = {91, 92, 93, 94,95};
//        int index = 0;
//        while (index < 5){
//            System.out.println(myarray[index]);
//            index++;
//        }
//        int[] marks = new int[4];
//        System.out.println(marks.length);

//        int [] array = {2, 3 ,25, 28, 21};
//        System.out.println(array.length);
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[3]);



//        int[] myArray = new int[3];
//        myArray[0] = 9;
//        myArray[1] = 3;
//        myArray[2] = 6;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println(Arrays.toString(myArray));

//        int [] array = {2, 3 ,25, 28, 21};
//        int index = 0;
//        while(index < array.length){
//            System.out.println(index);
//            index++;
 //       }





//                Scanner input = new Scanner(System.in);
//
//                int[] numbers = new int[5];
//
//                for (int i = 0; i < numbers.length; i++) {
//                    System.out.print("Element " + i + " enter करें: ");
//                    numbers[i] = input.nextInt();
//                }
//
//                System.out.println("Array के elements:");
//
//                for (int number : numbers) {
//                    System.out.println(number);
//                }
//
//                input.close();


        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        int i = 0;
        System.out.println("print 4 elements array");
        while(i < arr.length){
            System.out.println("enter element at index " + i + ":");
            arr[i] = input.nextInt();
            i++;
        }
        i = 0;
        System.out.println("array element are ");
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;
        }






//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter your number");
//        int n = input.nextInt();
//        int i = 1;
//        int sum = 0;
//        while (i <= n){
//            sum = sum + i;
//            i++;
//            //System.out.println("your total sum is "+ sum);
//        }
//        System.out.println("your total sum is "+ sum);
//            }
//        }




