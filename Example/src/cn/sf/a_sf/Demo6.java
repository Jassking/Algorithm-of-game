package cn.sf.a_sf;

public class Demo6 {
    /*��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/
    public int minNumberInRotateArray(int[] array) {
        //ʹ�ñ�����
        if (array.length == 0) {
            return 0;
        }
        int ans=array[0];
        for (int i = 1; i < array.length; i++) {
            ans=Math.min(ans,array[i]);//�ҳ� ans �� array[i] ����Сֵ����������ֵ�� ans
        }
        return ans;


        //ʹ�ö��ַ�
       /* if (array.length == 0) {
            return 0;
        }
        int l = 0;//���
        int r = array.length-1;//�ұ�
        while (l < r - 1) {//���ұߵ�ָ���ܵ���ߵ�ָ������
            int mid = (l + r) / 2;//���㵱ǰ�м��ֵ
            if (array[mid] >= array[l]) {//���м��ֵ���ڵ�����ߵ�ֵʱ
                l = mid;//��ָ���ƶ����м�ֵ���±�
            } else if (array[mid] <= array[r]) {//���м��ֵС�ڵ����ұߵ�ֵʱ
                r = mid;//��ָ���ƶ����м�ֵ���±�
            }
        }
        return array[r];*/
    }
}
