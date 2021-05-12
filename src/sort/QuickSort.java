package sort;

/**
 * 快速排序
 *  算法思想:
 *
 *  时间复杂度:O(nlog2n)  最优:O(nlog2n)      最差:O(n*n)
 *  空间复杂度:O(nlog2n)
 *  稳定性:不稳定
 */
public class QuickSort {
    public static void quickSort(int[] list){
        quickSort(list,0,list.length-1);
    }
    public static void quickSort(int[] list,int low,int high){
        int mid=partition(list,low,high);
        if(low<mid-1) quickSort(list,low,mid-1);
        if(mid+1<high) quickSort(list,mid+1,high);
    }

    public static int partition(int[] list,int low,int high){
        int base = list[low];
        while(low<high){
            while(low<high&&list[high]>=base) high--;
            list[low] = list[high];
            while(low<high&&list[low]<=base) low++;
            list[high] = list[low];
        }
        list[low] = base;
        return low;
    }

}