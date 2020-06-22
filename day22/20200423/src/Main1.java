/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-23   10:38
 */
import java.util.*;
/*自己第一遍通过的代码和如上思路一致，只是没有使用三目运算符，也没把a,b为null和进位为1总结到一起，if else显得代码冗长。此题有如下几个注意点：

1.因为while循环中每次都是c.next=new.........,所以第一个节点就是个特例了，为了方便可以在最开始设置一个作为头结点（最后输出他的next域），将第一个节点也和后面的节点归为一类插入。

2.正常思路是需要判断a是否结束了，b是否结束了，分情况讨论。这里用一个三目运算符，当其中一个为null的时候设置他为0即可。

3.如果最高位的1是次高位进位的，那么正常思路的情况最后一个1是没法取到的，因为最后判断a，b都为null就结束，所以判定条件为 a!=null||b!=null||jin==1

4.最后在a=a.next的时候，因为a可能是null，所以在这个时候用一个三目运算符判断如果为null则他的下一次循环还按照null来，不取a.next了，也就不会有越界问题

5.最开始的c还有一个copy为head，因为c随着链表在向后移动，防止最后输出找不到头结点。最后输出head.next*/
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class  Main1 {
    public ListNode plusAB(ListNode a, ListNode b) {
        int jin=0;
        ListNode c=new ListNode(-1);
        ListNode head=c;
        int val;
        while(a!=null||b!=null||jin==1){
            int aval=(a==null?0:a.val);
            int bval=(b==null?0:b.val);
            val=aval+bval+jin;
            jin=val/10;
            val=val%10;
            head.next=new ListNode(val);
            head=head.next;
            a=(a==null?null:a.next);
            b=(b==null?null:b.next);
        }
        return c.next;
    }
}