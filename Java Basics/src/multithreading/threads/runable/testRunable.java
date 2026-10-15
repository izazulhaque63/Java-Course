package multithreading.threads.runable;

public class testRunable {
    public static void main(String[] args) {
        printTask p1 = new printTask('*');
        printTask p2 = new printTask('#');
        printTask p3 = new printTask('$');

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        t1.start();
        t2.start();
        t3.start();
    }
}
