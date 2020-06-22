/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-24   21:29
 */
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while (sc.hasNext()) {

                set.add(sc.next());
            }

            System.out.println(set.size());
            sc.close();*/

                //Material Science 材料
                //java泛型擦出机制，HashSet<Object>() 与 HashSet<>()在编译器相同
                Set<String> mSet = new HashSet<>();
                Scanner in = new Scanner(System.in);
                while (in.hasNextLine()) {
                    String row = in.nextLine();
                    //使用空格进行分割
                    String[] rows = row.split(" ");
                    for (String string : rows) {
                        mSet.add(string);
                    }
                }
                System.out.println(mSet.size());
                in.close();
            }
        }


