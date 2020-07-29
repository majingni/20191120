/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-07-15   12:35
 */
public class MyQueue {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.display();
        System.out.println();
        queue.poll();
        queue.display();
    }
}




 class Queue{
   Node  front;
   Node   rear;
   int size;
//插入队列
   public void offer(int data){
       Node  node=new  Node(data);
        if(rear==null){
           front=node;
           rear=node;
        }else{
            rear.next=node;
            rear=rear.next;
        }
        size++;
   }
   //出队列
    public int   poll(){
       if(front==null){
           throw  new  RuntimeException("运行时出错");
       }
       int data=front.data;
       front=front.next;
       return  data;
    }
    //队首元素
public int peek(){
return front.data;
}
public void display(){
       Node  cur=front;
       while(cur!=null){
           System.out.print(cur.data+" ");
           cur=cur.next;
       }
}
public boolean  empty(){
       return size==0;
}

}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}