package multithreading.threads.synchronize;

public class updaterthread extends Thread {
    private final counter counter;

    public updaterthread(counter counter) {

        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
