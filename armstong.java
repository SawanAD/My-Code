import java.util.Scanner;

public class armstong {
    public static void main(String[] arg) {
       int a, b, c = 0, d;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number to check weather it's a Armstrong no. or not ");
        a = sc.nextInt();
        int e = a;
        do {

            b = e % 10;
            c = c + (b * b * b);
            d = e / 10;
            e = d;
        } while (d > 0);

        if (c == a) {
            temp = 1;
        } else
            temp = 0;
        if (temp == 1)
            System.out.println(a + " is an Armstrong Number");
        else
            System.out.println(a + " is not an Armstrong Number");

        /*
        int a;
        Scanner sc = new Scanner(System.in);
       /*System.out.println("Please Enter a number to check weather it's a Armstrong no. or not ");
        a = sc.nextInt();

        for (int i = 0; i < 100000; i++)
        {
            if(isArmstrong(i)){
                System.out.println(i + "");
            }

        }
        */
        System.out.println( isArmstrong(a));
    }

    static boolean isArmstrong(int a)
    {
        int temp = a;
        int sum =0;
        while(a>0)
        {
            int rem;
            rem = a%10;
            a= a/10;
            sum += rem*rem*rem;
        }
        return sum==temp;

        }



}

