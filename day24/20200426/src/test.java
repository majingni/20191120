/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-26   08:49
 */
public class test {
    public static void main(String[] args) {
        System.out.println(gys(16,20));
    }
    private  static int  gys(int m,int n){
        if(m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        int a=0;
        while(n!=0){
            a=m%n;
            m=n;
            n=a;;
        }
        return  m;
    }
}

