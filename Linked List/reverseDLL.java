class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class reverseDLL {
    private static Node convert2DLL(int[] arr1){
        Node head = new Node(arr1[0]);
        Node prev = head;
        
        for(int i = 1; i < arr1.length; i++){
            Node newNode = new Node(arr1[i], null, prev);
            prev.next = newNode;
            prev = newNode;
        }
        
        return head;
    }
    
    private static void printDLL(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
    private static Node reverseDLLNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node prev = null;
        Node temp = head;
        
        while(temp != null){
            prev = temp.back;
            
            temp.back = temp.next;
            temp.next = prev;
            
            temp = temp.back;
        }
        
        return prev.back;
    }
    
    public static void main(String[] args){
        int[] arr1 = {12, 5, 6, 8};
        Node head = convert2DLL(arr1);
        
        head = reverseDLLNode(head);
        printDLL(head);
    }
} 
