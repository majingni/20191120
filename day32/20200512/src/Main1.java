/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-12   12:14
 */
import java.util.*;
public class Main1{
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            String[]  str1=str.split("\\.");
            String s=sc.next();
            String[]  s1=s.split("\\.");
            int[]  n=new int[3];
            for(int i=0;i<str1.length;i++){
                n[i]=Integer.parseInt(str1[i]);
            }
            int[]   m=new int[3];
            for(int i=0;i<s1.length;i++){
                m[i]=Integer.parseInt(s1[i]);
            }
            int psum=n[0]*17*29+n[1]*29+n[2];
            int asum=m[0]*17*29+m[1]*29+m[2];
            int a=asum-psum;
            int b,c,d=0;
            if(a<0) {
                System.out.print("-");
                a *= -1;
            }
            b=a/(17*29);
            c= (a%(17*29))/29;
            d=(a%(17*29))%29;
                System.out.println(b + "." + c + "." + d);
            }
        }
    }
