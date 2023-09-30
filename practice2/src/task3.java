import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Input number1: "); //ввод с клавиатуры
        int num1 = in.nextInt();
        System.out.print("Input number1: ");
        int num2 = in.nextInt();
        System.out.print("Input number1: ");
        int num3 = in.nextInt();
        double avg = (((double)num1 + (double)num2 + (double)num3) / 3); //считаем среднее арифметическое
        System.out.println("Average = "+ avg);

        int maxnum = 0;
        if(num1>=num2 && num1>=num3) {          //ищем максимальное
            maxnum = num1;
        }
        else if(num2>=num1 && num2>=num3) {
            maxnum = num2;
        } else {
            maxnum = num3;
        }
        System.out.println("max number = "+ maxnum);
        in.close();
        }
    }
