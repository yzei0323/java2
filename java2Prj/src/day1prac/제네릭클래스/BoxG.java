package day1prac.제네릭클래스;

public class BoxG<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "BoxG [item=" + item + "]";
	}
	
	
}
