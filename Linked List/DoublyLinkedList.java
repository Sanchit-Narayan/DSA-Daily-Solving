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

public class DoublyLinkedList {
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
    
    private static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        
        Node prev = head;
        head = head.next;
        
        head.back = null;
        prev.next = null;
         
        return head;
    }
    
    private static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }
    
    private static Node deleteKElement(Node head, int k){
        if(head == null){
            return null;
        }
        
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == k){
                break;
            }
            temp = temp.next;
        }
        
        Node prev = temp.back;
        Node front = temp.next;
        
        if(prev == null && front == null){
            return null;
        }else if(prev == null){
            return deleteHead(head);
        }else if(front == null){
            return deleteTail(head);
        }
        
        prev.next = front;
        front.back = prev;
        
        temp.next = null;
        temp.back = null;
        
        return head;
    }
    
    private static void deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;
        
        if(front == null){
            prev.next = null;
            temp.back = null;
            
            return;
        }
        
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
    }
    
    private static Node insertBeforeHead(Node head, int val){
        Node newNode = new Node(val, head, null);
        head.back = newNode;
        
        return newNode;
    }
    
    private static Node insertBeforeTail(Node head, int val){
        if(head.next == null){
            return insertBeforeHead(head, val);
        }
        
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        
        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        
        return head;
    }
    
    private static int calculateLength(Node head){
        int lengthDLL = 0;
        while(head != null){
            lengthDLL++;
            head = head.next;
        }
        
        return lengthDLL;
    }
    
    private static Node insertBeforeKElement(Node head, int k, int val){
        int lengthDLL = calculateLength(head);
        if(k == 1){
            return insertBeforeHead(head, val);
        }else if(k == lengthDLL){
            return insertBeforeTail(head, val);
        }
        
        Node temp = head;
        int count = 0;
        while(temp.next != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next; 
        }
        
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        
        return head;
    }
    
    private static void insertBeforeNode(Node node, int val){
            Node prev = node.back;
            Node newNode = new Node(val, node, prev);
            prev.next = newNode;
            node.back = newNode;
    }
    
    public static void main(String[] args){
        int[] arr1 = {12, 5, 6, 8};
        Node head = convert2DLL(arr1);
        
        insertBeforeNode(head.next, 100);
        printDLL(head);
    }
} 
