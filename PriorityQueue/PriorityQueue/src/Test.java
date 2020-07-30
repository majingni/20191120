import java.util.Arrays;

/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-03-23   21:34
 */
//自己实现优先级队列 为了简单只实现int
public class Test {
    public static void main(String[] args) {
        int[] array = {7, 3, 5, 8, 2, 9, 4};
        MyPriorityQueue p = new MyPriorityQueue(array,new  Less());
             p.pool();
            System.out.print(p.peek());
            int x=-1;
        System.out.println(p.offer(x));
        System.out.println(p.isEmpty());
        System.out.println(p.size);
    }
}
interface C{
 public int compare(int child,int parent);
        }
class  Less implements C{
    public  int compare(int child, int parent){

        return  child-parent;
    }
}
class  Grater  implements C{
    public  int compare(int child, int parent)
    {
        return   parent-child;
    }
}
class  MyPriorityQueue  {
  public     int[]  array;
  public  int  size;//有效元素的个数 array.length为数组长度
    C  compare=null;//创建一个接口的引用，成为属性
    MyPriorityQueue(C  com ){
        array=new int[11];
        size=0;
        compare=com;
    }
    MyPriorityQueue(int initialCapacity,C  com){
          if(initialCapacity<1){//标准库会抛出非法参数的异常
              initialCapacity=11;
          }
            array=new int[initialCapacity];
            size=0;
            compare=com;
    }
    //堆的底层是以完全二叉树的形式存储在数组中
    MyPriorityQueue(int[] arr,C  com){
        array=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }
        compare=com;
        size=arr.length;//
        //调整数组使其满足堆的性质
        //找倒数第一个非叶子节点,从底向上逐渐调整
        //找到倒数第一个非叶子节点，即调整的节点
        //倒数第一个非叶子节点，就是最后一个节点的双亲，即array.length-1
        //倒数第一个非叶子结点： (array.length-2)>>1
        int lastLeaf=(array.length-2)>>1;
            for(int root=lastLeaf;root>=0;root--){
                ShiftDown(root);
            }
    }
//向下调整
    //parent的左右子树必须已经满足二叉树的性质
    //让parent与较小的孩子进行交换
    private  void  ShiftDown(int parent) {//parent需要调整节点的下标
       //child标记最小的孩子，因为parent可能有左孩子，没有右孩子
        int child = parent * 2 + 1;
        while (child <array.length) {//不能越界
            if (child + 1 < array.length && (compare.compare(array[child+1],array[child])<0)) {//保证右孩子的存在，否则会出现异常
                child = child + 1;//始终保证child最小
            }
            //将孩子节点与其双亲进行比较
            if (compare.compare(array[child],array[parent])<0) {//不满足堆的性质
                swap(child, parent);
                parent = child;//以parent为根的二叉树向下调整
                child = parent * 2 + 1;
            } else {
                //满足堆的性质
                return;
            }
        }
    }
     //交换值
      private  void   swap(int parent,int  child){
        int  tmp=array[parent];
       array[parent]=array[child];
        array[child]=tmp;
}
//有效元素的个数
    int  size(){
  return  size;
    }
    boolean  isEmpty(){
        return  0==size;
    }
    //优先级对列不管是插入还是删除，都是将最小元素方放在队首
   //是否插入成功
   boolean offer(int  x){
        //0.检测是否需要扩容
       grow();
  //1.先插入数组中  尾插到底层的数组中
      array[size++]=x;
       //2.检测新元素插入后是否破坏了堆的性质
            ShiftUp(size-1);//不能用size--，这样做会把元素个数少一个  ？、？、、、、？、、？、、、？？
          return  true;
   }
   //获取队首元素，及最小元素
     int peek(){
       return  array[0];
     }
     //检索并删除此队列的头，如果此队列为空，则返回 null 。
    //每次都是删除堆顶元素，及最小元素
    //删除元素：1.直接将后序元素向前搬移 ，不满足堆的性质 2.将堆顶元素与最后一个元素进行交换，元素个数减一；   在将堆顶元素，向下调整
     int pool(){
        int ret= array[0];
        swap(0,array.length-1);
        size--;
        ShiftDown(0);
       return ret;
     }
     //向上调整
    void   ShiftUp(int  child){
        int parent=(child-1)>>1;
        while(child!=0) {//parent>=0
            //将孩子节点与双亲进行比较
            if (compare.compare(array[child],array[parent])<0) {//不满足堆的性质
                swap(child, parent);
                child = parent;
                parent = ((child - 1) >> 1);
            } else {//满足堆的性质
                return;
            }
        }
    }
    void  clear(){
        size=0;
    }
    //扩容  只是模拟标准库中优先级队列中的一部分
    private  void  grow(){
        if(size>array.length){
            int oldCapacity=array.length;
            int newCapacity=oldCapacity+((oldCapacity>64)?oldCapacity+2:oldCapacity>>1);
            Arrays.copyOf(array,newCapacity);//static int[] copyOf(int[] original, int newLength)复制指定的数组，用零截取或填充（如有必要），以便复制具有指定的长度。
        }
    }
}