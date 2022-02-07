public interface Heap<T extends Comparable<T>> {
	public void insert(T item);
	public boolean isEmpty();
	public int size();
	public T deleteMax();
}