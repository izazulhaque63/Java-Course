package multithreading.threads.threadclass;

public class thirdTask extends Thread {
    @Override
    public void run() {
        //third task
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n %s # task completed", Thread.currentThread().getName());

    }
}
