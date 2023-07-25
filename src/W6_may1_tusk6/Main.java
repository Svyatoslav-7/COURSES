package W6_may1_tusk6;

//Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній. У третій масив внесіть результат додавання
//перших двох, використовуючи методи.

public class Main{

    public static void retMeth(int array1[][], int array2[][]) {
        int[][] array3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        retMeth(array1, array2);

    }
}
