package cn.sf.a_sf;

/*һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
�����������һ��n����̨���ܹ��ж�����������*/
public class Demo9 {
    public int JumpFloorII(int target) {
        //1.���Ʒ�
        if (target == 1) {
            return 1;
        }
        int[] a = new int[target + 1];
        int sum = 1;//����һ��sum����ȥ��¼1��n-1�׵��ܵ������
        for (int i = 2; i <= target; i++) {
            a[i] = sum + 1;//���ڵ�i��̨�����ǵ��ڴӵ�1�׵���i-1��̨�׵������֮��Ȼ���ټ���1(����㵽i�׵����)
            sum = sum + a[i];//����1��i�׵������
        }
        return a[target];
    }
}
