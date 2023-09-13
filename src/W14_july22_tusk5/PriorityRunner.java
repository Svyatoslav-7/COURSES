package W14_july22_tusk5;

/*Демонстрація пріоритетів.

Створити 2 класи PriorityRunner та PriorityThread.

Запустити 3 потоки із пріоритетами (min, max, norm).

За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.*/

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread minPriorityThread = new PriorityThread("Min Priority Thread");
        PriorityThread maxPriorityThread = new PriorityThread("Max Priority Thread");
        PriorityThread normPriorityThread = new PriorityThread("Normal Priority Thread");

        minPriorityThread.setPriority(Thread.MIN_PRIORITY); // Встановлюємо мінімальний пріоритет (1)
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY); // Встановлюємо максимальний пріоритет (10)

        minPriorityThread.start();
        maxPriorityThread.start();
        normPriorityThread.start();
    }
}

