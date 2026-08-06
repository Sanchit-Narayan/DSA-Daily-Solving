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

public class addTwoNumbers {
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
    
    private static Node addTwoNumbersNode(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null){
                sum = sum + temp1.data;
            }
            if(temp2 != null){
                sum = sum + temp2.data;
            }
            
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
            
            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp2 = temp2.next;
            }
        }
        
        if(carry != 0){
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        
        return dummyNode.next;
    }
    
    public static void main(String[] args){
        int[] arr1 = {2, 4, 6};
        int[] arr2 = {3, 8, 7};
        Node head1 = convertArr2LL(arr1);
        Node head2 = convertArr2LL(arr2);
        
        Node head = addTwoNumbersNode(head1, head2);
        print(head);
    }
} 
