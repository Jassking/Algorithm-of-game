package cn.sf.a_sf;

/*输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Demo4 {
    private static int index = 0;

    private static TreeNode solve(int[] pre, int[] tempIn) {
        int len1 = 0;//当前节点的左子树的节点的个数
        int len2 = 0;//当前节点的右子树的节点的个数
        for (int i = 0; i < tempIn.length; i++) {
            if (pre[index] == tempIn[i]) {
                break;
            }
            len1++;//左子树节点的个数++
        }
        len2 = tempIn.length - len1 - 1;

        int index1 = 0;
        int index2 = 0;
        int[] temp1 = new int[len1];//当前节点的左子树
        int[] temp2 = new int[len2];//当前节点的右子树
        boolean flag = false;
        for (int i = 0; i < tempIn.length; i++) {
            if (pre[index] == tempIn[i]) {
                flag = true;
            } else if (!flag) {
                temp1[index1++] = tempIn[i];
            } else {
                temp2[index2++] = tempIn[i];
            }
        }
        TreeNode node = new TreeNode(pre[index]);
        node.right = null;//右节点
        node.left = null;//左节点
        if (index < pre.length && temp1.length > 0) {
            index++;
            node.left = solve(pre, temp1);
        }
        if (index < pre.length && temp2.length > 0) {
            index++;
            node.right = solve(pre, temp2);
        }
        return node;
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        index = 0;
        return solve(pre, in);
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};//前序遍历
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};//中序遍历
        TreeNode root = reConstructBinaryTree(pre, in);
    }
}
