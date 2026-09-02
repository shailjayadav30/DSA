
class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

}

public class doublyLL {

    public static Node ArrayToLList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

        return head;
    }

    public static Node deleteKthElement(Node head, int k) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            if (c == k)
                break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        }

        else if (prev == null) {
            head = front;
            front.back = null;
            temp.next = null;
            return head;
        } else if (front == null) {
            prev = temp.back;
            temp.back = null;
            prev.next = null;
            return head;
        }

        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next = null;
        return head;

    }

    public static void deleteGivenNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;
        if (front == null) {
            prev.next = null;
            temp.back = null;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
    }

    public static Node InsertBeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    public static Node InsertBeforeTail(Node head, int val) {
        if (head.next == null) {
            return InsertBeforeHead(head, val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    public static Node InsertBeforeKthElement(Node head, int val, int k) {
        // inserting before head
        if (k == 1) {
            Node newNode = new Node(val, head, null);
            head.back = newNode;
            return newNode;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k)
                break;

            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    public static void InsertBeforeKthNode(Node temp, int value) {
        if (temp == null)
            return;

        Node prev = temp.back;
        Node newNode = new Node(value, temp, prev);
        prev.next = newNode;
        temp.back = newNode;

    }

    public static Node InsertAfterHead(Node head, int value) {
        if (head == null)
            return null;
        if (head.next == null) {
            Node newNode = new Node(value, null, head);
            head.next = newNode;
            return head;
        }
        Node front = head.next;
        Node newNode = new Node(value, front, head);
        head.next = newNode;
        front.back = newNode;
        return head;
    }

    public static Node InsertAfterTail(Node head, int value) {
        if (head == null)
            return null;
        if (head.next == null) {
            Node newNode = new Node(value, null, head);
            head.next = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value, null, temp);
        temp.next = newNode;
        return head;
    }

    public static Node InsertAfterKthElement(Node head, int k, int val) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        Node front = temp.next;
        Node newNode = new Node(val, front, temp);
        temp.next = newNode;
        if (front != null) {
            front.back = newNode;
        }
        return head;
    }

    public static void InsertAfterKthNode(Node temp, int val) {
        Node front = temp.next;
        Node newNode = new Node(val, front, temp);
        temp.next = newNode;
        if (front != null) {
            front.back = newNode;
        }
    }

    public static Node ReverseDoublyLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        while (curr != null) {
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;
            curr = curr.back;
        }
        return prev.back;
    }



    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5 };
        Node head = ArrayToLList(arr);
        // deleteGivenNode(head.next.next);
        // head = InsertBeforeHead(head, 8);
        // head = InsertBeforeTail(head, 8);
        // head = InsertBeforeKthElement(head, 8, 4);
        // InsertBeforeKthNode(head.next.next.next, 20);
        // head = InsertAfterTail(head, 10);
        // head = InsertAfterKthElement(head, 4, 30);
        // InsertAfterKthNode(head.next.next.next, 30);
        head = ReverseDoublyLL(head);

        printLL(head);

    }
}
