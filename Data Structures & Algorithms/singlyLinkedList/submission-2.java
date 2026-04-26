class LinkedNode{

    int val;
    LinkedNode next;

    public LinkedNode(int val){
        this(val, null);
    }

    public LinkedNode(int val, LinkedNode next){
        this.val = val;
        this.next = next;
    }
}

class LinkedList {

    LinkedNode head;
    LinkedNode tail;

    public LinkedList() {
        this.head = new LinkedNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        LinkedNode cursor = head.next;
        for (int i = 0; i <= index; i++){
            if (cursor == null){
                return -1;
            }
            cursor = cursor.next;
        }
        return cursor.val;
    }

    public void insertHead(int val) {
        LinkedNode newNode = new LinkedNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null){
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        tail.next = new LinkedNode(val);
        tail.next = this.tail.next;
    }

    public boolean remove(int index) {
        LinkedNode cursor = head;
        for (int i = 0; i < index; i++){
            if (cursor == null){
                return false;
            }
            cursor = cursor.next;
        }
        if (cursor != null && cursor.next != null){
            if (cursor.next == tail){
                tail = cursor;
            }
            cursor.next = cursor.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        LinkedNode cursor = head.next;
        ArrayList<Integer> values = new ArrayList<>();
        while (cursor != null){
            values.add(cursor.val);
            cursor = cursor.next;
        }
        return values;
    }
}
