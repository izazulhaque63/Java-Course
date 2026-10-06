package method;

public class returnstatment {
    public static void main(String[] args) {
//        int sum = addTwoNumbers(5,5);
//         System.out.println(sum);


//        int subtraction = subtract(5,5,8);
//        System.out.println(subtraction);




//        int multipalication = multiplication(5,5);
//        System.out.println(multipalication);





//        System.out.println("division is : "  + (Divide(5.5,16.4)));


        System.out.println(addnumbers(2,2));
        System.out.println(addnumbers(3,4));
        System.out.println(addnumbers(2,3,5));
        System.out.println(addnumbers(2,3,5,6));

    }


//    public static int addTwoNumbers(int first, int second){
//        int sum = first + second;
//        return sum;
//    }


//    public static int subtract(int first, int second, int third){
//        int finalSubtraction = first - second - third;
//        return finalSubtraction;
 //   }




//    public static int multiplication(int first, int second){
//        return first * second;

 //   }




//    public static double Divide(double first, double second){
//        return first / second;
 //   }



    public  static int addnumbers(int a, int b){
        return a+b;
    }
    public  static int addnumbers(int a, int b, int c){
        return a+b+c;
    }
    public  static int addnumbers(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
