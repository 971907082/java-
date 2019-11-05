package com.wenli.sort;

public class A {

    // 递归求斐波那契数列的第n项的值
    // f(0) = 0,f(1) = 1, f(n) = f(n-1) + f(n-1)
    public int getNth(int n) {
        if (n >= 2) {
            return getNth(n - 1) + getNth(n - 2);
        }
        return n;
    }

}
