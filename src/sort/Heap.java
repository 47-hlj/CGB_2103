package sort;

import java.util.ArrayList;

/**
 * 堆-----二叉堆  大顶堆
 * 完全二叉树，每个结点大于或等于它的任意一个孩子
 * 堆添加一个新结点，首相将它添加到堆的末尾，然后重建堆
 * 重建堆步骤：
 * 1、将最后一个结点作为当前结点；
 * 2、while(当前结点大于它的父结点）{
 *       将当前结点和它的父结点交换；
 *       现在当前结点往上面进了一个层次；
 *   }
 * 堆删除根结点，即删除堆中最大的元素，删除，然后重建堆
 * 重建堆步骤：
 * 1、用最后一个结点替换根结点；
 * 2、让根结点成为当前结点；
 * while(当前结点具有子结点并且当前结点小于它的子结点){
 *     将当前结点和它的较大子结点交换；
 *     现在当前结点往下面退了一个层次；
 * }
 */

public class Heap<E extends Comparable<E> >{
    private ArrayList<E> list= new ArrayList<>();

    public Heap(){}

    public Heap(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    // Add a new object into the heap
    public void add(E newObject){
        list.add(newObject); //Append to the heap
        int currentIndex=list.size()-1; //The index of the last node
        while(currentIndex>0){
            int parentIndex=(currentIndex-1)/2;
            //Swap if the current object id greater than its parent
            if(list.get(currentIndex).compareTo(list.get(parentIndex))>0){
                E temp=list.get(currentIndex);
                list.set(currentIndex,list.get(parentIndex));
                list.set(parentIndex,temp);
            }
            else
                break;   //The tree is a heap.
            currentIndex=parentIndex;
        }
    }

    // Remove the root from the heap
    public E remove(){
        if(list.size()==0)
            return null;
        E removedObject=list.get(0);
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);

        int currentIndex=0;
        while(currentIndex<list.size()){
            int leftChildIndex=2*currentIndex+1;
            int rightChildIndex=2*currentIndex+2;
            //Find the maximum between two children
            if(leftChildIndex>=list.size())
                break;//The tree is a heap
            int maxIndex=leftChildIndex;
            if(rightChildIndex<list.size()){
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex))<0){
                    maxIndex=rightChildIndex;
                }
            }

            //Swap if the current node is less than the maximum
            if(list.get(currentIndex).compareTo(list.get(maxIndex))<0){
                E temp=list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex,temp);
                currentIndex=maxIndex;
            }
            else
                break;// The tree is heap
        }
        return removedObject;
    }

    //Get the number of nodes in the tree
    public int getSize(){
        return list.size();
    }
}
