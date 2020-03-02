/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-12-22   14:16
 */
//将8中基本数据类型进行包装
        public class Test3 {
            public static void main(String[] args) {
                int i = 10;
                Integer i2=Integer.valueOf(i) ; // 装箱：将基础类型定义的变量转化为对应的包装类型 调用
               int i3=i2.intValue();  // 拆箱：将包装类对象中的数据拿出

                Integer i1 = i;   // 自动装箱：编译器在编译阶段会使用i构造一个包装类型的对象，然后使用i1引用 Integer.valueOf(i)
                int i4 = i1;      // 自动拆箱：将包装类型的对象直接赋值给对应的基础类型的变量
                //           i1.intValue();
            }
        }

