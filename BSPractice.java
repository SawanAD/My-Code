public class BSPractice {

    public static void main(String args[])
    {
        int[] arr = {-35,-24,-23,18,0,4,6,8,12,16,22,45};
        int search=0,ans;
        ans= searchitem(arr,search);
        if(ans==-1)
        {
            System.out.println("Number is not present in array");
        }
        else
        {
            System.out.println(ans);
        }
    }

    public static int searchitem(int[] arr, int search)
    {
        int start =0;
        int end = arr.length;
        int mid;
        while(start<=end)
        {
            mid = start + (end - start)/2;
            if(search>arr[mid])
            {
                start = mid + 1;
            }
            else if(search<arr[mid])
            {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
