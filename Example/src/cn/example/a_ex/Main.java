package cn.example.a_ex;
/*������Ӵ�*/
public class Main {
    public static void main(String[] args) {
        System.out.println(getMaxSubString("dabcdefggwgeweg","abcdefg"));
    }

    //����Ӵ�
    public static String getMaxSubString(String str1,String str2){
        //�������������������洢���жϵ��ַ���
        String max="";
        String min="";
        //һЩ�������ж�
        if(str1==null||str2==null||str1.isEmpty()||str2.isEmpty()){
            return null;
        }
        if(str1.length()>=str2.length()){
            max=str1;
            min=str2;
        }else{
            max=str2;
            min=str1;
        }
        //�Գ��Ƚ϶̵��ַ�������ȡ���Ӵ���n,n-1,n-2......1��
        for(int i=0;i<min.length();i++){
            //ÿ���Ӵ����ȼ�һ���жϴ��Ƿ�����Ӵ�
            for(int beg=0,end=min.length()-i;end<=min.length();beg++,end++){
                //ȡ�Ӵ�
                String s=min.substring(beg,end);
                //������к����Ӵ����򷵻��Ӵ������Ӵ��������Ĺ����Ӵ�
                //����Ҳ����ʹ��java��String���ṩ��contains()����������ѡ���Լ�дһ�����Ƶķ���
                if(containString(max,s)){
                    return s;
                }
            }
        }
        //���򷵻�null����ʾ�����ڹ����Ӵ�
        return null;
    }

    //�ж�һ���ַ����Ƿ������һ���ַ���
    public static boolean containString(String str1,String str2){
        //�������������������洢�����Ӵ�
        String min="";
        String max="";
        if(str1==null||str2==null){
            return false;
        }
        if(str1.length()>=str2.length()){
            max=str1;
            min=str2;
        }else{
            max=str2;
            min=str1;
        }
        //����һ�������������洢�жϹ����г��ֵ��ַ���
        String s="";
        //ѭ���ж������ַ���
        for(int i=0;i<max.length();i++){
            //���岢����һ������i�ĸ���
            int index=i;
            for(int j=0;j<min.length();j++){
                //��������ַ���ȣ���������ַ�������index+1
                if(max.charAt(index)==min.charAt(j)){
                    s+=min.charAt(j)+"";
                    index++;
                }else{//����Ļ����������м���������˳��ڲ�ѭ����ʹ��i++
                    s="";
                    j=0;
                    index=i;
                    break;
                }
            }
            //ÿ���ڲ�ѭ���������ж�s�Ƿ����min���������򷵻�true���������ѭ��
            if(s.equals(min)){
                return true;
            }
        }
        return false;
    }
}
