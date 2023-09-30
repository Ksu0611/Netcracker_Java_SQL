import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class task4 {

    /*функция для проверки является ли число простым*/
    static boolean checkNum(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите правую границу массива ");
        int k = in.nextInt();
        int counter3 = 0; // счётчик чисел кратных 3
        int counterp = 0; // счётчик простых чисел
        int[] array = new int[101];
        for (int i = 0; i < 100; i++){
            array[i] = (int)(Math.random()*k);
            if (array[i] % 3 == 0) {
                counter3++;
            }
            if (checkNum(array[i]) == true) {
                counterp++;
            }
        }
        System.out.println("Количество чисел кратных 3 =  " +counter3);
        System.out.println("Количество простых чисел =  " +counterp);
        System.out.println("Отсортированный массив: ");
        Arrays.sort(array); // сортируем массив

        /* вывод отсортированного массива */
        
        for(int r : array)
            System.out.print(" " +r);

        in.close();
        }
}
