/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-29   09:42
 */
public class test {
    public static void main(String[] args) {
         String str="10.0.3.193";
        String[]  temp=str.split(".");
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        StringBuffer  sb=new StringBuffer("123");
        sb.reverse();
        System.out.println(sb.toString());
    }
}
