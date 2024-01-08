import java.util.Scanner;

public class primenotprime {
    public static void main(String[] arg) {
        int a, i, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than 2 ");
        a = sc.nextInt();
        for (i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(a + " is not a Prime Number");
        }
        else
            System.out.println(a + " is a Prime Number");

    }
}
