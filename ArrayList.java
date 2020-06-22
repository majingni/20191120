import java.util.Arrays;

/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-06-20   10:08
 */

public  class   ArrayList{
    public static void main(String[] args) {
        MyArrayList   myArrayList=new MyArrayList();
        for(int i=0;i<10;i++){
            myArrayList.add(i,i);
        }
             myArrayList.add(10,10);
        myArrayList.display();
        System.out.println();
        System.out.println(myArrayList.contains(10));
        System.out.println(myArrayList.search(5));
        System.out.println(myArrayList.size());
        myArrayList.setPos(11,12);
       // System.out.println(myArrayList.getPos(-1));
//        System.out.println(myArrayList.size());
//        myArrayList.remove(0);
//        myArrayList.remove(10);
//        myArrayList.display();
//        myArrayList.clear();
//        System.out.println();
//        System.out.println(myArrayList.size());

    }
}






 class MyArrayList {

    public  int[]   elem;
    public  int usedSize;//有效元素的个数
    public   static   final  int capacity=10;

    MyArrayList(){
        this.elem=new  int[capacity];
        this.usedSize=0;
    }




    private   boolean  ifFull(){
        if(usedSize==capacity){
            return  true;
        }
        return  false;
    }
     private  void  checkPos(int pos){
         if(pos<0||pos>usedSize){
             throw new  RuntimeException("pos位置不合法");
         }
     }
//增加元素  判断pos位置是否合法pos<=uesdSize      挪数据      放数据，usedSize++
    public  void   add(int pos,int data){
            checkPos(pos);
             if(ifFull()){
                 this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
             }
            int i = 0;
            for (i = usedSize - 1; i>=pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
    }




    //打印顺序表
    public  void  display(){
        for(int i=0;i<usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
}
       //是否包含某个元素
     public  boolean   contains(int  toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return  true;
            }
        }
        return   false;
     }




     //toFind的下标
     public  int search(int toFind){
         for(int i=0;i<this.usedSize;i++){
             if(this.elem[i]==toFind){
                 return  i;
             }
         }
        return -1;
     }



     //pos位置的元素
      public int  getPos(int pos){
             if(usedSize==0){
                 throw  new   RuntimeException("顺序表为空");
             }
           if(pos<0||pos>=usedSize){
               throw  new  RuntimeException(" pos位置不合法！！！");
           }
        return   this.elem[pos];
      }







      //有效元素的个数
     public  int  size(){
        return  usedSize;
     }



    //删除第一次出现的关键字toRemove
     public  void  remove(int toRemove){
          int a=search(toRemove);
          if(a==-1){
              System.out.println("没有需要删除的数字");
              return;
          }
         for(int i=a;i<usedSize-1;i++){
             elem[i]=elem[i+1];
         }
        usedSize--;
     }

     //清空
     public void clear(){
       this.usedSize=0;
     }


     public void  setPos(int pos,int  data){
        if(pos<0||pos>=usedSize){
            throw  new  RuntimeException("位置不合法");
        }
        this.elem[pos]=data;
     }

}
