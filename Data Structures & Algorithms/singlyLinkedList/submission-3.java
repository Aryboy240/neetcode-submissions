class ListNode{

    int value;
    ListNode next;

    public ListNode(int value){
        this(value, null);
    }

    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}

class LinkedList {

    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (i < index && curr != null){
            curr = curr.next;
            i++;
        }
        if (curr != null){
            return curr.value;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null){
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        ListNode curr = this.head;
        int i = 0;
        while (i < index && curr != null){
            curr = curr.next;
            i++;
        }
        if (curr != null && curr.next != null){
            if (curr.next == this.tail){
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head.next;
        int i = 0;
        while (curr != null){
            res.add(curr.value);
            curr = curr.next;
            i++;
        }
        return res;
    }
}
