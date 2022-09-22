package ch13.sec02.exam01;

public class Product<K,M> {
	private K kind;
	private M model;
	
	public K getKind() {return this.kind;}
	public M getModel() {return this.model;}
	public K setKind(K kind) {return this.kind;}
	public M setModel(M model) {return this.model;}
	
}
