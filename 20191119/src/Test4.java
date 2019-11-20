/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-11-19   16:50
 */
import  java.util.Arrays;
public class Test4 {
    public static void main(String[] args) throws   CloneNotSupportedException {
        Person1 person1 = new Person1("we", 13);
        Person1 person12 =(Person1) person1.clone();
        person12.money.m=99;
        System.out.println(person1.money.m);
        System.out.println(person12.money.m);

    }
    public static void main2(String[] args) throws   CloneNotSupportedException {
        Person1  person1=new Person1("bn",23);
        Person1  person12=(Person1)person1.clone();
        person12.name="haojie ";
        System.out.println(person12.name);
    }
    public static void main1(String[] args) {
        Students1[]     students1=new   Students1[3] ;
        students1[0]=new Students1("xiaohong ",21);
        students1[1]=new Students1("cindy",14);
        students1[2]=new Students1("tom",45);
        System.out.println(Arrays.toString(students1));
        Arrays.sort(students1);
        sort(students1);
        System.out.println(Arrays.toString(students1));
    }
    public  static   void  sort(Comparable[]  comparable){
          for(int i=0; i<comparable.length;i++){
              for(int j=0;j<comparable.length-i-1;j++){
                  if(comparable[j].compareTo(comparable[j+1])>0) { //compareTo( )  相等为0   大于返回值大于0  小于返回值小于0
                      Comparable  tmp=comparable[i];
                      comparable[j]=comparable[j+1];
                      comparable[j+1]=tmp;
                  }
              }
          }
    }
}
  class Students1   implements     Comparable<Students1> {
    String  name;
    int    age;
    Students1(String  name,int age){
        this.name=name;
       this.age=age;
    }
      @Override
      public String toString() {
          //return super.toString();
          return  "name="+this.name+"age="+this.age;
      }
      public   int  compareTo(Students1  o){
        return    this.age-o.age;//  传进来的参数（xiaohong,21) 与数组中的xiaohong,cindy,tom进行比较  差值越大，数值越大，在通过sort进行排序
      }
  }
  class  Person1   implements   Cloneable{
     String name;
     int age;
     Money1  money;
     Person1(String name,int age ){
         this.name=name;
         this.age=age;
         this.money= new  Money1();
     }
     public  Object  clone()  throws  CloneNotSupportedException{
         Person1   person1 =(Person1)super.clone();
         person1.money=(Money1)this.money.clone();
         return  person1;
     }
  }
class    Money1  implements  Cloneable{
       public  int m=10;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}





















