/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-12-22   11:01
 */
import java.util.Collection;
import  java.util.ArrayList;
import  java.util.List;

import java.util.Collection;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        Collection<String>  c=new  ArrayList<>();//String类型
        System.out.println(c.isEmpty());//true  false
        c.add("c语言");
        c.add("java  se");
       // c.add(0,"gongkaihe ");
        c.add("数据结构");
        System.out.println(c.size());
        c.remove(0);
       // System.out.println(c.);
        System.out.println(c);
        List<String>  l1=new   ArrayList<>();
        ArrayList<String>  l2=new ArrayList<>();


    }

}
