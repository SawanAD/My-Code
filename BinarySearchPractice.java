public class BinarySearchPractice {

    public static void main(String args[])
    {
        int[] arr = {-7,0,1,5,6,15,16,19,21,23,24};
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    public static int binarysearch(int []arr, int target)
    {
        int start =0, end= arr.length;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
