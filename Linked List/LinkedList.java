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

public class LinkedList {
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

    private static int lengthLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node removeHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    private static int checkPresence(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;

    }

    private static Node removeK(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    private static Node removebyEl(Node head, int value) {
        if (head == null) {
            return head;
        }
        if (head.data == value) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == value) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    private static Node insertAtHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    private static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;

        return head;
    }

    private static Node insertAtPosition(Node head, int el, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(el);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new Node(el, head);
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == (k - 1)) {
                Node newNode = new Node(el);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertbeforeValue(Node head, int el, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            return new Node(el, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newNode = new Node(el);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr1 = { 12, 5, 6, 8 };
        Node head = convertArr2LL(arr1);
        head = insertbeforeValue(head, 17, 6);
        print(head);
    }
}