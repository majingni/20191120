/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-12-22   14:28
 */
class Book1{}
class Person1{
    public void Print(){
        System.out.println("我是一个好人");
    }
}

class MyArrayList1
{
    public MyArrayList1(int capacity){
        array = new Object[capacity];
        size = 0;
        this.capacity = capacity;
    }

    void add(Object e)
    {
        // 检测容量
        array[size++] = e;
    }

    int size()
    {
        return  size;
    }

    Object get(int index)
    {
        // 检测index不能越界
        return  array[index];
    }

    boolean isEmpty()
    {
        return 0 == size;
    }

    Object[] array;
    int capacity;  // 空间的总大小
    int size;      // 空间中存储有效元素的个数
}

public class Test4 {
    public static void main(String[] args) {
        MyArrayList1 L1 = new MyArrayList1(10);
        L1.add(new Person());
        L1.add(new Person());
        L1.add(new Person());

        // 向下转型：不安全
        Person p = (Person)L1.get(0);
        p.Print();

        MyArrayList1 L2 = new MyArrayList1(10);
        L2.add(new Book());
        L2.add(new Book());
        L2.add(new Book());

        //L2.get(0); // 返回类型Object ---> Book
        Book b = (Book)L2.get(0);

        // 向下转型：不安全
        Person pp = (Person)L2.get(0);
        pp.Print();
    }
}