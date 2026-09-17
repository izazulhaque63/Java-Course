package Loop;

public class breakk {
    public static void main(String[] args) {
        System.out.println("before loop");
        for (int i = 1; i <= 20; i++){
            if (i == 11){
                break;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }
}
