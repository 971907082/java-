package com.wenli.sort;

public class BubbleSort {
    // 先写一个sort方法
    public static int[] sort(int[] array){
        //外层循环比较多少轮（n-1）
        for(int i = 1;i < array.length;i++){
            // 设置一个标记flag 如果数组已经是排好了的
            boolean flag = true;
            //内层循环 循环每一个元素 进而相邻元素进行比较
            for (int j = 0;j < array.length-i;j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
             //每一轮的结果进行一个输出
            System.out.print("第"+i+"轮排序的结果为:");
            display(array);
        }
        return array;
    }
    // 写一个循环遍历数组的方法
    public static void display(int[] array){
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //定义一个array数组
        int[] array = {2,4,8,9,5,7,6,1,3};

        System.out.print("排序前的数组为：");
        display(array);

        //将排序后的数组赋值给新的array
        array = sort(array);
        System.out.print("经过冒泡排序后的数组为：");
        display(array);
    }
}
