package thread;
public class YeildEx {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + ": " + i);

            // Use yield to give a hint to the scheduler that the thread is willing to yield
            Thread.yield();
        }
    }
}
