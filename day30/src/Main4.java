/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-05-11   16:18
 */
import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
           // if (str.equals("exit"))
              //  break;
            //\转为空
            String[] strs = str.split("\\\\");
            String fileName = strs[strs.length - 1];
            int line = scanner.nextInt();
            String newStr = fileName + " " + line;
            if (!map.containsKey(newStr))
                map.put(newStr, 1);
            else
                map.put(newStr, map.get(newStr) + 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        //根据指定的比较器引起的顺序对指定的列表进行排序。
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();//升序
            }
        });

        int count = 0;
        for (Map.Entry<String, Integer> mapping: list)
        {
            count++;
            if (count <= 8) {
                String tmp = mapping.getKey();
                String[] tmps = tmp.split(" ");
                if (tmps[0].length() > 16)
                    tmps[0] = tmps[0].substring(tmps[0].length() - 16);
                System.out.println(tmps[0] + " " + tmps[1] + " " + mapping.getValue());
            }
        }
    }
}
