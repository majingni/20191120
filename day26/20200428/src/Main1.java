/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-28   09:17
 */
import java.util.*;
public  class  Main1{
    public static void  main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();//候选人人数
            sc.nextLine();
            String s = sc.nextLine();

            int m = sc.nextInt();//投票人的人数
            sc.nextLine();
            String str = sc.nextLine();

            String[] arr1 = s.split(" ");
            String[] arr2 = str.split(" ");
            int[] count = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr1[i].equals(arr2[j]) ){
                        count[i]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr1[i] + " : " + count[i]);
            }
            int a = 0;
            for (int e : count) {
                a += e;
            }
            System.out.println("Invalid : " + (arr2.length-a));
        }

    }
    }