package Searching;

public class BinarySearch {
    int binarySearch(int[] arr, int X)
    {
        int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == X)
            return mid;

        if (arr[mid] < X)
            low = mid + 1;

        else
            high = mid - 1;
    }
    return -1;

    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = { 2, 3,4,10, 40};
        int x =10;
        int result=bs.binarySearch(arr,x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found" + result);
    }
}
