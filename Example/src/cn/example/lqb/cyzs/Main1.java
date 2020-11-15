package cn.example.lqb.cyzs;

public class Main1 {
    /*
例如，将字符串 YeRi 加密可得字符串 EaFn。
小明有一个随机的字符串，加密后为
EaFnjISplhFviDhwFbEjRjfIBBkRyY
（由 30 个大小写英文字母组成，不包含换行符），请问原字符串是多少？
（如果你把以上字符串和表格复制到文本文件中，请务必检查复制的内容
是否与文档中的一致。在试题目录下有一个文件 str.txt，第一行为上面的字符
串，后面 52 行依次为表格中的内容。）
public class B解密 {
    public static void main(String[] args) {
        HashMap<Character,Character> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<52;i++){
            char a = sc.next().trim().charAt(0);
            char b = sc.next().trim().charAt(0);
            map.put(b,a);
        }
        String s = sc.next();
        char[] num = s.toCharArray();
        for (char c:num){
            System.out.print(map.get(c));
        }
    }
}

小明要做一个跑步训练。
初始时，小明充满体力，体力值计为 10000。如果小明跑步，每分钟损耗
600 的体力。如果小明休息，每分钟增加 300 的体力。体力的损耗和增加都是
均匀变化的。
小明打算跑一分钟、休息一分钟、再跑一分钟、再休息一分钟……如此循
环。如果某个时刻小明的体力到达 0，他就停止锻炼。
请问小明在多久后停止锻炼。为了使答案为整数，请以秒为单位输出答案。
答案中只填写数，不填写单位。
public class C跑步训练 {
    public static void main(String[] args) {
        int target = 10000;
        int count = 0;
        boolean flag = true;
        while (true) {
            //如果小于600体力并且需要跑步，证明这一分钟跑不完
            if (target < 600 && flag){
                break;
            }
            if (flag) {
                target -= 600;
                flag = false;
            } else {
                target += 300;
                flag = true;
            }
            count++;
        }
//        System.out.println(count);
        //最后要求秒数，一分钟花费600体力，一秒花费10体力，体力除10就是剩下的跑步时间
        int time = count * 60+target/10;
        System.out.println(time);
    }
}

附件 prog.txt 中是一个用某种语言写的程序。
其中 REPEAT k 表示一个次数为 k 的循环。循环控制的范围由缩进表达，
从次行开始连续的缩进比该行多的（前面的空白更长的）为循环包含的内容。
例如如下片段：
Java实现第十一届蓝桥杯 省赛真题（希望能和各位大佬能一起讨论算法题：讨论群：99979568）_第2张图片
A = A + 4 所在的行到 A = A + 8 所在的行都在第一行的
循环两次中。
REPEAT 6: 所在的行到 A = A + 7 所在的行都在 REPEAT 5: 循环中。
A = A + 5 实际总共的循环次数是 2 × 5 × 6 = 60 次。
请问该程序执行完毕之后，A 的值是多少？
public class E_REPEAT程序 {
    public static void main(String[] args) {
        int A=0;
        for (int i=0;i<2;i++){
            A+=4;
            for (int j=0;j<5;j++){
                for (int k=0;k<6;k++){
                    A+=5;
                }
                A+=7;
            }
            A+=8;
        }
        A+=9;
        System.out.println(A);
    }
}






*/
}
