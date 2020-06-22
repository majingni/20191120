/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-23   10:44
 */
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class  Mian2{
public ListNode plusAB(ListNode a, ListNode b) {
        ListNode pHead=null;
        ListNode tail=pHead;
        boolean jinwei=false;
        while(a!=null&&b!=null){
        int temp=a.val+b.val;

        if(pHead==null){
        if(jinwei){
        pHead=new ListNode(1);
        tail=pHead;
        }
        else{
        pHead=new ListNode(0);
        tail=pHead;
        }
        }
        else{
        if(jinwei){
        tail.next=new ListNode(0);
        temp+=1;
        tail=tail.next;
        }
        else{
        tail.next=new ListNode(0);
        tail=tail.next;
        }
        }

        if(temp>=10){
        temp-=10;
        jinwei=true;
        }
        else{
        jinwei=false;
        }
        tail.val+=temp;
        a=a.next;
        b=b.next;
        }
        while(a!=null){
        int temp=a.val;
        if(jinwei){
        tail.next=new ListNode(0);
        temp+=1;
        tail=tail.next;
        }
        else{
        tail.next=new ListNode(0);
        tail=tail.next;
        }

        if(temp>=10){
        temp-=10;
        jinwei=true;
        }
        else{
        jinwei=false;
        }
        tail.val+=temp;
        a=a.next;
        }
        while(b!=null){
        int temp=b.val;
        if(jinwei){
        tail.next=new ListNode(0);
        temp+=1;
        tail=tail.next;
        }
        else{
        tail.next=new ListNode(0);
        tail=tail.next;
        }

        if(temp>=10){
        temp-=10;
        jinwei=true;
        }
        else{
        jinwei=false;
        }
       tail.val+=temp;
        	b=b.next;
        }
        if(a==null&&b==null){
        	if(jinwei){
        		tail.next=new ListNode(1);
        		tail=tail.next;
        	}
        }
        return pHead;
    }

}