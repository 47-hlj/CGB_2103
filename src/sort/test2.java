package sort;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //1. 输入数组长度
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入数组长度：");
        int n = scanner.nextInt();
        //2. 创建随机数组
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        // 3. 打印排序前数组
        System.out.println("排序前数组：" + Arrays.toString(arr));
        // 4.排序，并打印排序后的数组
//        InsertSort.insertSort(arr);//插入排序
//        BubbleSort.bubbleSort(arr);//冒泡排序
//        SelectSort.selectSort(arr);//选择排序
//        QuickSort.quickSort(arr);//快速排序
//        HeapSort.heapSort(arr);//堆排序
        MergeSort.mergeSort(arr);//归并排序
        System.out.println("排序后数组：" + Arrays.toString(arr));
    }
}