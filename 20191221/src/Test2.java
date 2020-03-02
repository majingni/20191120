/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-12-22   11:49
 */
import  java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        MyArrayList<Person> L1 = new MyArrayList<>(10);//告诉编译器将来在MyArrayList中实际类型，l1中只能存储person类型
        L1.add(new Person());
        L1.add(new Person());
        // L1.add(new Book()); 在编译阶段，发现类型不匹配，编译器报错
        // Book b = (Book)L1.get(0); // 在编译阶段，发现类型不匹配，强转也不行
        Person p = L1.get(0);


        // L2中只能存储Book类型的对象
        MyArrayList<Book> L2 = new MyArrayList<>(10);
        L2.add(new Book());
        //L2.add(new Person());

        System.out.println(L1.getClass());//getClass得到l1的类名
        System.out.println(L2.getClass());

      // MyArrayList<int> L3 = new MyArrayList<int>(10);//类型擦除全部替换成object,object可以所有类的对象，基本数据类型 所定义的变量并不是对象 8中基本数据类型可以转化成对应的包装类型
       //L3.add(3);
        MyArrayList<Integer>   L3=new MyArrayList<Integer>(10);
    }
}

class Book{}
class Person{
    public void Print(){
        System.out.println("我是一个好人");
    }
}
// 泛型类 模板类型   优点：在编译阶段，类型转化，类型不匹配已经检测过了   在以前的版本中(object)+编译时类型检测
class  MyArrayList<E> //<E>泛型类  伪泛型：一个模板类   兼容以前的   类型擦除                                再写代码期间不关心E的实际类型，只有实例化给了之后才知道是什么类型
{
    public MyArrayList(int capacity){
        array = (E[])new Object[capacity];//先申请object类型的空间，在进行强转
        size = 0;
        this.capacity = capacity;
    }

    public void add(E e)
    {
        // 检测容量
        array[size++] = e;
    }

    public int size()
    {
        return  size;
    }

    E get(int index)
    {
        // 检测index不能越界
        return  array[index];
    }

    boolean isEmpty()
    {
        return 0 == size;
    }

    E[] array;
    int capacity;  // 空间的总大小
    int size;      // 空间中存储有效元素的个数
}

