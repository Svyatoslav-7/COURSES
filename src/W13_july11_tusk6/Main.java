package W13_july11_tusk6;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world";

        if (str.length() % 2 != 0) {
            str += "⚓";
        }

        int mid = str.length() / 2;
        String firstHalf = str.substring(0, mid);
        String secondHalf = str.substring(mid);

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}
