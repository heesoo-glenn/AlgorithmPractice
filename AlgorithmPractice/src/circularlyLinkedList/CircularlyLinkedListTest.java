package circularlyLinkedList;

public class CircularlyLinkedListTest {
	public void test() {
		CircularlyLinkedList<String> cll = new CircularlyLinkedList<>();
		cll.addFirst("A");
		cll.addFirst("B");
		cll.addFirst("C");
		
		for(int i = 0; i < cll.size(); i++) {
			String e = cll.first();
			System.out.print(e + " ");
			cll.rotate();
		}
		System.out.println();
		
		cll.addLast("1");
		cll.addFirst("@");
		for(int i = 0; i < cll.size(); i++) {
			String e = cll.first();
			System.out.print(e + " ");
			cll.rotate();
		}
		
		/* ------ result --------
		 * C B A 
		 * @ C B A 1 
		 * ----------------------
		 * */
		
	}
}
