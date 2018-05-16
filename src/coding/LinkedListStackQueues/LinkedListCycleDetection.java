package coding.LinkedListStackQueues;

public class LinkedListCycleDetection {

	static boolean detect_cycle(LinkedList ll) {

		// Return if linked list is null
		if (ll == null || ll.head == null)
			return false;

		LLNode slow, fast;
		slow = ll.head;
		fast = ll.head;

		// Detect if loop exist in a linked list
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				removeLoop(slow, ll.head);
				return true;
			}
		}
		return false;
	}

	// Remove the loop
	static void removeLoop(LLNode slow, LLNode start) {

		// LLNode head = start;
		if (start == null || slow == null)
			return;

		while (start.next != slow.next) {
			start = start.next;
			slow = slow.next;
		}

		slow.next = null;

	}

}
