/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-27   11:05
 */
import java.util.*;
public class Main{
    public static void  main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();//课程总数
            int[]  score=new  int[N];//学分
            for(int i=0;i<N;i++){
                score[i]=sc.nextInt();
            }
            int[]  grade=new  int[N];//成绩
            for(int i=0;i<N;i++){
                grade[i]=sc.nextInt();
            }
            average(score,grade,N);
        }
    }
    public  static  void    average(int[]  score,int[] grade,int N){
        //每门课程的绩点
        double[]  m=new  double[N];
        for(int i=0;i<N;i++){
            if(grade[i]>=90&&grade[i]<=100){
                m[i]=4.0*score[i];
            }else if(grade[i]>=85&&grade[i]<=89){
                m[i]=3.7*score[i];
            }else if(grade[i]>=82&&grade[i]<=84){
                m[i]=3.3*score[i];
            }else if(grade[i]>=78&&grade[i]<=81){
                m[i]=3.0*score[i];
            }else if(grade[i]>=75&&grade[i]<=77){
                m[i]=2.7*score[i];
            }else if(grade[i]>=72&&grade[i]<=74){
                m[i]=2.3*score[i];
            }else if(grade[i]>=68&&grade[i]<=71){
                m[i]=2.0*score[i];
            }else if(grade[i]>=64&&grade[i]<=67){
                m[i]=1.5*score[i];
            }else if(grade[i]>=60&&grade[i]<=63){
                m[i]=1.0*score[i];
            }else {
                m[i]=0;
            }
        }
        double  a=0;
        int b=0;
        //绩点
        for(double  e:m){
            a+=e;
        }
        //学分
        for(int  e:score){
            b+=e;
        }
        double   gpa=a/b;
        System.out.printf("%.2f",gpa);
    }
}