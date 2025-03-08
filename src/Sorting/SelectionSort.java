package Sorting;

public class SelectionSort {
    static void selectionSort(int arr[]) {
        int n = arr.length;  //store length of an array in n

        for (int i = 0; i < n - 1; i++) { // Outer loop for each position & this loop run up to n-2
            int minIndex = i;  // Assume the first element of the unsorted part is the minimum

            for (int j = i + 1; j < n; j++) {  // Inner loop to find the minimum element
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

