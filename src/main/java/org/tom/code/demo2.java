package org.tom.code;

/**
 * Created by IntelliJ IDEA.
 *
 * 运算符号 复习
 *
 * @author : shenyue
 * @date: 2024/10/27
 */
public class demo2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 4;
        int d = 7;
        int e = 8;
        int f = 9;

        /*
         * 正数：原码和补码一致   原码的第一位是0
         * 负数：补码为原码取反+1 原码的第一位是1
         * 左移：<< (* n)
         * 右移：>> (/ n)
         * 逻辑右移(不管符号位): >>>
         */

        /*
         * 相反数实现方式：取反 + 1
         * 原理：
         */
        System.out.println(~a + 1);

        /*
         * 按位与：&
         * 按位或：|
         * 按位非：~ 取反
         * 按位异或；^ 相同为0，不相同为1
         *
         * 逻辑与：&&
         * 逻辑或：||
         * 逻辑非：! 布尔运算
         */
    }

}
