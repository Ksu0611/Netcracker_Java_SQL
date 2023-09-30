import java.util.Scanner;

public class task5 {
        public static void main(String[] args){
            System.out.println("Введите количество чисел");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int n0 = 1;
            int n1 = 1;
            int n2;
            System.out.print(n0+" "+n1+" ");
            for(int i = 3; i <= num; i++){
                n2=n0+n1;
                System.out.print(n2+" ");
                n0=n1;
                n1=n2;
            }
            System.out.println();
            in.close();
        }
}
