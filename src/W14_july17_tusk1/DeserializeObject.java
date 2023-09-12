package W14_july17_tusk1;

/*
Необхідно здійснити десеріалізацію з файлу будь якого файлу(класу) та вивести на екран вміст.
*/

import java.io.*;

public class DeserializeObject {
    public static void main(String[] args) {

        MyObject obj = new MyObject("Ваше ім'я", 25);

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Svyatoslav\\Desktop\\itea\\java\\COURSES\\src\\W14_july17_tusk1\\data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(obj);

            out.close();
            fileOut.close();
            System.out.println("Об'єкт серіалізований та записаний до файлу.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



