package Sorting;// Optimized java implementation of Bubble sort

class GFG {

    // An optimized version of Bubble Sort
    static void bubbleSort(int[] arr){
           int n =arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {   //runs n-1 times & ensuring all element are sorted
            swapped = false;  //Detect whether array is already sorted
            for (int j = 0; j < n - i - 1; j++) {  //compare and swap adjacent element
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  //If swap occured then mark
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)  //if no swap occured
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size){

        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
