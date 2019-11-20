
class   SignalList1 {
    public  ListNode head;
    SignalList1() {
        this.head = null;
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }
//尾插法
    public   void    addaLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (head == null) {
            head = node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
          cur.next=node;
        }
    }

    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //单链表的反转
    public  ListNode  reverseList() {
        ListNode prev = null;
        ListNode cur = this.head;
        ListNode newHead = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    public  void  daplay1(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


}