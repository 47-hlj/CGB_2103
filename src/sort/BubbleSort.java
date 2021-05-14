package sort;

/**
 * 冒泡排序
 *  算法思想：多次遍历数组，每次遍历，比较连续相邻元素，
 *           如果为降序，则互换；否则，不变。每次遍历，排序好一个元素。
 *  时间复杂度：O(n*n)    最优：O(n)  最差：O(n*n)
 *  空间复杂度：O(1)
 *  稳定性：稳定
 *  存在的问题：数组排序好后,冒泡排序还会进行下一轮的无意义排序,直到list.length.
 *  优化：设置标志位needNextPass,发生交换则为true,否则为false
 *        一轮结束needNextPass为false,即这一轮没有发生交换,说明已经有序,无序再排
 *        详细设计,请见下面的优化代码.
 */

public class BubbleSort {
    public static void bubbleSort(int[] list){
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }
    //优化
    public static void bubbleSort1(int[] list){
        boolean needNextPass=true;
        for(int i=0;i<list.length&&needNextPass;i++){
            needNextPass=false;
            for(int j=0;j<list.length-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    needNextPass=true;
                }
            }
        }
    }
}
