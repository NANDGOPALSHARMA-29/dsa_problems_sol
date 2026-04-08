/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(list1!=null){
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int x : list){
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}