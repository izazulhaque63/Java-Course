package multithread.threadclass;

public class needofthread {
    public static void main(String[] args) {
        //first task
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task completed");

        //second task
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # task completed");


        //third task
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n # task completed");
    }
}
