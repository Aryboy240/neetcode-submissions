class ListNode {
    int value;
    ListNode next;
    ListNode prev;

    public(int value){
        this.value = value;
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
        return (this.head.next != this.tail)
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
        ListNode firstNode = this.head.next;

        firstNode.prev = newNode;
        newNode.next = firstNode;
        this.head.next = newNode;
        newNode.prev = this.head;
    }

    public int pop() {
        if(this.isEmpty()){
           return -1; 
        }
        ListNode target = this.tail.prev;
        ListNode target = this.tail.prev;
    }

    public int popleft() {
        
    }
}
