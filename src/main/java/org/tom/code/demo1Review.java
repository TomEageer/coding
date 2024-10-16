package org.tom.code;

/**
 * int类型打印对应32位2进制
 */
public class demo1Review {
    public static void main(String[] args) {
        exchange(-2);
    }
    public static void exchange(int num){
        for (int i = 31; i >= 0; i--){
            System.out.print((num & 1 << i) == 0 ? 0 : 1);
        }
        System.out.println();
    }
}
