package W14_july22_tusk1;

/*Затримка потоку.

Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),

Вивести - поток 'NAME' стартував - 'DateTime'

Коли поток закінчив роботу - поток 'NAME' фінішував - 'DateTime'

Коли всі ці потоки успішно відпрацюють – вивести на екран повідомлення

Всі потоки завершили роботу
*/

public class ThreadExample {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new MyRunnable("First"));
        Thread secondThread = new Thread(new MyRunnable("Second"));

        System.out.println("Починаємо виконання потоків.");

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Всі потоки завершили роботу.");
    }
}
class MyRunnable implements Runnable {
    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Потік '" + name + "' стартував - " + java.time.LocalDateTime.now());

        try {
            Thread.sleep(2000); // Затримка в 2 секунди (2000 мілісекунд)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Потік '" + name + "' фінішував - " + java.time.LocalDateTime.now());
    }
}

