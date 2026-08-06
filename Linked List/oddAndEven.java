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

public class oddAndEven {
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
    
    private static Node evenAndOdd(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        return head;
    }
    
    public static void main(String[] args){
        int[] arr1 = {2, 4, 6, 8, 12};
        Node head = convertArr2LL(arr1);
        
        head = evenAndOdd(head);
        print(head);
    }
} 
