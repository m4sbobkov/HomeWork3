package lesson3;

public class HomeWork {


    public static void main(String[] args) {

        doTask1(new int[]{0, 1, 1, 0, 0});
        doTask2();
        doTask3();
        doTask4();
        int array[] = doTask5(4, 1);
//        ***
        doTask6(new int[]{11, 22, 31, 14, 3, 5});

    }

    static void doTask1(int array01[]) {
        for (int i = 0; i < array01.length; i++) {
            if (array01[i] == 0)
                array01[i] = 1;
            else array01[i] = 0;
        }


    }

    static void doTask2() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            // Для проверки
            //    System.out.printf("[%s] => %s%n", i, arr[i]);
        }
    }

    static void doTask3() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            else arr[i] = arr[i];
            // Для проверки
            //    System.out.printf("[%s] => %s%n", i, arr[i]);
        }


    }

    static void doTask4() {
        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        drawMatrix(matrix);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix[i].length - 1)
                    matrix[i][j] = 1;
            }

        }
        drawMatrix(matrix);

    }

    static void drawMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[] doTask5(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void doTask6(int array[]) {
        int min = array[0], max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];

        }
        System.out.println("min = " + min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }
        System.out.println("max = " + max);

    }

}
