/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-12-22   15:33
 */
import java.util.List;
import  java.util.ArrayList;


        /*int count=0;
  for(int i=0;i<length;i++){
      if(array[i]==value)
          count++;
      else
          array[i-count]=array[i];*/

public  class  Test5{
    public static void main2(String[] args) {
        //杨辉三角
        List<Integer>  L1=new ArrayList<>();
        List<Integer>  L2=new ArrayList<>();
        List<Integer>  L3=new ArrayList<>();
        List<List<Integer>>  L=new ArrayList<>();
        L.add(L1);
        L.add(L2);
        L.add(L3);
    }

    public static void main1(String[] args) {
        Integer  i1=100;
        Integer i2=100;
        Integer  i3=200;
        Integer  i4=200;
            Integer  i5=Integer.valueOf(100);
            Integer  i6=Integer.valueOf(200);//-128----127只要，用的是同一种

        System.out.println(i1==i2);//  地址相同 true
        System.out.println(i3==i4);//false

    }
}
