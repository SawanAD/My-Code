import java.util.Arrays;

public class SwapandreverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 58, 46, 15};
        swap(arr, 0, 4);
        System.out.println("Swapped array "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Aarray "+ Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2)
    {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr)
    {
        int start=0, end= arr.length-1;
        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
