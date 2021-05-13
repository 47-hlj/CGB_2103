package sort;

/**
 * 归并排序
 *  算法思想：采用分治法。将已有序的子序列合并得到完全有序的序列；
 *            即先使每个子序列有序，再使子序列段间有序
 *            将长度为n的序列分为两个长度为n/2的子序列
 *            一直递归划分序列，直到长度为1，再合并。

 *  时间复杂度：O(nlog2n)  最差：O(nlog2n)     最优：O(nlog2n)
 *  空间复杂度：O(n)
 *  稳定性：稳定
 */
public class MergeSort {
    //The method for sorting the numnbers
    public static  void mergeSort(int[] list){
        if(list.length>1){
            //Merge sort the first half
            int[] firstHalf=new int[list.length/2];
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);

            //Merge sort the second half
            int secondHalfLength=list.length-list.length/2;
            int[] secondHalf=new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);

            //Merge firstHalf with secondHalf into list
            merge(firstHalf,secondHalf,list);
        }
    }

    //Merge two sorted lists
    private static void merge(int[] list1, int[] list2, int[] temp) {
        int currend1 = 0;
        int currend2 = 0;
        int currend3 = 0;

        while (currend1 < list1.length && currend2 < list2.length) {
            if (list1[currend1] < list2[currend2])
                temp[currend3++] = list1[currend1++];
            else
                temp[currend3++] = list2[currend2++];
        }
        while (currend1 < list1.length)
            temp[currend3++] = list1[currend1++];
        while (currend2 < list2.length)
            temp[currend3++] = list2[currend2++];
    }
}
