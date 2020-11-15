package cn.example.lqb.a2019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
5.迷宫：

    下图给出了一个迷宫的平面图，其中标记为1 的为障碍，标记为0 的为可
    以通行的地方。

    010000
    000100
    001001
    110000

        1
        2
        3
        4

    迷宫的入口为左上角，出口为右下角，在迷宫中，只能从一个位置走到这
    个它的上、下、左、右四个方向之一。
    对于上面的迷宫，从入口开始，可以按DRRURRDDDR 的顺序通过迷宫，
    一共10 步。其中D、U、L、R 分别表示向下、向上、向左、向右走。

    对于下面这个更复杂的迷宫（30 行50 列），请找出一种通过迷宫的方式，
    其使用的步数最少，在步数最少的前提下，请找出字典序最小的一个作为答案。
    请注意在字典序中D<L<R<U。

    01010101001011001001010110010110100100001000101010
    00001000100000101010010000100000001001100110100101
    01111011010010001000001101001011100011000000010000
    01000000001010100011010000101000001010101011001011
    00011111000000101000010010100010100000101100000000
    11001000110101000010101100011010011010101011110111
    00011011010101001001001010000001000101001110000000
    10100000101000100110101010111110011000010000111010
    00111000001010100001100010000001000101001100001001
    11000110100001110010001001010101010101010001101000
    00010000100100000101001010101110100010101010000101
    11100100101001001000010000010101010100100100010100
    00000010000000101011001111010001100000101010100011
    10101010011100001000011000010110011110110100001000
    10101010100001101010100101000010100000111011101001
    10000000101100010000101100101101001011100000000100
    10101001000000010100100001000100000100011110101001
    00101001010101101001010100011010101101110000110101
    11001010000100001100000010100101000001000111000010
    00001000110000110101101000000100101001001000011101
    10100101000101000000001110110010110101101010100001
    00101000010000110101010000100010001001000100010101
    10100001000110010001000010101001010101011111010010
    00000100101000000110010100101001000001000000000010
    11010000001001110111001001000011101001011011101000
    00000110100010001000100000001000011101000000110011
    10101000101000100010001111100010101001010000001000
    10000010100101001010110000000100101010001011101000
    00111100001000010000000110111000000001000000001011
    10000001100111010111010001000110111010101101111000

        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        11
        12
        13
        14
        15
        16
        17
        18
        19
        20
        21
        22
        23
        24
        25
        26
        27
        28
        29
        30

    这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一
    个字符串，包含四种字母D、U、L、R，在提交答案时只填写这个字符串，填写多余的内容将无法得分。
*/
public class Main3 {
    /*
     * 深度优先可以这样想，一个人迷路，遇到很多分叉路口，他只有一个人，并且想走出去，所以只能一个个尝试，
     * 一条道路走到黑，发现到头了，然后再拐回去走刚才这条路的其他分叉路口，最后发现这条路的所有分叉路口走完了
     * ，选择另外一条路继续以上操作，直到所有的路都走过了。
     * 广度优先并不是这样，一个人迷路，但是他有技能（分身术）它遇到分叉路口，不是选一个走，而是分身多个人都试试，
     * 比如有A、B、C三个分叉路口，它A路走一步，紧接着B路也走一步，然后C路也赶紧走一步，步伐整齐统一，直到所有的路走过了。
     */ public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String s = "01010101001011001001010110010110100100001000101010"
                    + "00001000100000101010010000100000001001100110100101"
                    + "01111011010010001000001101001011100011000000010000"
                    + "01000000001010100011010000101000001010101011001011"
                    + "00011111000000101000010010100010100000101100000000"
                    + "11001000110101000010101100011010011010101011110111"
                    + "00011011010101001001001010000001000101001110000000"
                    + "10100000101000100110101010111110011000010000111010"
                    + "00111000001010100001100010000001000101001100001001"
                    + "11000110100001110010001001010101010101010001101000"
                    + "00010000100100000101001010101110100010101010000101"
                    + "11100100101001001000010000010101010100100100010100"
                    + "00000010000000101011001111010001100000101010100011"
                    + "10101010011100001000011000010110011110110100001000"
                    + "10101010100001101010100101000010100000111011101001"
                    + "10000000101100010000101100101101001011100000000100"
                    + "10101001000000010100100001000100000100011110101001"
                    + "00101001010101101001010100011010101101110000110101"
                    + "11001010000100001100000010100101000001000111000010"
                    + "00001000110000110101101000000100101001001000011101"
                    + "10100101000101000000001110110010110101101010100001"
                    + "00101000010000110101010000100010001001000100010101"
                    + "10100001000110010001000010101001010101011111010010"
                    + "00000100101000000110010100101001000001000000000010"
                    + "11010000001001110111001001000011101001011011101000"
                    + "00000110100010001000100000001000011101000000110011"
                    + "10101000101000100010001111100010101001010000001000"
                    + "10000010100101001010110000000100101010001011101000"
                    + "00111100001000010000000110111000000001000000001011"
                    + "10000001100111010111010001000110111010101101111000";
            int[][] labyrinth = new int[30][50];
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 50; j++) {
                    labyrinth[i][j] = s.charAt(50 * i + j) - '0';
                }
            }
            System.out.println(BFS(labyrinth, 30, 50));
        } catch (Exception e) {
            input.close();
        }
    }

    public static String BFS(int[][] labyrinth, int row, int column) {
        int[][] stepArr = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };
        String[] direction = { "U", "R", "L","D"};
        int[][] visit = new int[row][column];// 标记是否已经访问过
        StringBuilder sb = new StringBuilder();
        Node node = new Node(0, 0, -1, -1, 0, null);
        Queue<Node> queue = new LinkedList<Node>();
        Stack<Node> stack = new Stack<Node>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node head = queue.poll();
            stack.push(head); // 用于回溯路径
            visit[head.x][head.y] = 1;
            for (int i = 0; i < 4; i++) {
                int x = head.x + stepArr[i][0];
                int y = head.y + stepArr[i][1];
                String d = direction[i];
                // exit
                if (x == row - 1 && y == column - 1 && labyrinth[x][y] == 0 && visit[x][y] == 0) {
                    // 打印路径
                    Node top = stack.pop();
                    sb.append(d);
                    sb.append(top.direction);
                    int preX = top.preX;
                    int preY = top.preY;
                    while (!stack.isEmpty()) {
                        top = stack.pop();
                        if (preX == top.x && preY == top.y) {
                            if (top.direction != null)
                                sb.append(top.direction);
                            preX = top.preX;
                            preY = top.preY;
                        }

                    }
                    return sb.reverse().toString();
                }
                // bfs
                if (x >= 0 && x < row && y >= 0 && y < column && labyrinth[x][y] == 0 && visit[x][y] == 0) {
                    Node newNode = new Node(x, y, head.x, head.y, head.step + 1, d);
                    queue.offer(newNode);
                }
            }
        }
        return null;
    }
}

class Node {
    int x, y;
    int step;
    int preX, preY;
    String direction;

    Node(int x, int y, int preX, int preY, int step, String direction) {
        this.x = x;
        this.y = y;
        this.preX = preX;
        this.preY = preY;
        this.step = step;
        this.direction = direction;
    }
}
