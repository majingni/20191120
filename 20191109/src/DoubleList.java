 class DoubleList {
   public   ListNode    head;
   public    ListNode   last;
public   void  addFirst(int  data){
    ListNode   node=new ListNode(data);
    if(this.head==null){
        this.head=node;
        this.last=node;
    }else{
         node.next=head;
         head.prev=node;
        head=node;
    }
}
public   void    addLast(int data){
    ListNode  node=new ListNode(data);
    if(head==null){
        head=node;
        last=node;
    }else{
        last.next=node;
        node.prev=last;
        last=node;
        }
}
     public void display() {
         ListNode cur = this.head;
         while (cur != null) {
             System.out.print(cur.data+" ");
             cur = cur.next;
         }
         System.out.println();
     }
     public  int length() {
         ListNode cur = this.head;
         int count=0;
         while(cur!=null){
            count++;
             cur=cur.next;
         }
        return  count;
     }
     private  ListNode  searchIndex(int  index){
              ListNode   cur=this.head;
              if(index<0||index>length()){
                  System.out.println("插入位置不合法");
              }
              while(index>0){
                  cur=cur.next;
                 index--;
              }
            return  cur;
     }
     //任意位置插入，第一个数据节点为0号下标
     public    boolean   addIndex(int   index, int  data){
    ListNode    node=   new  ListNode(data);
      if(head==null){
         addFirst(data);
      }
      ListNode cur = searchIndex(index);
         if(cur==null){
             return  false;
         }
         node.next=cur;
      cur.prev.next=node;
          node.prev = cur.prev;
          cur.prev = node;
          return   true;
     }
     //
     public    boolean  contains(int  data){
        ListNode  cur= this.head;
        while(cur!=null){
            if(cur.data==data){
                return  true;
            }
            cur=cur.next;
        }
        return  false;
     }
     //删除key
     public   int  remove(int key) {
         int oldData = -1;//存储要删除的数字
         ListNode cur = this.head;
         while (cur != null) {
             if (cur.data == key) {
                 oldData = cur.data;
                 //头
                 if (cur == this.head) {
                     head = head.next;
                     head.prev = null;
                     return   oldData;
                 } else {
                     cur.prev.next = cur.next;
                     if (cur.next != null) {
                         cur.next.prev = cur.prev;
                     } else {
                         this.last = cur.prev;
                     }
                   return  oldData    ;
                 }
             }
             cur=cur.next;
         }
         return     -1   ;
     }
     //删除所有值为key的节点
     public    void   removeAllKey(int  key){
         int oldData = -1;//存储要删除的数字
         ListNode cur = this.head;
         while (cur != null) {
             if (cur.data == key) {
                 oldData = cur.data;
                 //头
                 if (cur == this.head) {
                     head = head.next;
                     head.prev = null;

                 } else {//中间和最后
                     cur.prev.next = cur.next;
                     if (cur.next != null) {
                         cur.next.prev = cur.prev;
                     } else {
                         this.last = cur.prev;
                     }
                 }
             }
             cur=cur.next;
         }
     }
     //防止内存泄漏   ???？？？？
public  void   clear(){
      //this.head=null;
      while(this.head!=null){
          ListNode  cur=head.next;
          head.next=null;
          head.prev=null;
          head=cur;
      }
      last=null;
}
 }






class   ListNode{
    public  int data;
    public   ListNode  prev;
    public   ListNode   next;
    ListNode(int data){
        this.data=data;
    }
}