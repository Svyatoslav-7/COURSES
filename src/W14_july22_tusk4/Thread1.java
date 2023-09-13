package W14_july22_tusk4;import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Thread1 extends Thread {
    private static final String FILE_NAME = "result.txt";
    private Queue<Integer> idQueue = new LinkedList<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (this) {
                    while (idQueue.isEmpty()) {
                        wait();
                    }
                    int id = idQueue.poll();
                    String currentTime = dateFormat.format(new Date());
                    String result = "ID: " + id + " Date: " + currentTime + "\n";
                    writeToFile(result);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    synchronized void addId(int id) {
        idQueue.offer(id);
        notify();
    }
}