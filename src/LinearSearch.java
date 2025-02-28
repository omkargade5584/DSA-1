public class LinearSearch {
    public static int search(int[] arr, int N, int X)
    {
        for(int i = 0; i < N; i++){
            if(arr[i] ==X)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={ 2,3,4,10,40};
        int x =10;

        int result =search (arr, arr.length, x);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found" + result);
    }

}
