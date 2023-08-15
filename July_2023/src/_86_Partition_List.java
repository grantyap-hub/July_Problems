public class _86_Partition_List {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public static ListNode partition(ListNode head, int x){
        ListNode dummy = new ListNode(0);
        ListNode dummy1 = new ListNode(0);
        ListNode smaller = null;
        ListNode larger = null;

        while(head != null){
            if(head.val < x){
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            } else{
                dummy1.next = new ListNode(head.val);
                dummy = dummy1.next;
            }
            head = head.next;
        }
        dummy.next = larger.next;
        return smaller.next;
    }



    public static void main(String[] args) {

    }
}
