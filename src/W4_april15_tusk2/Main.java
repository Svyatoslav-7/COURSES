package W4_april15_tusk2;

//Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B). Виведіть суму всіх чисел, які
//розташовані між цими числами на екран. Дано два числа A та B (A<B). Виведіть усі непарні значення, які
//розташовані між цими числами.

public class Main {

    public static void main(String[] args) {
        int a =4;
        int b=9;
        int res1=0;
        for(int i=a; i<=b; i++){
            res1+=i;
            System.out.println(res1);
        }

        System.out.println("second part");

        for(int i=a; i<b; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}
