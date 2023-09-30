import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Создаем двумерный массив для хранения треугольника Паскаля
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }

        // Заполняем треугольник Паскаля
        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Выводим треугольник Паскаля
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}