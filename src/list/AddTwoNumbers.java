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
        
        while (l1 != null || l2 != null || carry != 0) {
        	int sum = carry;
        	if (l1 != null) {
        		sum += l1.val;
        		l1 = l1.next;
        	}
        	
        	if (l2 != null) {
        		sum += l2.val;
        		l2 = l2.next;
        	}
        	
        	q.next = new ListNode(sum % 10);
        	q = q.next;
        	carry = sum / 10;
        }        
        
        return p.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
