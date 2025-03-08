/*import java.util.LinkedList;

public class LinkedListBasic {
    //Singly linklist
    class Node{
        int data;
        Node next;
        //constructor to initilize node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class Linklist{
        Node head;
        //insert at the end
        public void insert (int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        //Display the list
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main (String[] args) {
            Linklist list = new LinkedList();
            list.insert (10);
            list.insert (20);
            list.insert (30);
            list.display();
        }
    }
    //    class Node {
//        int data;
//        Node next, prev;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = this.prev = null;
//        }
//    }
//
//    class DoublyLinkedList {
//        Node head;
//
//        // Insert at the end
//        public void insert(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//            newNode.prev = temp;
//        }
//
//        // Display the list
//        public void display() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + " <-> ");
//                temp = temp.next;
//            }
//            System.out.println("null");
//        }
//
//        public static void main(String[] args) {
//            DoublyLinkedList list = new DoublyLinkedList();
//            list.insert(10);
//            list.insert(20);
//            list.insert(30);
//            list.display(); // Output: 10 <-> 20 <-> 30 <-> null
//        }
//    }

//circular link list

//    class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    class CircularLinkedList {
//        Node head, tail;
//
//        // Insert at the end
//        public void insert(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = tail = newNode;
//                tail.next = head; // Circular link
//                return;
//            }
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head; // Maintain circular link
//        }
//
//        // Display the list
//        public void display() {
//            if (head == null) return;
//            Node temp = head;
//            do {
//                System.out.print(temp.data + " -> ");
//                temp = temp.next;
//            } while (temp != head);
//            System.out.println("(Back to head)");
//        }
//
//        public static void main(String[] args) {
//            CircularLinkedList list = new CircularLinkedList();
//            list.insert(10);
//            list.insert(20);
//            list.insert(30);
//            list.display(); // Output: 10 -> 20 -> 30 -> (Back to head)
//        }
//    }

}*/
