package cn.example.c_lk.a;

/*给定一个字符串（以字符数组的形式给出）和一个偏移量，根据偏移量原地旋转字符串(从左向右旋转)。*/
/*原地旋转意味着你要在s本身进行修改。你不需要返回任何东西。
样例
样例 1:
输入:  str="abcdefg", offset = 3
输出:  str = "efgabcd"
样例解释:  注意是原地旋转，即str旋转后为"efgabcd"
样例 2:
输入: str="abcdefg", offset = 0
输出: str = "abcdefg"
样例解释: 注意是原地旋转，即str旋转后为"abcdefg"
样例 3:
输入: str="abcdefg", offset = 1
输出: str = "gabcdef"
样例解释: 注意是原地旋转，即str旋转后为"gabcdef"
样例 4:
输入: str="abcdefg", offset =2
输出: str = "fgabcde"
样例解释: 注意是原地旋转，即str旋转后为"fgabcde"
样例 5:
输入: str="abcdefg", offset = 10
输出: str = "efgabcd"
样例解释: 注意是原地旋转，即str旋转后为"efgabcd"
挑战
在数组上原地旋转，使用O(1)的额外空间
*/
public class Main3 {
    public static void main(String[] args) {
        String string = "";
        char[] str = string.toCharArray();
        rotateString(str, 3);
    }

    public static void rotateString(char[] str, int offset) {
        if (str.length == 0 || offset == 0) {
            return;
        }
        offset = offset % str.length;//实际偏移量
        for (int j = 0; j < offset; j++) {//每次向后偏移一位
            char temp = str[str.length - 1];//存储最后一个数
            for (int i = str.length - 1; i > 0; i--) {//下标的后一个等于前一个, 实现数组向右偏移一位,
                str[i] = str[i - 1];
            }
            str[0] = temp;//将存储最后一个数赋值给数组第一个位置
        }
        System.out.println(str);
    }
}
