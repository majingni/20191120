/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-29   08:43
 */
import java.util.*;
public class Main{
    public static void  main(String[]   args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[]  array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(m==array[i]){
                    flag=true;
                    System.out.println(i);
                }
            }
            if(flag==false){
                System.out.println(-1);
            }
        }
    }
}