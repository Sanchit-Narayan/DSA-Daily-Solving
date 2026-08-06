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

public class checkPalindrome {
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

    
    private static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node newNode = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        
        return newNode;
    }
    
    private static boolean checkPalindromeLL(Node head){
        Node slow = head; 
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node newNode = reverseLL(slow.next);
        Node first = head;
        Node second = newNode;
        
        while(second != null){
            if(first.data != second.data){
                reverseLL(newNode);
                return false;
            }
            
            first = first.next;
            second = second.next;
        }
        reverseLL(newNode);
        return true;
    }
    
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 3, 2, 1};
        Node head = convertArr2LL(arr1);
        
        System.out.print(checkPalindromeLL(head));
    }
} 
