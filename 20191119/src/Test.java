/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-11-19   14:11
 */
public  class Test {
    public static void main(String[] args) {
        Animal   animal=new   Dog("dg","cv",13,"df");
        Dog  dog =(Dog) animal;
        dog.show();
        if(animal  instanceof   Dog){
            Dog  dog1 =(Dog) animal;
            dog1.show();
        }
    }
    public static void main2(String[] args) {
        Animal   animal=new Dog("xiaoming ","man",12,"black");
        fun(animal);
       Animal   animal1=fun1();
        animal1.show();


}
public  static   void fun(Animal  animal){
          animal.show();
}
public  static  Animal   fun1(){
        Dog   dog=new Dog("xc","man",13,"be");
        return   dog;
}
    public static void main1(String[] args) {
    Dog dog= new Dog("xiaohua","wonen",23,"white");//会先调用父类的构造方法，在调用自己的构造方法
    //animal.show();
    }
}
class  Animal{
    public int age;
    public  String name;
    public   String sex;
   Animal(int age,String name,String sex){
     this.age=age;
     this.name=name;
     this.sex=sex;
    }
    public  void  show(){
        System.out.println(this.name+this.age+this.sex);
    }
}
class  Dog  extends  Animal{
    public  String color;
    Dog(String name,String sex,int age,String color){
       super(age,name,sex);
       this.color=color;
    }

    @Override
    public void show() {
        System.out.println("");
        // super.show();

    }
}
















