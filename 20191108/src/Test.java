public class Test {
    public static void main(String[] args) {
       /* SignalList1 signalList = new SignalList1();
        signalList.addFirst(1);
        signalList.addFirst(2);
        signalList.display();
       ListNode  node= signalList.reverseList() ;
       signalList.daplay1(node); */
       SignalList1   signalList1=new SignalList1();
       signalList1.addaLast(1);
       signalList1.addaLast(2);
       signalList1.addaLast(3);
       signalList1.display();
      SignalList1  signalList2=new SignalList1();
            signalList1.addaLast(5);
            signalList1.addaLast(6);
            signalList1.addaLast(7);
            signalList1.display();

    }
    public  void  cutCreat(ListNode  headA,ListNode  headB)     {
       headA.next.next= headB.next.next.next;
    }
    //相交链表
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA==null&&headB==null)    {
                return null;
            }
             ListNode   pl=headA; //永远指向最长链表
             ListNode    ps=headB; //最短链表
             //计算长度
        int    lenA=0;
        int lenB=0;
              while(pl!=null)  {
                  lenA++;
                  pl=pl.next;
              }
                while(ps!=null)  {
                  lenB++;
                  ps=ps.next;
                }
                int len=lenA-lenB;
              if(len<0)    {
            pl=headB;
               ps=headA;
                len=lenB-lenA;
              }
              pl=headA;
              ps=headB;
               //短的走len步
        while(len>0){
                  ps=ps.next;
                  len--;
        }
        //共同走
        while(pl!=null&&pl!=ps) {
            pl=pl.next;
            ps=ps.next;
        }
         if(ps!=null&&pl==ps) {
             return pl;
         }
        return null;
    }
    //合并有序的单链表
    public  ListNode   mergeTowLists(ListNode headA,ListNode  headB)  {
        ListNode   node=new ListNode(-1);//虚节点
        ListNode   tmp=node;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=headA;
            }else{
              tmp.next= headB;
              headB=headB.next;
              tmp=tmp.next;
            }
        }
            if(headA.next==null) {
                        return    headB;
            }
            if(headB.next==null) {
                 return  headA;
            }
               return  null;
    }
}