package com.wenli.sort;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] array) {
        print(array);
        int[] temp = new int[array.length];
        doSort(array, temp, 0, array.length - 1);
        print(array);
        return array;
    }

    private void doSort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            // 划分左右子序列
            int mid = left + (right - left) / 2;
            // 划分左子序列
            doSort(array, temp, left, mid);
            // 划分右子序列
            doSort(array, temp, mid + 1, right);
            // 合并并排序左右子序列
            merge(array, temp, left, mid, right);
        }
    }

    private void merge(int[] array, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }
        int i = left; // 左子序列起始索引
        int j = mid + 1; // 右子序列起始索引
        int k = left; // 合并后的序列索引
        while (i <= mid && j <= right) { // 通过该循环比较依次左右子序列的元素，直到一个序列遍历完
            if (temp[i] < temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
            print(array);
        }
        // 循环结束，当左子序列已全部比较完，右子序列没有比较完时
        while (j <= right) {
            array[k] = temp[j];
            k++;j++;
            print(array);
        }
        // 循环结束，当右子序列已全部比较完，左子序列没有比较完时
        while (i <= mid) {
            array[k] = temp[i];
            k++;i++;
            print(array);
        }
    }

    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] a = {9,5,6,4,3,1,8,7,2};
        ms.mergeSort(a);
    }

}
