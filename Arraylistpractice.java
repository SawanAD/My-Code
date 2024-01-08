import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistpractice {

    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        Scanner in = new Scanner(System.in);
        do
        {
            list.add(in.nextInt());
            i++;
        } while(i<10);

        System.out.println(list);
        System.out.println(list.get(7));
        list.set(2, 45);
        System.out.println(list);
    }
}
