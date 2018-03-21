package circularlyLinkedList;

public class CircularlyLinkedList<E> {
	public static class Node<E> {
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n) {
			this.element = e;
			this.next = n;
		}
		
		public E getElemenet() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			this.next = n;
		}
	}
	
	private Node<E> tail;
	private int size;
	
	public CircularlyLinkedList() {}
	
	public int size() {	return size; }
	public boolean isEmpty() { return size == 0; }
	
	public void rotate() {
		if(isEmpty()) {
			return;
		}
		tail = tail.getNext();
	}
	
	public E first() {
		if(isEmpty()){
			return null;
		}
		return tail.getNext().getElemenet();
	}
	
	public E last() {
		if(isEmpty())
			return null;
		return tail.getNext().getElemenet();
	}
	
	public void addFirst(E e) {
		if(isEmpty()) {
			tail = new Node<E>(e, null);
			tail.setNext(tail);
		}else {
			Node<E> newest = new Node<E>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		Node<E> head = tail.getNext();
		if(tail == head) {
			tail = null;
		}
		tail.setNext(head.getNext());
		size--;
		return head.getElemenet();
	}
	
}
