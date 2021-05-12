package sort;

/**
 * 插入排序
 *  算法思想：将每个元素插入一个已经排好序的线性表中，直到整个线性表有序
 *  时间复杂度：O(n*n)  最优：O(n)   最差：O(n*n)
 *  空间复杂度：O(1);
 *  稳定性：稳定
 *  适用于大部分已经有序的情况，且越大越好
 */
public class InsertSort {
    public static void insertSort(int[] list){
        for(int i=1;i<list.length;i++){//从数组下标为1的位置开始，下标0为已排序好部分
            int temp=list[i];//保存待排序的数组元素
            int j;
            for(j=i-1;j>=0&&list[j]>temp;j--){
                /* 将待排序的list[i]插入到已经排序好的部分list[0]-list[i-1]
                   从排好部分的后面开始比较
                   如果大于，则后移
                   如果小于或者等于，则在排好的序列中找到插入的位置
                 */
                list[j+1]=list[j];//插入已排序的序列
            }
            list[j+1]=temp;
        }
    }
}
