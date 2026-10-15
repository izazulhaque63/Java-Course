package multithreading.threads.threadclass;

public class secondTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s# task completed",Thread.currentThread().getName());
    }
}
