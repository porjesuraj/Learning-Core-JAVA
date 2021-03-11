package assignment;

import java.util.Arrays;

public class Array<E> {
	private final E[] ObjArray;
	public final int length;
	public Array(Class<E> dataType, int length) {
		
		ObjArray =  (E[]) java.lang.reflect.Array.newInstance(dataType, length);
		
		this.length = length;
	}
	 E get(int i) {
		return ObjArray[i];
	}
	
    void set(int i, E e) {
        this.ObjArray[i] = e;
    }
	@Override
	public String toString() {
		return  Arrays.toString(ObjArray) ;
	}
	
    
	
	
	

}
