/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-11-19   15:34
 */
public class Test2 {
    public static void main(String[] args) {
         F  f =new   F( "huahua");
         func(f);
         func1(f);
    }
    public   static  void   func(A1   a1){
        a1.fun();
    }
    public  static  void   func1(B    b){
        b.fun1();
    }
}
interface  A1{
    void  fun();
}
interface  B{
    void   fun1();
}
class   F   implements A1,B{
    public  String  func;
    F(String  func){
        this.func=func;
    }
    @Override
    public void fun() {
        System.out.println("youyong ");
    }
    @Override
    public void fun1() {
        System.out.println("huahua ");
    }
}