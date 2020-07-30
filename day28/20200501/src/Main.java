/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-01   18:31
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = n * n;
            int h=n;
            int count = 0;
            while (n != 0) {
                n = n / 10;
                count++;
            }
            if (count == 1) {
                if (m % 10 == h ){
                    System.out.println("Yes!");
                } else {
                    System.out.println("N0!");
                }
            } else if (count == 2) {
                if (m%100== h) {
                    System.out.println("Yes!");
                } else {
                    System.out.println("N0!");
                }
            } else {
                if (m %1000 == h) {
                    System.out.println("Yes!");
                } else {
                    System.out.println("N0!");
                }
            }
        }
    }
}