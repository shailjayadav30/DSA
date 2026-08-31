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

public class linkedList {
    private static Node convertArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            // System.out.println("value " + temp.data);
            System.out.println("value" + temp.data);
            temp = temp.next;
        }
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    private static Node deleteTail(Node head) {

        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        // Node prev=null;
        while (temp.next.next != null) {
            // System.out.println("value"+temp.data);
            // prev=temp;
            temp = temp.next;
        }

        // prev.next=null;
        temp.next = null;
        return head;

    }

    public static Node deleteKthElement(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteElementByValue(Node head, int value) {
        if (head == null) {
            return head;
        }
        if (head.data == value) {
            head = head.next;
            return head;
        }
        // int count = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            // count++;
            if (temp.data == value) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node InsertHead(Node head, int value) {
        return new Node(value, head);

    }

    public static Node InsertTail(Node head, int value) {
        if (head == null) {
            return new Node(value, null);
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value, null);
        temp.next = newNode;
        return head;

    }

    public static Node InsertKthPlace(Node head, int value, int pos) {
        if (head == null) {
            if (pos == 1) {
                return new Node(value, null);
            } else {
                return head;
            }
        }
        if (pos == 1) {
            return new Node(value, head);
        }
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            if (c == pos - 1) {
                Node newNode = new Node(value, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node InsertBeforeValue(Node head, int ele, int val) {
        if (head == null) {

            return null;
        }
        if (head.data==val) {
            return new Node(ele, head);
        }
        Node temp = head;
      
        while (temp.next != null) {
            
            if (temp.next.data==val) {
                Node newNode = new Node(ele, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node merge(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        Node dummy = new Node(-1, null);
        Node temp = dummy;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 45 };
        int arr2[] = { 1, 3, 4, 5 };

        // int arr[] = {};
        // Node y = new Node(arr[0]);
        // System.out.println(y.data);
        Node head = convertArr2LL(arr);

        // System.out.println(head.data);
        // traverse(head);
        // head = deleteHead(head);
        // head=deleteTail(head);
        // System.out.println("new head" + head);
        // head = deleteKthElement(head, 3);
        // head = deleteElementByValue(head, 3);
        // head = InsertHead(head, 10);
        // head = InsertTail(head, 10);
        // head = InsertKthPlace(head, 10, 4);
        // Node list1 = convertArr2LL(arr);
        // Node list2 = convertArr2LL(arr2);

        // head = merge(list1, list2);
        head = InsertBeforeValue(head, 22, 45);
         
        printLL(head);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// class Solution {
// public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
// ListNode temp1 = list1;
// ListNode temp2 = list2;
// ListNode prev1 = null;
// ListNode prev2 = null;
// ListNode newList=new ListNode();

// if (list1 == null & list2 == null) {
// return list1;
// }

// while (temp1 != null || temp2 != null) {
// if (temp1.val <= temp2.val) {
// newList.
// }
// }
// return newList;
// }
// }

// if (temp1.data <= temp2.data) {
// prev1 = temp1;
// // prev2 = temp2;
// temp1 = temp1.next;
// if (temp2.data < temp1.data) {
// prev2 = temp2;
// prev1.next = prev2;
// temp2=temp2.next;
// prev2.next=temp1;
// // prev1.next=temp1;
// // temp2 = temp2.next;
// prev1 = temp2;
// }