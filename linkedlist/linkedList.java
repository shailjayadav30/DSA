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
        if (head.data == val) {
            return new Node(ele, head);
        }
        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == val) {
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

    public static Node AddReverseLL(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;
        while (t1 != null || t2 != null) {
            int sum = carry;
            if (t1 != null) {
                sum = sum + t1.data;
            }
            if (t2 != null) {
                sum = sum + t2.data;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }
        }
        if (carry >= 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        return dummy.next;
    }

    public static Node GroupEvenOdd(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static Node SortLL012(Node head) {
        Node temp = head;
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        while (temp != null) {
            if (temp.data == 0) {
                c0++;
            } else if (temp.data == 1) {
                c1++;
            } else {
                c2++;
            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (c0 > 0) {
                temp.data = 0;
                c0--;
            } else if (c1 > 0) {
                temp.data = 1;
                c1--;
            } else {
                temp.data = 2;
                c2--;
            }
            temp = temp.next;
        }
        return head;
    }

    // public static boolean Palindrome(Node head) {
    // Node temp = head;

    // }

    public static Node ArayTOLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;

    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static Node add1toLL(Node head) {
        Node newHead = reverse(head);
        Node temp = newHead;
        int carry = 1;
        while (temp != null && carry > 0) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            temp = temp.next;

        }
        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = newHead;
            newHead = newNode;
        }
        return reverse(newHead);
    }
  public static int addHelper(Node temp){
      if(temp==null) return 1;
      int carry=addHelper(temp.next);
      if( temp.data<10)return 0;
    //   temp.data=


  }
    public static Node add1ToLLRecursive(Node head) {

        return head;
    }

    public static void main(String[] args) {
        // int arr0[] = { 1, 3, 5, 45 };
        // int arr00[] = { 1, 3, 4, 5 };

        // int arr[] = {};
        // Node y = new Node(arr[0]);
        // System.out.println(y.data);
        // Node head = convertArr2LL(arr0);

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
        // head = InsertBeforeValue(head, 22, 45);
        // int arr1[] = { 3, 5 };
        // int arr2[] = { 4, 5, 9, 2, 7, 8 };
        // Node head1 = convertArr2LL(arr1);
        // Node head2 = convertArr2LL(arr2);
        // head = AddReverseLL(head1, head2);
        // head = GroupEvenOdd(head2);
        // head = SortLL012(head3);
        // System.out.println(Palindrome(head3));
        int arr3[] = { 9, 9, 9, 9 };
        Node head = convertArr2LL(arr3);
        head = add1toLL(head);
        printLL(head);
    }
}
