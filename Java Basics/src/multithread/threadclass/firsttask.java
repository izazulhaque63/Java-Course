package multithread.threadclass;

public class firsttask extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n %s * task completed",Thread.currentThread().getName());
    }
}
