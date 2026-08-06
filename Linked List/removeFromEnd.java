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

public class removeFromEnd {
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
    
    private static Node removeFromEndNode(Node head, int N){
        Node fast = head;
        for(int i = 0; i < N; i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }
        
        Node slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }
    
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        Node head = convertArr2LL(arr1);
        
        head = removeFromEndNode(head, 5);
        print(head);
    }
} 
