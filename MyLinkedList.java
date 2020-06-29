/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-06-22   11:08
 */

public class MyLinkedList {
    public static Node mergeTwoLists(Node headA,Node headB){
          Node  newHead=new Node(-1);
          Node tmp=newHead;
          while(headA!=null&&headB!=null){
              if(headA.data<headB.data){
                  tmp.next=headA;
                  tmp=tmp.next;
                  headA=headA.next;
              }else{
                  tmp.next=headB;
                  tmp=tmp.next;
                  headB=headB.next;
              }
          }
        if(headA==null){
            tmp.next=headA;
        }
        if(headA==null){
            tmp.next=headB;
        }
        return newHead.next;
    }
    public static  void createCut(Node headA,Node headB){
        headA.next=headB.next.next;
    }
    //输入两个链表，找到链表相交的节点
    public static  Node  getInterSectionNode(Node  headA,Node headB){
        Node ps=headA;//默认指向长的单链表
        Node pl=headB;//默认指向指向短的单链表
        int lenA=0;
        int lenB=0;
        while(ps!=null){
            lenA++;
            ps=ps.next;

        }
        while(pl!=null){
            lenB++;
            pl=pl.next;
        }
        int len=lenA-lenB;
        if(len<0){
            ps=headB;
            pl=headA;
            len=lenB-lenA;
        }
        for(int i=0;i<len;i++){
            ps=ps.next;
        }
//pl!=ps
        while(ps!=pl&&ps!=null&&pl!=null){
            ps=ps.next;
            pl=pl.next;
        }
//退出循环，pl和ps相等了
        if(ps!=null&&ps==pl){
            return ps;
        }
        return null;
    }
    public static void main(String[] args) {
     LinkedList  linkedList=new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(2);
        linkedList.addFirst(3);


        LinkedList  linkedList2=new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(6);
        linkedList.addFirst(8);
        linkedList.addFirst(9);
          createCut(linkedList.head,linkedList2.head);
        Node  node=getInterSectionNode(linkedList.head,linkedList2.head);
        System.out.println(node.data);


//        linkedList.addIndex(2,0);
//        linkedList.addIndex(1,5);
//     linkedList.display();
////        System.out.println();
//////        Node newHead=linkedList.reverse1();
//////        linkedList.display1(newHead);
////  Node node=linkedList.midNode();
////        System.out.println(node.data);
////        Node  node1  =linkedList.node(6);
////        System.out.println(node1.data);
//        System.out.println(linkedList.chkPalindrome());
    }
}

class  LinkedList {
    public Node head;//保存单链表头结点的引用

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //尾插
    public void addLast(int data) {
        Node cur = head;
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找关键字key是否在中
    public boolean contains(int key) {
        Node cur = head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //单链表的长度
    public int size() {
        int count = 0;
        Node cur = head;
        if (head == null) {
            return 0;
        }
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //任意位置插入，第一个节点下标为0
    public void addIndex(int data, int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("位置不合法");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == this.size()) {
            addLast(data);
            return;
        }

        Node node = new Node(data);
        Node cur = head;
        //node的前一个位置
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {

        if (head == null) {
            return;
        }

        //删除的是不是头结点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找前置节点
        Node prev = prev(key);
        if (prev == null) {
            System.out.println(" 没有此节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    private Node prev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除所有值为key的节点  只需遍历一遍
    public void removeAllkey(int key) {
        if (head == null) {
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;//代表要删除的节点
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        while (this.head.data == key) {
            this.head = head.next;
        }
    }

//清空
    public void clear() {
        this.head = null;

    }

    //打印
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }


    //-------------------------------------------------面试题
//反转一个单链表   只需遍历一遍
        public Node reverse () {
            Node  cur=this.head;//待反转的节点
            Node  prev=null;
            Node  newHead=null;
            while(cur!=null){
                Node  curNext=cur.next;
                if(curNext==null){
                     newHead=cur;
                }
                cur.next=prev;
                prev=cur;
                cur=curNext;
            }
            return newHead;
        }

        //采用头插法
        public Node reverse1(){
            Node  cur=this.head;//待反转的节点
            Node  prev=null;
            Node  newHead=null;
        while(cur!=null){
            Node   curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
              prev=cur;
              cur=curNext;
            }
        return newHead;
    }
public  void  display1(Node   newHead){
        Node  cur=newHead;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
}
//返回链表的中间结点，遍历一遍
    public  Node  midNode(){
        Node fast=this.head;
        Node  slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

//链表中倒数第K各节点  k的合法性
    public  Node   node(int k){
               if(head==null){
                   return null;
               }
        if(k<=0){
            System.out.println("K位置不合法");
            return  null;
        }
        Node fast=this.head;
        Node  slow=this.head;
//fast 先走k-1步
       while(k-1>0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                System.out.println(" 没有要找的节点");
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

//以x为基准，将链表分成两部分，原来的数据顺序不变
    public Node partition(int x){
        if(head==null){
            return null;
        }
        Node cur=this.head;
        Node bs=null;
        Node be=null;
        Node as=null;
        Node ae=null;

        while(cur!=null){
            if(cur.data>x){
            if(bs==null){
                bs=cur;
                be=bs;
            }else{
                bs.next=cur;
                bs=bs.next;
            }
            }else{
                if(as==null){
                  as=cur;
                  ae=as;
                }else{
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            cur=cur.next;
        }

        //bs是否为空
        if(bs==null){
            return as;
        }
        //bs不为空，进行拼接
        be.next=as;
        if(as!=null){
           ae.next=null;
        }
        return bs;
    }


//删除链表中重复的节点
    public Node  delete(){
             Node  newHead=new Node(-1);
             Node  tmp=newHead;
             Node  cur=this.head;
             while(cur!=null) {
                 if (cur.next != null && cur.data == cur.next.data) {
                     while (cur.next != null && cur.data == cur.next.data){
                         cur = cur.next;
                 }
                     cur=cur.next;//需要多走一步
                 }else {
                         tmp.next = cur;
                         tmp = tmp.next;
                         cur = cur.next;
                     }
             }
          tmp.next=null;
        return newHead.next;
    }


//链表是否是回文  找到链表的中间节点     反转单链表     head从后往后走  slow从后往前走
    public  boolean  chkPalindrome() {
        if (this.head == null){
        return false;
    }
        if (this.head.next == null){
            return true;
        }
        Node  fast=this.head;
        Node  slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node  cur=slow.next;
        while(cur!=null){
            Node  curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }

        while(slow!=this.head){
            if(slow.data!=head.data){
                return false;
            }
            //节点为偶数
            if(this.head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }

        return true;
    }

    //链表是否有环
    //走三步，走一步  很慢才能相遇 ，或者永远不相遇
    public boolean   hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            //可以快速相遇
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // return true;
                break;
            }
        }

        if (fast == null || fast.next == null) {//说明环为空
            return false;
    }
    return true;
    }

}



class  Node{
  public    int data;
  public   Node next;
  Node(int data){
      this.data=data;
  }
}