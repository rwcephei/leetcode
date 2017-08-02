package list;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode q = p;
        int carry = 0;
        while (l1 != null && l2 != null) {
        	q.next = new ListNode((l1.val + l2.val + carry) % 10);
        	carry = (l1.val + l2.val + carry) / 10;
        	l1 = l1.next;
        	l2 = l2.next;
        	q = q.next;
        }
        
        ListNode l = l1 != null ? l1 : l2;
        while (l != null) {
        	q.next = new ListNode((l.val + carry) % 10);
        	carry = (l.val + carry) / 10;
        	l = l.next;
        	q = q.next;
        }
        
        q.next = carry == 0 ? null : new ListNode(carry);
        return p.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
