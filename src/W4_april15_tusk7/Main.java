package W4_april15_tusk7;

//Створіть програму таблиці множення для числа 7, використовуючи цикли. Приклад виведення в консоль:

//7 * 1 = 7;
//7 * 2 = 14;
//…;
//7 * 10 = 70.

public class Main {

    public static void main(String[] args) {
        int num=7;

        for(int i=0; i<=10; i++){
            int res=0;
            res=i*num;
            System.out.println(num+"*"+i+"="+res);
        }
    }
}
