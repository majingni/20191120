/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-13   08:48
 */
import java.util.*;
public class Main{
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            sc.nextLine();
            String[]  s=new String[n];
            for(int i=0;i<n;i++){
                s[i]=sc.nextLine();
            }
            int a=0,b=0,c=0;
            int a1=0,b1=0,c1=0;
            int d=0,e=0,f=0;
            int d1=0,e1=0,f1=0;
            for(int i=0;i<n;i++) {
                if (s[i].charAt(0) == 'C' && s[i].charAt(2) == 'J') {
                    a++;
                    c1++;
                    d++;
                } else if (s[i].charAt(0) == 'J' && s[i].charAt(2) == 'C') {
                   c++;
                   a1++;
                   d1++;
                } else if (s[i].charAt(0) == 'C' && s[i].charAt(2) == 'B') {
                    c++;
                    a1++;
                    e1++;
                } else if (s[i].charAt(0) == 'B' && s[i].charAt(2) == 'C') {
                    a++;
                    c1++;
                    e++;
                } else if (s[i].charAt(0) == 'J' && s[i].charAt(2) == 'B') {
                    a++;
                    c1++;
                    f++;
                } else if (s[i].charAt(0) == 'B' && s[i].charAt(2) == 'J') {
                    c++;
                    a1++;
                    f1++;
                } else if (s[i].charAt(0) == 'J' && s[i].charAt(2) == 'J') {
                    b++;
                    b1++;
                } else if (s[i].charAt(0) == 'B' && s[i].charAt(2) == 'B') {
                    b++;
                    b1++;
                } else{
                    b++;
                    b1++;
                }
            }
            System.out.println(a+" "+b+" "+c);
            System.out.println(a1+" "+b1+" "+c1);
            if(d>e&&d>f){
                System.out.print("C"+" ");
            }else if(e>d&&e>f){
                System.out.print("B"+" ");
            }else if(f>d&&f>e){
                System.out.print("J"+" ");
            }else if(d==f){
                System.out.print("C"+" ");
            }else if(d==e) {
                System.out.print("C" + " ");
            } else if(f==e) {
                System.out.print("B" + " ");
            }

            if(d1>e1&&d1>f1){
                System.out.print("C");
            }else if(e1>d1&&e1>f1){
                System.out.print("B");
            }else if(f1>d1&&f1>e1){
                System.out.print("J");
            }else if(d1==f1){
                System.out.print("C"+" ");
            }else if(d1==e1) {
                System.out.print("C" + " ");
            } else if(f1==e1) {
                System.out.print("B" + " ");
            }

            }
        }
    }
