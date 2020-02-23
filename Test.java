/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-02-20   11:02
 */
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
  /*int[]  nums1={1,2,3,5};
  int  m=4;
  int[]  nums2={4,5};
  int n=2;
  merge(nums1,m,nums2,n);

        int[] nums2 = {4, 5};
        boolean b = containsDuplicate(nums2);
        System.out.println(b);*/
        String s = "is-isma";
        String s1 = reverseOnlyLetters(s);
        System.out.println(s1);
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m];
        System.arraycopy(nums1, 0, nums, 0, m);
        int p1 = 0, p2 = 0, p = 0;
        while (p1 < m && p2 < n) {
            if (nums[p1] <= nums2[p2]) {
                nums1[p] = nums[p1];
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p2++;
            }
            p++;
        }
        while (p1 < m) {
            nums1[p] = nums[p1];
            p1++;
            p++;
        }
        while (p2 < n) {
            nums1[p] = nums2[p2];
            p2++;
            p++;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       /*for(int i=m,k=0;i<=nums1.length&&k<n;i++,k++){
           nums1[i]=nums2[k];
       }
         Arrays.sort(nums1);
         System.out.println(Arrays.toString(nums1));
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            if(nums1[len1]>nums2[len2]){
                nums1[len--]=nums1[len1--];
            }else{
                nums1[len--]=nums2[len2--];
            }
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);*/
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }

    //给定一个整数数组，判断是否存在重复元素。如果任何值在数组中出现至少两次，函数返回 true。如果数组中
//每个元素都不相同，则返回 false
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入1 次或多次。你将会检查键盘输入的字符 typed。
    // 如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
    public boolean isLongPressedName(String name, String typed) {

        return true;
    }

    //给定一个字符串 S ，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转
    public static String reverseOnlyLetters(String s) {
        int[] array = new int[s.length()];
        char[] a = new char[s.length()];
        int j = 0;
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
                s1.append(c);
            } else {
                a[j] = c;
                array[j] = i;
                j++;
            }
        }
        s1.reverse();
        for (int i = 0; i < j; i++) {
            s1.insert(array[i], a[i]);//insert(int offect,数据类型)
        }
        return s1.toString();
    }
}























