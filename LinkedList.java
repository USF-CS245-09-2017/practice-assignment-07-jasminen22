public class LinkedList<T> implements List<T> {
	private Node<T> head;
	private int size;
	//constructor
	public LinkedList(){
		head = null;
		size = 0;
	}
	public void add(T item){
		if(head==null){
			Node<T> newNode = new Node(item); 
			head = newNode;
			size++;
		}else {
			Node<T> prev = head;
			for(int i=0; i<size-1; i++) {
			prev = prev.getNext( );	
			}
			Node<T> newNode = new Node(item);
			prev.setNext(newNode);
			size++;
		}

	}
	public void add(int pos, T item){
		//Assert.not_false(pos<size && pos>0);
		size++;
		if(pos == 0) {
		Node<T> node = new Node(item);
		node.setNext(head);
		head = node;
		}
		else {
			Node<T> prev = head;
			for(int i=0; i<pos-1; i++){
				//next is a field within a node & we don’t have private 
				//access so we need to use getNext
				prev = prev.getNext( );
			}
			Node<T> node = new Node(item);
			node.setNext(prev.getNext());
			prev.setNext(node);	
		} //else
	}
	public T get(int pos){
		//Assert.not_false(pos>0 && pos<size);
		Node<T> current = head;
		for(int i=0; i<pos; i++){
			current = current.getNext();
		}
		return current.getData();
	}
	public T remove(int pos){
		//Assert.not_false(pos > =0 && pos < size);
		if(pos == 0) {
			Node<T> curr = head;
			head = curr.getNext();
			size --;
			return curr.getData();
		}
		else {
			Node<T> prev = head;
			for(int i =0; i<pos-1; i++)
				prev = prev.getNext( );
			Node<T> curr=prev.getNext();
			prev.setNext(curr.getNext());
			size--;
			return curr.getData();
		} //else
	}
	public int size(){
		return size;
	}
}