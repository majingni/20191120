/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-29   09:22
 */
//整数与IP地址的转换
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

        String rt= sc.nextLine();
        long n=Long.parseLong(rt);

        //IP地址转化为10进制
       String[] temp = str.split("\\.");
        StringBuffer sn = new StringBuffer();
        for (int i = 0; i < temp.length; i++) {
            StringBuffer sb = new StringBuffer();
            int m = Integer.parseInt(temp[i]);
            if (m == 0) {
                sb.append(0);
            }
            while (m != 0) {
                int a = m % 2;
                sb.append(a);
                m = m / 2;
            }

            int len = 8 - sb.length();
            if (len > 0) {
                for (int j = 0; j < len; j++) {
                    sb.append(0);
                }
            }
            sb.reverse();
            sn.append(sb);
        }
        String s = sn.toString();
        long m = 0;
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int b = s.charAt(i) - 48;
            m += b * (long) Math.pow(2, j);
            j++;
        }
        System.out.println(m);
        //10进制转化IP地址
      StringBuffer  w=new StringBuffer();
        while(n!=0){
            long a=n%2;
            w.append(a);
            n=n/2;
        }
            int len1=32-w.length();
            if(len1>0){
                for(int i=0;i<len1;i++){
                    w.append(0);
                }
            }
            w.reverse();
            String ss=w.toString();
            //
        int o=0;
        int k=8;
       String[]  se=new String[4];
       for(int i=0;i<se.length;i++){
               se[i]=ss.substring(o,k);
               o=k;
               k+=8;
           }
       StringBuffer  fe=new StringBuffer();


       for(int i=0;i<=2;i++){
           String de= se[i];
           int g=0;
           int u=0;
           for (int l = de.length() - 1; l>= 0; l--) {
               int b = de.charAt(l) - '0';
               g =g+ b * (int) Math.pow(2, u);
               u++;
           }
           fe.append(g+".");
       }
       String fr=se[3];
       int we=0;
       int f=0;
       for(int i=fr.length()-1;i>=0;i--){
           int b=fr.charAt(i)-'0';
            f+=b*(int)Math.pow(2,we);
           we++;
       }
            fe.append(f);
       String srt=fe.toString();
        System.out.println(srt);
       }
    }

