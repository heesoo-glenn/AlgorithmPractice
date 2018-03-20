package singlyLinkedList;

public class SinglyLinkedListTest {
	public void test() {
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
		sll.addFirst("1");
		sll.addFirst("2");
		sll.addFirst("3");
		sll.addLast("A");
		while(!sll.isEmpty()){
			System.out.print(sll.removeFirst() + " ");
		}
	}
}
