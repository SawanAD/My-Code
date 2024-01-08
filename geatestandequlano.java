public class geatestandequlano {
    public static void main(String arg[])
    {
        int arr[] = {1,5,6,8,12,15,22,35,36,39,42};
        int target = 16;
        int ans = SearchNumber(arr, target);
        System.out.println(ans);
    }

    public static int SearchNumber(int []arr, int target)
    {
        int start =0, end= arr.length;

        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}