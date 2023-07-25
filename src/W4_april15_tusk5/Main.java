package W4_april15_tusk5;

//Дано два цілих числа A і B (A < B). Знайдіть суму всіх цілих чисел від A до B включно.

public class Main {

    public static void main(String[] args) {
        int a=5;
        int b=8;
        int res=0;

        for(int i =a; i<=b; i++){
            res+=i;
            System.out.println(res);
        }
    }
}
