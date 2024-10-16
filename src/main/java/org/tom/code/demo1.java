package org.tom.code;

/**
 * 输出int的二进制
 * 失误点：没有理解到原理，原理是输出32次比如 1000 100 10 1这样的去和需要打印的进行&运算
 * 如果该位上两个都是1，则输出1，
 * 对应的与运算若有结果则输出1，若没结果则输出0
 */
public class demo1 {
    public static void main(String[] args) {
        print(-1);
        print(2);
        print(3);
        print(4);
        print(8);
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((num & 1 << i) == 0 ? 0 : 1));
//            1000
//            0100
//            0010
//            0001
//            0011
        }
        System.out.println();
    }
}