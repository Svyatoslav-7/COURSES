package W14_july22_tusk2;

/*Створити 2 класи. Реалізувати взаємне блокування цих класів*/

public class Main {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("Потік 1: Утримує lock1...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Потік 1: Очікує lock2...");
                    synchronized (lock2) {
                        System.out.println("Потік 1: Утримує lock1 і lock2.");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("Потік 2: Утримує lock2...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Потік 2: Очікує lock1...");
                    synchronized (lock1) {
                        System.out.println("Потік 2: Утримує lock2 і lock1.");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

