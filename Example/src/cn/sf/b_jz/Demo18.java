package cn.sf.b_jz;

/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）*/
public class Demo18 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return dfs(root1, root2);
    }

    //left左，right右
    private boolean dfs(TreeNode node, TreeNode root2) {
        boolean flag = false;
        if (node.val == root2.val) {
            flag = judge(node, root2);
        }
        if (flag) {
            return true;
        }
        boolean flag1 = false;
        boolean flag2 = false;

        if (node.left != null) {
            flag1 = dfs(node.left, root2);
        }
        if ((!flag1) && node.right != null) {
            flag2 = dfs(node.right, root2);
        }
        return flag1 || flag2;
    }

    private boolean judge(TreeNode node1, TreeNode node2) {
        if (node2==null){
            return true;
        }
        if (node1==null){
            return false;
        }
        boolean flag1 = true;
        boolean flag2 = true;
        if (node1.val == node2.val) {
            if (node1.left != null || node2.left != null) {
                flag1 = judge(node1.left, node2.left);
            }
            if (node1.right != null || node2.right != null) {
                flag2 = judge(node1.right, node2.right);
            }
            return flag1 && flag2;
        } else {
            return false;
        }
    }
}
