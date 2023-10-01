import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = in.nextInt();
        System.out.println("Введите b:");
        int b = in.nextInt();
        System.out.println("Введите c:");
        int c = in.nextInt();
        /*проверка на а == 0ы*/
        if (a == 0) {
            System.out.println("Это не квадратное уравнение!");
            System. exit(0);
        }
        QuadraticEquationSolver equationSolver = new QuadraticEquationSolver(a, b, c);
        equationSolver.showequation();
        equationSolver.solve();
    }
}

class QuadraticEquationSolver {
    private double a;
    private double b;               //коэффициенты уравнения
    private double c;

    public QuadraticEquationSolver(double a, double b, double c) {   //конструктор
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /*смотрим как выглядит наше уравнение*/
    public void showequation() {
        System.out.printf("%fx^2 + %fx + %f\n", a, b, c);
    }
    /*решаем*/
    public void solve() {
        DiscriminantCalculator calculator = new DiscriminantCalculator();
        double discriminant = calculator.calculateDiscriminant(a, b, c);
        /*три случая когда дискриминант принимает разные значения*/
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней в действительных числах.");
        }
    }
    /*вложенный класс для вычисления дискриминанта*/
     class DiscriminantCalculator {
        public double calculateDiscriminant(double a, double b, double c) {
            return b * b - 4 * a * c;
        }
    }


}
