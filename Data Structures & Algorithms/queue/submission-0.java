class ListNode{
    int val;
    ListNode next;
    ListNode prev;

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
        newNode.next = this.tail;
        this.tail.prev = newNode;
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        ListNode nextNode = this.head.next;

        nextNode.prev = newNode;
        newNode.next = nextNode;
        newNode.prev = this.head;
        this.head.next = newNode;
    }

    public int pop() {
        if (this.isEmpty()){
            return -1;
        }
        ListNode targetNode = this.tail.prev;
        ListNode prevNode = targetNode.prev;

        prevNode.next = this.tail;
        this.tail.prev = prevNode;

        return targetNode.val;
    }

    public int popleft() {
        if (this.isEmpty()){
            return -1;
        }
        ListNode targetNode = this.head.next;
        ListNode nextNode = targetNode.next;

        nextNode.prev = this.head;
        this.head.next = nextNode;

        return targetNode.val;
    }
}
