public class Node<T> {
	 T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    public T getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}