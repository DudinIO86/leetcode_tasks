/*
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list: 10 -> 20 -> 30
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;
        // Traversing the linked list and printing the values
        System.out.println("Linked List:");
        ListNode current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        // Output: 10 20 30
        // Adding a new node: 15 -> 20 -> 30
        ListNode newNode = new ListNode(15);
        newNode.next = node2;
        node1.next = newNode;
        // Traversing the updated linked list
        System.out.println("Updated Linked List:");
        current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        // Output: 10 15 20 30  
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode (int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
