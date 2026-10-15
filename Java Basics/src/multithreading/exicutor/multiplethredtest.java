package multithreading.exicutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multiplethredtest {
    public static void main(String[] args) {
        //Executors.newSingleThreadExecutor();
        ExecutorService Service = Executors.newFixedThreadPool(3);
        printTask task1 = new printTask('*');
        printTask task2 = new printTask('#');
        printTask task3 = new printTask('&');

        Service.submit(task1);
        Service.submit(task2);
        Service.submit(task3);

        Service.shutdown();
    }
}


