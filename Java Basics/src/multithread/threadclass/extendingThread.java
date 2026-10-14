package multithread.threadclass;

public class extendingThread {
    public static void main(String[] args) {

        long starttime = System.currentTimeMillis();
        firsttask t1  = new firsttask();
        secondTask t2  = new secondTask();
        thirdTask t3  = new thirdTask();

        System.out.println("\n starting first thread");
        t1.start();
        System.out.println("\n starting second thread");
        t2.start();
        System.out.println("\n starting third thread");
        t3.start();

        long endtime = System.currentTimeMillis();
        System.out.printf("%s total time taken: %d", Thread.currentThread().getName(), (endtime - starttime));
    }
}
