// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double[][] a = new double[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        double[][] b = new double[][]
                {
                        {2, 2, 2},
                        {2, 2, 2},
                        {2, 2, 2}
                };
        Matrix A = new Matrix(a, 3, 3);
        Matrix B = new Matrix(b, 3, 3);
        System.out.println("Сложение матриц:");
        Matrix AplusB = A.add(B);
        AplusB.print();
        System.out.println("Умножение В на число 2:");
        Matrix Btimes2 = B.multiplyByScalar(2);
        Btimes2.print();

        }
    }
