package cn.sf.a_sf;

/*һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������*/
public class Demo8 {
    public int JumpFloor(int target) {
        //1.�ݹ鷨
        /*if (target == 1) {
            return 1;
        }
        if (target == 2) {//return�е�һ��1����ʾ����һ�������ף�JumpFloor(target - 1)����ʾ����һ�ε�һ��
            return 1 + JumpFloor(target - 1);
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);*/

        //2.���Ʒ�
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 1 + JumpFloor(target - 1);
        }
        int[] a = new int[target + 1];// a[i] �������㵽�ڽ׵��ܵ������
        a[1] = 1;//��һ�����������1
        a[2] = 2;//�ڶ������������2
        for (int i = 3; i <= target; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[target];
    }
}
