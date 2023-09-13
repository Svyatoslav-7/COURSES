package W14_july22_tusk4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Thread2 extends Thread {
    private Thread1 thread1;
    private Queue<Integer> idQueue = new LinkedList<>();

    Thread2(Thread1 thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int id = random.nextInt(100); // Генеруємо випадковий id типу int
            addId(id);
            try {
                TimeUnit.SECONDS.sleep(2); // Чекаємо 2 секунди перед генерацією наступного id
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void addId(int id) {
        idQueue.add(id); // Замінено offer на add
    }

    synchronized int retrieveId() {
        if (!idQueue.isEmpty()) {
            return idQueue.remove(); // Замінено poll на remove
        }
        return -1;
    }
}