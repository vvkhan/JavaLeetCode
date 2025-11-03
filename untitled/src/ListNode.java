public class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public ListNode createLinkedList() {
        ListNode head = null;
        ListNode tail = null;
        for (int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        return head;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode listBuilder = new ListNode(0);
        ListNode head = listBuilder.createLinkedList();
        ListNode reversed = listBuilder.reverseLinkedList(head);

        ListNode current = reversed;
        while (current != null) {
            System.out.println(current.data + " ");
            if (current != null) {
                current = current.getNext();
            }
        }
    }
}
