package test;

interface Entry<K,V>{
 	K getKey();
	V getValue();
}

class Pair<K,V> implements Entry<K,V>{
	
	
	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
	
}

public class Program {
	public static void main(String[] args) {
		Entry<Integer, String> e  = new Pair<>(1, "DAC");
		Integer key = e.getKey();
		String value = e.getValue();
		System.out.println("Key	:	"+key);
		System.out.println("Value	:	"+value);
	}
	
}






















