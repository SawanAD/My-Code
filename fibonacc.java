import java.util.Scanner;
import java.util.Arrays;

public class fibonacc {
    public static void main(String[] arg) {
        int a, i;
        int b = 0, c = 1, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter nth number to which you want fabonacci series");
        a = sc.nextInt();
        for (i = 0; i <= a; i++) {
            d = b + c;
            b = c;
            c = d;
            System.out.print(d + " ");
        }
        sort();
    }

    public static void sort() {
        int a, i = 0;
        Scanner ps = new Scanner(System.in);
        System.out.println(" Enter how many number you wanted to sort");
        a = ps.nextInt();
        int b[] = new int[a];
        System.out.println("Please enter numbers");
        Scanner sc = new Scanner(System.in);
        do {
            b[i] = sc.nextInt();
            i++;

        } while (i < a);

        Arrays.sort(b);

        for (i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}


