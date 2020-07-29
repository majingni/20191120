/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-28   09:32
 */
import java.util.*;


public class Main2 {

    /**
     * @记票统计
     * 输入:
     *   输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
     * 输出:
     *   每行输出候选人的名字和得票数量。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int sum = sc.nextInt();
        sc.nextLine();
        String  str = sc.nextLine();

        String[] arr1= s.split(" ");
        String[] arr2= str.split(" ");

        int[] count = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            count[i]=0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i].equals(arr2[j]))
                    count[i]++;
            }
        }

        int re = 0;
        for(int i=0;i<num;i++){
            re = re + count[i];
            System.out.println(arr1[i]+" : "+count[i]);
        }

        int invalid = sum - re;
        System.out.println("Invalid : "+invalid);

    }


}

