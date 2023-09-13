package W14_july22_tusk4;

import java.util.concurrent.TimeUnit;

public class Thread3 extends Thread {
    private Thread2 thread2;

    Thread3(Thread2 thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    wait(10000);
                    thread2.addId(-1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


