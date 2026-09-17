package Loop;

public class continuee {
    public static void main(String[] args) {
        System.out.println("before loop");
        for (int i = 1; i <= 10; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }
}
