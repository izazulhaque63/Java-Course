package multithreading.exicutor.future;

import java.util.concurrent.Callable;

public class fetchName implements Callable<String> {
    public fetchName(String name) {
        this.name = name;
    }

    private final String name;

    @Override
    public String call() throws Exception {
        System.out.printf("\n getting full name of %s from server", name);
        Thread.sleep(4000);
     return name + " bhartiya ";
    }
}
