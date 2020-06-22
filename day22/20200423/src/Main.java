/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-23   08:56
 */
import java.util.*;
public class Main{
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String    store=sc.nextLine();
            String   customer=sc.nextLine();
              List<Character>  list=new ArrayList<>();
              for(int i=0;i<store.length();i++){
                  list.add(store.charAt(i));
              }
              int count=0;
                  for(int i=0;i<customer.length();i++) {
                      for (int j = 0; j < list.size(); j++) {
                          if (customer.charAt(i) == list.get(j)) {
                              count++;
                              list.remove(j);
                              break;
                          }
                      }
                  }
               if(count==customer.length()){
                   System.out.println("Yes"+" "+(store.length()-count));
               }else{
                   System.out.println("No"+" "+(customer.length()-count));
               }

            }

        }
    }
