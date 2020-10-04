package client;

import java.util.Scanner;

public class MatrixMultiplection {

    int rowA = 0;
    int columnA = 0;
    int rowB = 0;
    int columnB = 0;

    int matrixA[][] = new int[rowA][columnA];
    int matrixB[][] = new int[rowB][columnB];

    int m = 0;
    int n = 0;
    int o = 0;
    int[][] res = new int[m][n];

    public void fill() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter row length matrixA: ");
        rowA = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        System.out.println("Enter column length matrixA: ");
        columnA = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        matrixA = new int[rowA][columnA]; // Создаём массив int размером в size
        System.out.println("Insert matrixA elements:");

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                matrixA[i][j] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
        }



        System.out.println("Enter row length matrixB: ");
        rowB = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        if (rowB != columnA) {
            while (rowB != columnA) {
                System.out.println("Ошибка: невозможно выполнить умножение матриц — количество столбцов матрицы A должно совпадать с количеством строк матрицы B");
                System.out.println("Enter row length matrixB: ");
                rowB = input.nextInt();
            }
        } else {
            System.out.println("Вы дурак");
        }
        System.out.println("Enter column length matrixB: ");
        columnB = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        matrixB = new int[rowB][columnB]; // Создаём массив int размером в size
        System.out.println("Insert matrixB elements:");

        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                matrixB[i][j] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
        }

        System.out.println("Inserted matrixB elements:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------");
        multiplication();
    }

    public void multiplication() {

        m = matrixA.length;
        n = matrixB[0].length;
        o = matrixB.length;
        res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        printMatrix();
    }

    public void printMatrix() {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int[][] mA =
//                {{33, 34, 12},
//                        {33, 19, 10},
//                        {12, 14, 17},
//                        {84, 24, 51},
//                        {43, 71, 21}};
//
//        int[][] mB =
//                {{10, 11, 34, 55},
//                        {33, 45, 17, 81},
//                        {45, 63, 12, 16}};
//
//
//        int m = mA.length;
//        int n = mB[0].length;
//        int o = mB.length;
//        int[][] res = new int[m][n];
//

//
//        for (int i = 0; i < res.length; i++) {
//            for (int j = 0; j < res[0].length; j++) {
//                System.out.format("%6d ", res[i][j]);
//            }
//            System.out.println();
//        }
//    }


        MatrixMultiplection matrixMultiplection = new MatrixMultiplection();
        matrixMultiplection.fill();


    }
}
