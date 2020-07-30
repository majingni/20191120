/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-11   15:30
 */
import java.util.*;
public class Main3{
    public static  void   main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[]  temp=str.split(" ");
            for(int i=temp.length-1;i>=1;i--){
                System.out.print(temp[i]+" ");
            }
            System.out.print(temp[0]);
        }
    }
}