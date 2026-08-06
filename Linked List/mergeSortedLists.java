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

public class mergeSortedLists {
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

    private static Node mergeSortedList(Node head1, Node head2){
        Node t1 = head1;
        Node t2 = head2;
        
        Node dNode = new Node(-1);
        Node temp = dNode;
        
        while(t1 != null && t2 != null){
            if(t1.data <= t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        
        if(t1 != null){
            temp.next = t1;
        }else{
            temp.next = t2;
        }
        
        return dNode.next;
    }
    
    public static void main(String[] args){
        int[] arr1 = {2, 4, 8, 10};
        int[] arr2 = {1, 2, 3, 6, 11, 14};
        Node head1 = convertArr2LL(arr1);
        Node head2 = convertArr2LL(arr2);
        head1 = mergeSortedList(head1, head2);
        
        print(head1);
    }
} 
