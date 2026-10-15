package multithreading.threads.synchronize;

public class testingSynchornize{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        counter counter = new counter();
        updaterthread t1 = new updaterthread(counter);
        updaterthread t2 = new updaterthread(counter);

        try {
            t1.start();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("thread intrupted: " + e.getMessage());
        }
        long end = System.currentTimeMillis();
//        System.out.printf("final couter value: %d and time taken: %d",
//                (end - start));


    }

    }
