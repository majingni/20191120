/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-26   09:33
 */
import java.util.*;
public class Main1{
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int[]  array=new int[N];
            int M=sc.nextInt();//查询或者更新的操作次数
            //array[0]=0;
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
            for(int i=0;i<M;i++){
                if(sc.next().charAt(0)=='Q'){
                    int n=sc.nextInt();
                    int m=sc.nextInt();

                    if(n>m){
                        int t=n;
                        n=m;
                        m=t;
                    }
                    int temp=0;
                    for(int j=n-1;j<=m-1;j++){
                        if(array[j]>temp){
                            temp=array[j];
                        }
                    }
                    System.out.println(temp);


                }else if(sc.next().charAt(0)=='U'){
                     int x=sc.nextInt();
                     int y=sc.nextInt();
                     array[x-1]=y;

                 }
            }
        }
    }
}