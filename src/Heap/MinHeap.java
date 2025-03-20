package Heap;

import java.util.Scanner;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE; // Sentinel value
    }

    // Get parent, left child, and right child indices
    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    // Check if a node is a leaf
    private boolean isLeaf(int pos) {
        return (pos > size / 2) && (pos <= size);
    }

    // Swap nodes
    private void swap(int fpos, int spos) {
        int temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }

    // Insert element into Min Heap
    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full");
            return;
        }
        heap[++size] = element;
        int current = size;

        // Heapify up (Move Up to maintain Min Heap)
        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Heapify Down to maintain Min Heap property
    private void minHeapify(int pos) {
        if (isLeaf(pos)) return;

        int left = leftChild(pos);
        int right = rightChild(pos);
        int smallest = pos;

        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != pos) {
            swap(pos, smallest);
            minHeapify(smallest);
        }
    }

    // Extract the minimum element
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int min = heap[1];
        heap[1] = heap[size--];
        minHeapify(1);
        return min;
    }

    // Print the heap
    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinHeap minHeap = new MinHeap(10);

        System.out.println("Enter 5 elements to insert into the Min Heap:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            minHeap.insert(num);
        }

        System.out.println("Min Heap:");
        minHeap.printHeap();

        System.out.println("Extract Min: " + minHeap.extractMin());
        System.out.println("Heap After Extraction:");
        minHeap.printHeap();
    }
}

