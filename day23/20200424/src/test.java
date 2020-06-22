/**
 * Created   with    Intellij   IDEA
 *
 * @auther majingni
 * @data 2020-04-24   15:30
 */

public class test {


    // 求二叉树的高度
    public int getHeight()
    {
        return getHeight(root);
    }
    private int getHeight(BTNode root){
        if(null == root){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight? leftHeight+1 : rightHeight+1;
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(BTNode root){
        if(null != root){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }
    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            int[] nums = new int[count];
            int[] result = new int[5];
            for (int i=0;i<count;i++){
                nums[i] = sc.nextInt();
            }
            boolean flag = true;
            int c4Count = 0;
            for (int num : nums){
                switch (num%5){
                    case 0:
                        if (num%2 == 0){
                            result[0] += num;
                        }
                        break;
                    case 1:
                        if (flag){
                            result[1] += num;
                            flag = false;
                        }else {
                            result[1] -= num;
                            flag = true;
                        }
                        break;
                    case 2:
                        result[2]++;
                        break;
                    case 3:
                        result[3] += num;
                        c4Count++;
                        break;
                    case 4:
                        if (num > result[4]){
                            result[4] = num;
                        }
                        break;
                    default:
                        throw new RuntimeException("错误");
                }
            }
            print(result,c4Count);
        }
        private static void print(int[] nums,int count){
            for (int i=0;i<nums.length;i++){

                if (i == nums.length-1) {
                    if (nums[i] == 0) {
                        System.out.print("N");
                    } else {
                        System.out.print(nums[i]);
                    }
                }else if (i == 3){
                    if (count != 0){
                        System.out.printf("%.1f ",(double)nums[3]/count);
                    }else {
                        System.out.print("N ");
                    }
                } else {
                    if (nums[i] == 0){
                        System.out.print("N ");
                    }else {
                        System.out.print(nums[i]+" ");
                    }
                }
            }
        }
    }
    public class IsBalancedTree {
        boolean isBalance=true;
        public boolean IsBalanced_Solution(TreeNode root) {
            TreeDepth1(root);
            return isBalance;
            //isBalance 会在 TreeDepth1(root)中赋值。
        }
        public int TreeDepth1(TreeNode root) {
            if (root == null)
                return 0;
            int left = TreeDepth1(root.left);
            //左子树高度
            int right = TreeDepth1(root.right);
            //右子树高度
            if (Math.abs(left - right) > 1) {
                isBalance = false;
                //只要有一个子树的左右子树的高度绝对值大于 1 isBalance=false
            }
            return Math.max(left, right) + 1;
        }
        public int getHeight(TreeNode root){

            if(root==null) return 0;
            return max(getHeight(root.left),getHeight(root.right))+1;
        }

        private int max(int a, int b){

            return (a>b)?a:b;
        }
         if(root==null) return true;

      if(Math.abs(getHeight(root.left)-getHeight(root.right))>1) return false;

      return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }
