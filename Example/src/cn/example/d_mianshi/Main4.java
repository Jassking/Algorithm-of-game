package cn.example.d_mianshi;


public class Main4 {
    /*isSame��ֵ��false
    isSame2��ֵ��true
    1.isSame����User��new�����ģ�User����û����дequals���������Ե��õ�Object��equals������
    ��Ƚϵ��������Ƿ���ȣ�user1��user2����new�����ģ����õĵ�ַ�Ͳ�һ����
    2.isSame2��user1.nameʱʹ����String,���õ���String��д��equals�����ԱȽϵ������е������Ƿ�һ�¡�

    */
    public String name;

    public Main4(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Main4 user1 = new Main4("С��");
        Main4 user2 = new Main4("С��");
        boolean isSame = user1.equals(user2);
        boolean isSame2 = user1.name.equals(user2.name);
        System.out.println(isSame);
    }
}
