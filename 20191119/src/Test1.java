/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-11-19   15:05
 */
package com.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-11-09
 * Time: 16:52
 */
class Address {
    public String domic;
    public int floor;

    public Address(String domic,int floor) {
        this.domic = domic;
        this.floor = floor;
    }

    public String toString() {
        return "Address{" +
                "domic='" + domic + '\'' +
                ", floor=" + floor +
                '}';
    }
}
class Student{
    public String name;
    public int age;
    public Address address;//组合

    public Student(String name, int age,
                   Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address:domic=" + address.domic +
                ", address:floor=" + address.floor +
                '}';
    }
}
public class Test1{
    public static void main(String[] args) {
Address   address1=new Address("2",1);
        System.out.println(address1);
Student   student1=new Student("sn",14,address1);
        System.out.println(student1);//本身自带String  方法
    }
}

