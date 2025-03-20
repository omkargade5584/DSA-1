package Heap;

import java.util.Scanner;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {  //initilization
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];  //The heap array is initialized with maxSize + 1 to store elements starting from index 1 for easier calculations.
        heap[0] = Integer.MAX_VALUE; // Sentinel value ,heap[0] is set to Integer.MAX_VALUE for comparison purposes in Max Heap.
    }

    // Get the parent node index
    private int parent(int pos) {
        return pos / 2;
    }

    // Get left child node index
    private int leftChild(int pos) {
        return 2 * pos;
    }

    //Heapify Up is used by comparing the element with its parent using the parent() method.
    //If the inserted element is greater than its parent, a swap occurs until the Max Heap property is restored.
    // Get right child node index
    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    // Check if a node is a leaf node
    private boolean isLeaf(int pos) {
        return (pos > (size / 2) && pos <= size);
    }

    // Swap two nodes
    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    // Insert a new element
    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full");
            return;
        }
        heap[++size] = element;  //Element is inserted at the next available position (heap[++size]).
        int current = size;

        // Heapify (Move Up) if necessary
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
     //MaxHeapify (private void maxHeapify(int pos))
     //
     //This is called during extraction to maintain the heap property.
     //It compares the parent with its left and right children using leftChild() and rightChild().
     //The largest among the parent and children is placed at the parent node using a swap if necessary.
    // Heapify downwards to maintain the heap property
    private void maxHeapify(int pos) {
        if (isLeaf(pos))
            return;

        int left = leftChild(pos);
        int right = rightChild(pos);
        int largest = pos;

        if (left <= size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right <= size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != pos) {
            swap(pos, largest);
            maxHeapify(largest);
        }
    }
     //Extract Max (public int extractMax())
     //
     //The root (heap[1]) is the maximum element and is removed.
     //The last element is moved to the root and maxHeapify() is called to restore the Max Heap property.
    // Remove and return the maximum element
    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int max = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return max;
    }

    // Display the heap
    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxHeap maxHeap = new MaxHeap(10);

        System.out.println("Enter 5 elements to insert into the heap:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            maxHeap.insert(num);
        }

        System.out.println("Max Heap:");
        maxHeap.printHeap();

        System.out.println("Extract Max: " + maxHeap.extractMax());
        System.out.println("Heap After Extraction:");
        maxHeap.printHeap();
    }
}

