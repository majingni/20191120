/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-26   08:39
 */
import java.util.*;
public class  Main{
    public static void    main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[]  array=new int[n];
            int a=sc.nextInt();
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            System.out.println(func(a,array));

        }
    }
    public static int func(int a,int[]  array){
        int c=a;
        for(int i=0;i<array.length;i++){
            if(c>=array[i]){
                    c+=array[i];
            }else{
                c+=gys(array[i],c);
            }
        }
        return c;
    }
    private  static int  gys(int m,int n){
        if(m<n){
            int temp=m;
             m=n;
             n=temp;
        }
        int a=0;
        while(n!=0){
            a=m%n;
            m=n;
            n=a;;
        }
        return  m;
    }
}