class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class deleteMiddleElement {
    private static Node convertArr2LL(int[] arr1) {
        Node head = new Node(arr1[0]);
        Node mover = head;

        for (int i = 1; i < arr1.length; i++) {
            Node temp = new Node(arr1[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    private static Node deleteMiddleNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node slow = head;
        Node fast = head;
        
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }
    
    public static void main(String[] args){
        int[] arr1 = {9, 1, 3, 2};
        Node head = convertArr2LL(arr1);
        head = deleteMiddleNode(head);
        
        print(head);
    }
} 
