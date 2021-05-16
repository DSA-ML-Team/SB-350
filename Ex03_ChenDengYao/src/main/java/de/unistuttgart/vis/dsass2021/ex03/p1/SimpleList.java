package de.unistuttgart.vis.dsass2021.ex03.p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SimpleList<T extends Comparable<T>> implements ISimpleListIterable<T> {
	
    
	/** Do not modify the existing methods and signatures */
	private final List<T> list;
	
	public SimpleList() {
		list = new ArrayList<T>();
	}
	
	@Override
	public void append(T element) {
		list.add(element);
	}
	
	@Override
	public int size() {
		return list.size();
	}
	
	@Override
	public T get(int index) {
		return list.get(index);
	}
	
	
	
	int pos;
	
	public boolean hasNext() {
		return pos != size();
		}
	
	public T next() {
        int i = pos;	        
        pos = i + 1;
        ;
    }
	
	public Iterator<T> iterator() {
				
		while (iterator.hasNext()){
			System.out.println(iterator.next());
			}
	}
	
	


}
