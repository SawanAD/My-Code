import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialisation
        for(int i=0; i<4; i++)
        {
            list.add(new ArrayList<>());
        }

        // add element
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}