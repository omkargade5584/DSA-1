package Sorting;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { // Start from the second element, first element is already consider as sorted
            int key = arr[i];  // The current element to be inserted
            int j = i - 1;

            // Shift elements of the sorted part to the right to find the correct position for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j--;
            }

            arr[j + 1] = key;  // Insert the key at the correct position
        }
    }

    public static void main(String args[]) {
        int arr[] = {200, 100, 900, 500, 700};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

