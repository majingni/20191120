/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2019-12-22   17:50
 */
import java.util.ArrayList;
import  java.util.List;
//杨辉三角

 class Solution {
   public  List<List<Integer>>   generate(int numRows) {
        List<List<Integer>>   ret=  new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> Row = new ArrayList<>();
            //设置当前Row行的数据
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    Row.add(1);//Row.set(j, 1);
                } else
                    Row.add( 0);//Row.set(j,0);
            }
          ret.add(Row);  //保存Row
            }
//设置其他位置的数据
            for(int i=2;i<numRows;i++) {
                List<Integer> cur = ret.get(i);
                List<Integer> pre = ret.get(i - 1);
                for (int j = 1; j < i; j++) {
                    cur.set(j, pre.get(j) + pre.get(j - 1));
                }
            }
            return   ret;
        }
    }
    //删除数组中所有值为value的元素，要求：空间复杂度为o(1)   不能借助辅助空间
class