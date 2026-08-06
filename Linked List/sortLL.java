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

public class sortLL {
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
    
    private static Node sortLLNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node zeroNode = new Node(-1);
        Node oneNode = new Node(-1);
        Node twoNode = new Node(-1);
        
        Node zero = zeroNode;
        Node one = oneNode;
        Node two = twoNode;
        
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }
            
            temp = temp.next;
        }
        
        if(oneNode.next == null){
            zero.next = twoNode.next;
        }else{
            zero.next = oneNode.next;
        }
        
        one.next = twoNode.next;
        two.next = null;
        
        return zeroNode.next;
    }
    
    public static void main(String[] args){
        int[] arr1 = {1, 0, 1, 2, 0, 2, 1};
        Node head = convertArr2LL(arr1);
        
        head = sortLLNode(head);
        print(head);
    }
} 
