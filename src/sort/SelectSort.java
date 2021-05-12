package sort;

/**
 * 选择排序
 *  算法思想:在未排序的序列中找到最小的元素,存放在排序序列的起始位置
 *          该元素已经排序完成,再从剩余未排序序列中继续寻找最小元素
 *          放在已排序序列的末尾,以此类推,直到所有元素排序完成
 *  时间复杂度:O(n*n)    最优：O(n*n)  最差：O(n*n)
 *  空间复杂度:O(1)
 *  稳定性:不稳定
 */
public class SelectSort {
    public static void selectSort(int[] list){
        for(int i=0;i<list.length-1;i++){
            int min=i;
            for(int j=i+1;j<list.length;j++){
                if(list[j]<list[min])
                    min=j;
            }
            int temp=list[i];
            list[i]=list[min];
            list[min]=temp;
        }
    }
}
