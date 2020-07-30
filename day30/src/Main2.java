/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-09   12:11
 */
//大整数排序
//BigInteger与  BigDecimal的区别
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main2{
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            BigInteger[] s = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextBigInteger();
            }
            //排序
            Arrays.sort(s);
             for(int i=0;i<n;i++){
                 System.out.println(s[i]);
             }

        }
    }
        }
