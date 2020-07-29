/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-28   08:42
 */
import java.util.*;
public class  Main{
    public  static void main(String[]   args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();

            int count=0;
            int m=0;
            int m1=n;
            //计算各位数字之和
            while( m1!=0){
                m=m1%10;
                count+=m;
                m1/=10;
            }
            //计算平方和个位数之和
            int a=(int)(Math.pow(n,2));
            int b=0;
            int count1=0;
            while(a!=0){
                b=a%10;
                count1+=b;
                a=a/10;
            }

            System.out.println(count+" "+count1);
        }
    }
}