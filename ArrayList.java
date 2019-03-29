import java.util.Arrays;
public class ArrayList<T> implements List<T> {
	int size;
	T arr[];
	public ArrayList(){
		size = 0;
		arr = (T[]) new Object[10];
	}
	public void add(T item){
		if(size == arr.length){
			grow_array();
		}
		arr[size++] = item;
	}
	public void add(int pos, T item){
		if(size == arr.length){
			grow_array();
		}
		for(int i=size; i>pos; i--){
			arr[i]=arr[i-1];
		}
		arr[pos] = item;
		size ++;
	}
	public T get(int pos){
		return arr[pos];
	}
	public T remove(int pos){
		T item = arr[pos];
		size --;
		for(int i=pos; i<arr.length-1; i++){
			arr[i]=arr[i+1];
		}
		return item;
	}
	public int size(){
		return size;
	}
	public void grow_array(){
		T[] temp = (T[]) new Object[arr.length*2];
		for(int i = 0; i<arr.length; i++)
			temp[i] = arr[i];
		arr = temp;
	}
}