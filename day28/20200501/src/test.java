import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int h=n;
            int m = n * n;
            int[] array1;
            int count=0;
          while(n!=0){
              n=n/10;
              count++;
          }
           array1=new int[count];
          for(int i=0;i<count;i++){
              array1[i]=h%10;
              h=h/10;
          }
          boolean  flag=true;
             for(int i=0;i<count;i++){
             if(m%10==array1[i]){
                 m=m/10;
             }else{
                 System.out.println("No");
                 flag=false;
                 break;
             }
         }
             if(flag==true) {
                 System.out.println("Yes");
             }
        }
    }
}
