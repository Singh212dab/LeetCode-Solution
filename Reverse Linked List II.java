class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if (head == null) {
            return head;
        }
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode mp = fakeHead;
        for (int i = 0; i < left - 1; i ++) {
            mp = mp.next;
        }
        //mp.next is the first element to be reversed
        ListNode rhead = mp;
        mp = mp.next;
        ListNode rtail = mp;
        ListNode next = null;
        for (int i = 0; i < right - left + 1; i ++) {
            next = mp.next;
            mp.next = rhead.next;
            rhead.next = mp;
            mp = next;
        }
        rtail.next = mp;
        return fakeHead.next;
    }
}