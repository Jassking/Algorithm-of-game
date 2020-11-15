package cn.example.c_lk.b;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*101. 对称二叉树
给定一个二叉树，检查它是否是镜像对称的。
例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
    1
   / \
  2   2
   \   \
   3    3*/
public class Main41 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //迭代
    public boolean isSymmetric1(TreeNode root) {
        //判断根节点是否为空或者根节点的左节点和根节点的右节点是否为空
        if (root==null||(root.left==null&&root.right==null)){
            return true;
        }
        //用队列保存节点
        List<TreeNode> list=new LinkedList<>();
        //将根节点的左右孩子放到队列中
        list.add(root.left);
        list.add(root.right);
        while (list.size()>0){
            //从队列中取出两个节点，再比较这两个节点
            //取出队列第一个元素
            TreeNode left=list.remove(0);
            TreeNode right=list.remove(0);

            //如果两个节点都为空就继续循环
            if (left == null && right == null) {
                continue;
            }
            //两个节点中有一个为空，对比失败
            if (left == null || right == null) {
                return false;
            }
            //两个节点的值不相等，对比失败
            if (left.val != right.val) {
                return false;
            }
            //先进先出原则，分为两组
            //将左节点的左孩子， 右节点的右孩子放入队列
            list.add(left.left);
            list.add(right.right);
            //将左节点的右孩子，右节点的左孩子放入队列
            list.add(left.right);
            list.add(right.left);
        }
        return true;
    }



    //递归
    public boolean isSymmetric(TreeNode root) {
        //根节点为零，没有左子树和右子树，则是镜像对称
        if (root == null) {
            return true;
        }
        //调用递归函数，比较左节点，右节点
        return afs(root.left, root.right);
    }
    public boolean afs(TreeNode left, TreeNode right) {
        //递归的终止条件(三个条件顺序不可更改)

        //两个节点都为空,对比完成是镜像对称
        if (left == null && right == null) {
            return true;
        }
        //两个节点中有一个为空，对比失败
        if (left == null || right == null) {
            return false;
        }
        //两个节点的值不相等，对比失败
        if (left.val != right.val) {
            return false;
        }
        //比较 left 的左节点和 right 的右节点，再比较 left 的右节点和 right 的左节点
        return afs(left.left, right.right) && afs(left.right, right.left);
    }
}
