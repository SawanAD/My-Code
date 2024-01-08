import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearchString {
    public static void main(String[] args)
    {
        String name = "Sawan";
        char target ='y';
        //System.out.println(Find(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search(name,target));

    }
    /*static boolean Find(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for(int i=0; i<str.length(); i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;

    }*/

    static boolean Search(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for(char ch : str.toCharArray())
        {
            if(ch== target)
            {
                return true;

            }
        }
       return false;
    }
}

