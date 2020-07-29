/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-12   08:48
 */
public class Main {
    public static void main(String[] args) {
       System.out.println(countNumberOf2s(22,2));
    }
    public  static int countNumberOf2s(int n,int i ) {

       /* int count=0;
        for(int i=0;i<=n;i++){
            int m=i;
            while(m>0){
                if(m%10==2){
                    count++;
                }
                m/=10;
            }
        }
        return count;*/
       // 当某一位的数字小于i时，那么该位出现i的次数为：更高位数字x当前位数
        //当某一位的数字等于i时，那么该位出现i的次数为：更高位数字x当前位数+低位数字+1
        //当某一位的数字大于i时，那么该位出现i的次数为：(更高位数字+1)x当前位数
        if(i<1 || i>9) return -1;//i只能是1到9
        int count = 0;
        int factor = 1;//位数
        int low = 0, cur = 0, high = 0;
        while(n/factor != 0){
            low = n - (n/factor) * factor;//低位数字
            cur = (n/factor) % 10;//当前位数字
            high = n / (factor*10);//高位数字

            if(cur < i)
                count += high * factor;
            else if(cur == i)
                count += high * factor + low + 1;
            else
                count += (high + 1) * factor;

            factor *= 10;
        }

        return count;
    }
    }
