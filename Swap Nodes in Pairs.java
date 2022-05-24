class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode Head = new ListNode(-1);
       Head.next = head;
        ListNode node = Head;
        while (node!=null & node.next != null && node.next.next!= null){
            ListNode first = node;
            ListNode second = node.next;
            ListNode third = node.next.next;
            first.next = third;
            second.next = third.next;
            third.next = second;
            node = second;
        }
        return Head.next;
    }
}
  