class ListNode{

    ListNode next;
    ListNode prev;
    int val;

    public ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class Deque {

    ListNode head;
    ListNode tail;

    public Deque() {
        this.head = new ListNode(-1);
        this.tail = new ListNode(-1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    public void append(int value) {
       ListNode newNode = new ListNode(value);
       ListNode lastNode = this.tail.prev;

       lastNode.next = newNode;
       newNode.prev = lastNode;
       this.tail.prev = newNode;
       newNode.next = this.tail;
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        ListNode nextNode = this.head.next;

        nextNode.prev = newNode;
        newNode.next = nextNode;
        this.head.next = newNode;
        newNode.prev = this.head;
    }

    public int pop() {
        if (isEmpty()){
            return -1;
        }
        ListNode target = this.tail.prev;
        ListNode lastNode = this.tail.prev.prev;

        lastNode.next = this.tail;
        this.tail.prev = lastNode;

        return target.val;
    }

    public int popleft() {
        if (isEmpty()){
            return -1;
        }
        ListNode target = this.head.next;
        ListNode nextNode = this.head.next.next;

        nextNode.prev = this.head;
        this.head.next = nextNode;

        return target.val;
    }
}
