package multithreading.threads.synchronize;

public class counter {
    private int count = 1;

    public synchronized void increment() {

        count++;
    }

    public int getCount() {

        return count;
    }

}
