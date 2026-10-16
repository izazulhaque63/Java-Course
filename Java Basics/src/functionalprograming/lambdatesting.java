package functionalprograming;


public class lambdatesting {
    public static void main(String[] args) {
       lambdatesting lambda = new lambdatesting();
      int sum = lambda.sum(4,5);
      lambda.printstring("this is the best course");


      // toPrint -> system.out.println(toPrint);\
        // (a,b) -> a + b;
        // int sum = a+b;
        // (a,b) -> {
        // system.out.println(sum);
        // }


    }

    public void printstring(String toPrint){
        System.out.println(toPrint);
    }
    public int sum (int a, int b) {
        return a + b;
    }
}
