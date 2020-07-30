import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-11   16:21
 */
public class test {
    public static void main(String[] args) {
        String str = "{\\\"name\\\":\\\"spy\\\",\\\"id\\\\}";
        String[]  temp=str.split("\\\\");
        for(String a:temp){
            System.out.print(a);
        }
        Map<String,Integer > map=new LinkedHashMap<>();
        map.put("我",1);
        map.put("we",2);
        map.put("fg",4);
        map.put("cv",5);
    for(String string:map.keySet()){
        System.out.print(string+" ");
    }
            String s="12345678910111213141516";
            String s1=s.substring(s.length()-16);
            System.out.println(s1);
    }
}
