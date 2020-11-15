package cn.sf.a_sf;

/*����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
���������ǰ���������������Ľ���ж������ظ������֡�
��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�*/
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
        int len1 = 0;//��ǰ�ڵ���������Ľڵ�ĸ���
        int len2 = 0;//��ǰ�ڵ���������Ľڵ�ĸ���
        for (int i = 0; i < tempIn.length; i++) {
            if (pre[index] == tempIn[i]) {
                break;
            }
            len1++;//�������ڵ�ĸ���++
        }
        len2 = tempIn.length - len1 - 1;

        int index1 = 0;
        int index2 = 0;
        int[] temp1 = new int[len1];//��ǰ�ڵ��������
        int[] temp2 = new int[len2];//��ǰ�ڵ��������
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
        node.right = null;//�ҽڵ�
        node.left = null;//��ڵ�
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
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};//ǰ�����
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};//�������
        TreeNode root = reConstructBinaryTree(pre, in);
    }
}
