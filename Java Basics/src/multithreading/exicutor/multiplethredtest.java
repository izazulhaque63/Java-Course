package multithreading.exicutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multiplethredtest {
    public static void main(String[] args) throws InterruptedException {
        //Executors.newSingleThreadExecutor();
        ExecutorService Service = Executors.newFixedThreadPool(3);
        printTask task1 = new printTask('*');
        printTask task2 = new printTask('#');
        printTask task3 = new printTask('&');

        Service.submit(task1);
        Service.submit(task2);
        Service.submit(task3);

        Service.shutdown();
        System.out.println("\n*****1");

        if(!Service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\n*****2");
            Service.shutdownNow();
        }
    }
}


