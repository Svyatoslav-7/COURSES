package W14_july22_tusk3;

/*Змінити завдання №2 Усі можливі способи (які Ви знаєте) вирішити проблему взаємного блокування.*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread thread1 = new Thread(() -> {
            try {
                lock1.lock();
                System.out.println("Потік 1: Утримує lock1...");
                Thread.sleep(1000);
                System.out.println("Потік 1: Очікує lock2...");
                try {
                    lock2.lock();
                    System.out.println("Потік 1: Утримує lock1 і lock2.");
                } finally {
                    lock2.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                lock2.lock();
                System.out.println("Потік 2: Утримує lock2...");
                Thread.sleep(1000);
                System.out.println("Потік 2: Очікує lock1...");
                try {
                    lock1.lock();
                    System.out.println("Потік 2: Утримує lock2 і lock1.");
                } finally {
                    lock1.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock2.unlock();
            }
        });

        thread1.start();
        thread2.start();
    }
}

