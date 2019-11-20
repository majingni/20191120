package com.src.demo1;

/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-11-09   15:19
 */
 class Animal {
     private   String  name;
     private    int  age;
     Animal( String   name,int age ){
         this.name=name;
         this.age=age;
     }
     public   String  getName(){
         return   name;
     }
     public   void   setAge(int   age){
         this.age=age;
     }
     public  int  getAge(){
        return     age;
    }
    public   void   setName(String  name){
        this.name=name;
    }
     public   void  eat(){
         System.out.println("eat( )");
     }
}
