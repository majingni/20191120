/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-13   13:48
 */
//递归：最后一步，可能是从n-1阶往上走1阶；可能是从n-2阶往上走2阶；可能是从n-3阶上去往上走3阶
  //  f(1)=1;f(2)=2;f(3)=4;
    //f(4)=f(1)+f(2)+f(3)=7;  f(5)=f(2)+f(3)+f(4); f(n)=f(n-1)+f(n-2)+f(n-3);
    //迭代   （a+b)%c=(a%c+b%c)%c;
public class Main1 {
    public int countWays(int n) {
        int[] array=new int[100000];
        array[0]=1;
        array[1]=2;
        array[2]=4;
        for(int i=3;i<100000;i++){
            array[i]= ((array[0]+array[1])%1000000007+array[2]%1000000007)%1000000007;
        }
        return array[n-1];
    }
}
