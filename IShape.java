/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-11-16   09:23
 */
/*
  1.接口的关键字interface
  2.接口当中的方法全部不能有具体的实现   都是抽象方法--->>默认public   abstract
  3.阿里巴巴：接口当中的方法尽量简洁
4.接口当中的成员变量public   static  final 静态常量
5.接口不可以被实例化
接口最大的意义被继承
 */
public interface IShape{
  // int size=10;
 void  draw1();
}
 interface   Ia{
    void  fun2();
}
/*
1.类和接口直接的关系：实现  implements
2.必须重写
3.扩展能力很强
4. 类和接口继承在先实现在后
5.接口和接口继承entends--》》扩展   可以多个扩展  所有的方法必须重写
    抽象类和接口的区别
    重写重载的区别
 */
class  Rect2  implements  IShape,Ia{
    @Override
    public void draw1() {
        System.out.println();
    }
        public  void  fun2(){
            System.out.println();
        }

}