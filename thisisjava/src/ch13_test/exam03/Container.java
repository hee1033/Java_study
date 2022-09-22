package ch13_test.exam03;

public class Container<S,I> {
	
	private S s;
	private I i;
	
	public S getKey() {return s;}
	public I getValue() {return i;}
	
	public void set(S s,I i) {
		this.s = s;
		this.i = i;
	}
}
