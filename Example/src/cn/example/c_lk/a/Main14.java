package cn.example.c_lk.a;
/*1669. ����
����һ����������Ľ���ʦ��
�������������ľͷ�Ƴɡ�ÿ�����ӱ�����һjie������ľͷ���Ҳ����Ǳ����ӵõ��ġ�
����n�ξ��в�ͬ���ȵ�ľͷ�����������m���߶��ϸ���ͬ�����ӡ���ô���������߶��Ƕ��١�(m�����ӵĸ߶�)
����
���� 1:
���룺m = 3, [2, 3, 4]
�����2
���ͣ�ѡ�񳤶�Ϊ2��ľͷ���ҳ���Ϊ4��ľͷ����Ϊ���γ���Ϊ2��ľͷ��
���� 2:
���룺m = 3, [2, 10]
�����3
���ͣ�����Ϊ10��ľͷ��Ϊ3�γ���Ϊ3��ľͷ��һ������Ϊ1��ľͷ��
ע������
    1<=n<=100000
    1<=m<=100000
*/
public class Main14 {
    public static void main(String[] args) {
        int[] n={232, 124, 456};
        System.out.println(woodCut(n, 7));
    }

    public static int woodCut(int[] L, int k) {
        int i = 0; int j = 0; int sum = 0; int max = 0; int  max0 = 0; int t = 0;
        if (L == null || L.length == 0) {
            return 0;
        }
        int []J = new int [L.length];
        for (i = 0; i < L.length; i++) {
            J[i] = L[i];
            sum += L[i] / k;
        }
        for (i = 0; i < L.length - 1; i++) {
            if (L[0] < L[i]) {
                t = L[0];
                L[0] = L[i];
                L[i] = t;
            }
        }
        max0 = Math.max(sum, L[0]);
        for (max = max0; max >= 1; max--) {
            sum = 0;
            for (i = 0; i < L.length; i++) {
                sum += J[i] / max;
            }
            if (sum >= k) {
                break;
            }
        }
        return max;
    }
}
