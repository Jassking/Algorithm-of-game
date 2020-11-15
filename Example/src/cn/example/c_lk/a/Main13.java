package cn.example.c_lk.a;

/*1258. Ư��������
Ư��������Ķ����Ǿ��� numOdds ������Ԫ�ص��κγ��ȵ����顣
����һ����������ɵ����� nums �Լ�һ������ numOdds���ҳ������������е�Ư�������顣
ֻҪ������Ŀ�ʼ�����Լ�����������һ������ô������������Ͳ�һ��������Ư���������������
����
ʾ�� 1:
����:
nums = [1, 2, 3, 4, 5]
numOdds = 2
���: 4
����: ��4���������к�����������������:  [1, 2, 3], [1, 2, 3, 4], [2, 3, 4, 5], [3, 4, 5].
ʾ�� 2:
����:
nums = [2, 4, 6, 8]
numOdds = 1
���: 0
����: ������û������Ԫ��
ע������
    nums �����鳤�ȷ�Χ��: [1, 100000]
    numOdds �ķ�Χ��: [1, 100000]
    ��֤���صĽ����int����
*/
/*ͨ��95%��������*/
public class Main13 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(BeautifulSubarrays(nums, 2));
    }

    public static int BeautifulSubarrays(int[] nums, int numOdds) {
        int length = nums.length;
        int sum = 0;
        int odd = 0;//����
        int residue = 0;//ʣ�����
        int sumend = 0;//������������Ư���������������
        for (int i = 0; i < length; i++) {//�����ܹ��ж�������
            if (nums[i] % 2 == 0) {
                sum++;//���㵱ǰѭ��λ��
                if (sum == length) {
                    return 0;
                }
            } else {
                odd++;
            }
        }
        int oddend = odd;//�����ܹ��ж�������
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (nums[j] % 2 != 0) {
                    odd--;
                    residue++;
                    if (residue == numOdds) {//һ��������������numOdds�����
                        sumend++;
                    }
                } else {
                    if (residue == numOdds) {//�����������ż��Ҳ���
                        sumend++;
                    }
                }
                if (j == length - 1) {//�жϵ�ǰѭ���Ƿ��������������ָ�֮ǰ������ֵ
                    odd = oddend;
                    residue = 0;
                }
            }
        }
        return sumend;
    }
}
