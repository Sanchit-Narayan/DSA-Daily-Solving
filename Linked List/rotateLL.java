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

public class rotateLL {
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

    private static Node rotateKTimes(Node head, int k){
        if(head == null || head.next == null){
            return head;
        }
        
        Node tail = head;
        int length = 1;
        
        while(tail.next != null){
            length++;
            tail= tail.next;
        }
        
        if(k % length == 0){
            return head;
        }
        k = k % length;
        Node newLastNode = findLastNode(head, length - k);
        tail.next = head;
        head = newLastNode.next;
        newLastNode.next = null;
        
        return head;
    }
    
    private static Node findLastNode(Node temp, int N){
        int count = 1;
        while(temp != null){
            if(count == N){
                return temp;
            }
            count++;
            temp = temp.next;
        }
        
        return temp;
    }
    
    public static void main(String[] args){
        int[] arr1 = {10, 4, 10, 3, 5, 20, 10};
        Node head = convertArr2LL(arr1);
        head = rotateKTimes(head, 2);
        
        print(head);
    }
} 
