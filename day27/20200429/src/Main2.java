/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-29   15:02
 */

import java.util.*;
/
public class Main {

    public static void switchToInt(String str){
        String[] s1 = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(String ss : s1){
            String temp  = Long.toBinaryString(Long.parseLong(ss));
            while(temp.length() != 8){
                temp = "0" + temp;
            }
            sb.append(temp);
        }
        String s2 = sb.toString();
        char[] cc = s2.toCharArray();
        Long sum = 0l;
        for(int i = 0 ; i < 32 ; i++){
            sum = (long) (sum + Math.pow(2,31-i)*Long.parseLong(Character.toString(cc[i])));
        }
        System.out.println(sum);
    }
    public static void switchToBinary(String str){
        Long n = Long.parseLong(str);
        String s = Long.toBinaryString(n);
        while(s.length() != 32){
            s = "0" + s;
        }
        int count = 0;
        for(int i = 0 ; i < 4 ; i++){
            Switch(s,count);
            count = count + 8;
            if(i != 3)
                System.out.print(".");
        }
        System.out.println();
    }
    public static void Switch(String str , int start){
        char[] a = str.substring(start, start+8).toCharArray();
        Long sum = 0l;
        for(int i = 0 ; i < 8; i++){
            sum = (long) (sum + Math.pow(2,7-i)*Long.parseLong(Character.toString(a[i])));
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            switchToInt(str1);
            switchToBinary(str2);
        }
        scanner.close();
    }

}
