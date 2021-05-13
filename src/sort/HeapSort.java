package sort;

/**
 * 堆排序
 *  算法思想：建立大顶堆，然后删除堆顶元素，再重建大顶堆；
 *           依次按照降序删除堆中元素。
 *  时间复杂度：O(nlog2n)  最差：O(nlog2n)     最优：O(nlog2n)
 *  空间复杂度：O(1)
 *  稳定性：不稳定
 */

public class HeapSort {
    //Heap sort method
    public static void heapSort(int[] list){
        Heap<Integer> heap=new Heap<>();

        //Add elements to the heap
        for(int i=0;i<list.length;i++)
            heap.add(list[i]);

        //Remove elements from the heap
        for(int i=list.length-1;i>=0;i--)
            list[i]=heap.remove();
    }
}
