import java.util.LinkedList;

public class CustomLinkedList {

//    LinkedList
    Node head;
    int size;

    CustomLinkedList() {
        this.size = 0;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }


    public void add(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            size++;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = n;
        size++;

    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void delete(int val){
        Node current = head;
        while (current != null) {
            if(current.val ==val){
               current.val =current.next.val;
               current.next=current.next.next;
               size--;
               return;
            }
            current = current.next;
        }
        System.out.println("cannot delete as the element doesnot exist in the linkedlist");
    }

//    1 ->2 ->3 ->4 ->5 ->6 ->7
//
//      reverse a linkedlist
    public void reverse(){
        if(head==null){
            return;
        }
       Node current = head;
       Node n =null;
       while(current!=null){
           Node top = n;
           n= new Node(current.val);
           n.next= top;
           current = current.next;
       }
       head=n;
    }
}
