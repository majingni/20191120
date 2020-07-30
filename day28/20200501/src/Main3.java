/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-01   21:00
 */
//密码验证合格程序
import java.util.*;
public class Main3{
    public static void main(String[]  args){
        Scanner  sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            //长度
            int length=str.length();
            //包含字符大于等于3
            int num=0;
            int lowerletters=0;
            int upperletters=0;
            int elseletters=0;
            for(int i=0;i<length;i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    num++;
                    continue;
                }else  if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                    lowerletters++;
                    continue;
                }else  if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                    upperletters++;
                    continue;
                }else{
                    elseletters++;
                }
            }
            boolean flag=true;
            if((num!=0&&lowerletters!=0&&upperletters!=0)||(num!=0&&lowerletters!=0&&elseletters!=0)||
                    (num!=0&&elseletters!=0&&upperletters!=0)||(lowerletters!=0&&upperletters!=0&&elseletters!=0)){
                flag=true;
            }else{
                flag=false;
            }
            //不能有长度超过2的子串重复
            int number = 0;
            for ( int i = 3 ; i <= str.length()/2 ; i++ ) {
                for ( int j = 0 ; j < str.length() - i ; j++ ) {
                    String s = str.substring(j, j + i );
                    //int indexOf(String str)
                    //返回指定子字符串第一次出现的字符串内的索引。
                   // int lastIndexOf(String str)
                  //  返回指定子字符串最后一次出现的字符串中的索引。
                    if ( str.indexOf(s) != str.lastIndexOf(s) ) {
                        number++;
                    }
                }
            }
            if(length>8&&flag==true&&number==0){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
}