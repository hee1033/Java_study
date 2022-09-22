package ch13_test.exam02;

public class Container<T> {

	public T t;
	public T get() {return t;}
	public void set(T t) {
		this.t = t;
		System.out.println(t);
		
	}
}
