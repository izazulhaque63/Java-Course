package multithreading.exicutor.future;

import java.util.concurrent.*;

public class returnfeature {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService Service = Executors.newFixedThreadPool(2);

        fetchName task1 = new fetchName("harshit");
        fetchName task2 = new fetchName("ansh");
        fetchName task3 = new fetchName("pandey");
        fetchName task4 = new fetchName("akshay");

        Future<String> name1 = Service.submit(task1);
        Future<String> name2 = Service.submit(task2);
        Future<String> name3 = Service.submit(task3);
        Future<String> name4 = Service.submit(task4);

        System.out.printf("\nfull name is: %s", name1.get());
        System.out.printf("\nfull name is: %s", name2.get());
        System.out.printf("\nfull name is: %s", name3.get());
        System.out.printf("\nfull name is: %s", name4.get());

        Service.shutdown();
//
//        Service.submit(new Callable<Object>() {
//        })
    }
}
