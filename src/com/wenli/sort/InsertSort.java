package com.wenli.sort;

public class InsertSort {
    public static int[] sort(int[] array){
        int j;
        //数组中的第一个数字肯定是默认排好序的 那么要从第二个数字开始选择合适的位置插入
        for (int i = 1;i < array.length;i++){
            int tmp = array[i];//记录一下要插入的数据
            //因为我这里不清楚我到底要进行多少次循环 所以用while
            j = i;
            while (j > 0 && tmp < array[j-1]){
                array[j] = array[j-1];//往后挪一位
                j--;
            }
            array[j] = tmp;//插入数据
        }
        return array;
    }

    //写一个循环遍历数组的方法
    public static  void diplay(int[] array){
        for (int i = 1;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] array = {2,4,8,9,5,7,6,1,3};
        System.out.print("排序前的数组为:");
        diplay(array);
        array = sort(array);
        System.out.print("经过插入排序后的数组为:");
        diplay(array);
    }
}
