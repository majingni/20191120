/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-09   10:32
 */
import java.util.*;
public class Main1{
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            for(int i=0;i<str.length();i++){
                char b=str.charAt(i);
               // int a=b-'0'+48;
                //10进制转化为2进制
                String s=Integer.toBinaryString(b);
                //判断1 的个数
                int len=7-s.length();
                for(int k=0;k<len;k++){
                    s="0"+s;
                }
                int  count=0;
                for(int j=0;j<s.length();j++){
                    char l=s.charAt(j);
                    if(l=='1'){
                      count++ ;
                    }
                }
                   if(count%2==0){
                       System.out.println("1"+s);
                   }else{
                       System.out.println("0"+s);
                   }
            }
        }
    }
}