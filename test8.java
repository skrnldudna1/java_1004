import java.util.Random;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        //배열의 모든 요소에 난수를 대입한 후 막대 그래프로 표시

        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = rand.nextInt(10);;

        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < n; j++)
                if (a[j] >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }

        for (int i = 0; i < 2 * n; i++)
            System.out.print('-');
        System.out.println();


        for (int i = 0; i < n; i++)
            System.out.print(i % 10 + " ");
        System.out.println();
    }

}
