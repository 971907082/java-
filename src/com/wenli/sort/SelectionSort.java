package com.wenli.sort;

public class SelectionSort {
    public static  int[] sort(int[] array){
        // 总共肯定需要比较n-1轮
        for (int i = 1;i < array.length;i++){
            //假设第一个元素为最小
            int min = i-1;
            //内层循环每一轮需要比较的次数
            for(int j = i;j < array.length;j++){
                //找出第一轮最小的一个数元素
                if (array[j] < array[min]){
                       min = j;//记录一下它的下标
                }
            }
            // 如果第一个元素不是最小的值 则进行一个互换
            if ((i-1)!=min) {
                int temp = array[i-1];
                array[i-1] = array[min];
                array[min] = temp;
            }
            //把每一轮的比较结果显示出来
            System.out.println("第"+i+"轮排序的结果为");
            display(array);
        }
        return array;
    }

    //写一个遍历数组的方法
    public static void display(int[] array){
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3};
        System.out.print("未排序的数组为：");
        display(array);
        array = sort(array);
        System.out.print("经过选择排序后的数组为：");
        display(array);
    }
}
