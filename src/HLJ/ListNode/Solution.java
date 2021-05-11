package HLJ.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * public class ListNode{
 *     int val;
 *     ListNode next=null;
 * }
 */


//有序链表去重
public class Solution {
    public ListNode deleteDuplicates(ListNode head){
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode p=head;
        while(p.next!=null){
            if(p.val==p.next.val)
                p.next=p.next.next;//相等删除该结点
            else
                p=p.next;//不相等
        }
        //return p; //只输出当前结点
        return head;
    }


    //判断是否有环
    public boolean hasCycle(ListNode head){
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(!set.add(head))
                return true;
            head=head.next;
        }
        return false;
    }

}

