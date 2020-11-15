package cn.example.c_lk.b;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*101. �Գƶ�����
����һ����������������Ƿ��Ǿ���ԳƵġ�
���磬������ [1,2,2,3,4,4,3] �ǶԳƵġ�
    1
   / \
  2   2
 / \ / \
3  4 4  3
����������� [1,2,2,null,3,null,3] ���Ǿ���ԳƵ�:
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

    //����
    public boolean isSymmetric1(TreeNode root) {
        //�жϸ��ڵ��Ƿ�Ϊ�ջ��߸��ڵ����ڵ�͸��ڵ���ҽڵ��Ƿ�Ϊ��
        if (root==null||(root.left==null&&root.right==null)){
            return true;
        }
        //�ö��б���ڵ�
        List<TreeNode> list=new LinkedList<>();
        //�����ڵ�����Һ��ӷŵ�������
        list.add(root.left);
        list.add(root.right);
        while (list.size()>0){
            //�Ӷ�����ȡ�������ڵ㣬�ٱȽ��������ڵ�
            //ȡ�����е�һ��Ԫ��
            TreeNode left=list.remove(0);
            TreeNode right=list.remove(0);

            //��������ڵ㶼Ϊ�վͼ���ѭ��
            if (left == null && right == null) {
                continue;
            }
            //�����ڵ�����һ��Ϊ�գ��Ա�ʧ��
            if (left == null || right == null) {
                return false;
            }
            //�����ڵ��ֵ����ȣ��Ա�ʧ��
            if (left.val != right.val) {
                return false;
            }
            //�Ƚ��ȳ�ԭ�򣬷�Ϊ����
            //����ڵ�����ӣ� �ҽڵ���Һ��ӷ������
            list.add(left.left);
            list.add(right.right);
            //����ڵ���Һ��ӣ��ҽڵ�����ӷ������
            list.add(left.right);
            list.add(right.left);
        }
        return true;
    }



    //�ݹ�
    public boolean isSymmetric(TreeNode root) {
        //���ڵ�Ϊ�㣬û���������������������Ǿ���Գ�
        if (root == null) {
            return true;
        }
        //���õݹ麯�����Ƚ���ڵ㣬�ҽڵ�
        return afs(root.left, root.right);
    }
    public boolean afs(TreeNode left, TreeNode right) {
        //�ݹ����ֹ����(��������˳�򲻿ɸ���)

        //�����ڵ㶼Ϊ��,�Ա�����Ǿ���Գ�
        if (left == null && right == null) {
            return true;
        }
        //�����ڵ�����һ��Ϊ�գ��Ա�ʧ��
        if (left == null || right == null) {
            return false;
        }
        //�����ڵ��ֵ����ȣ��Ա�ʧ��
        if (left.val != right.val) {
            return false;
        }
        //�Ƚ� left ����ڵ�� right ���ҽڵ㣬�ٱȽ� left ���ҽڵ�� right ����ڵ�
        return afs(left.left, right.right) && afs(left.right, right.left);
    }
}
