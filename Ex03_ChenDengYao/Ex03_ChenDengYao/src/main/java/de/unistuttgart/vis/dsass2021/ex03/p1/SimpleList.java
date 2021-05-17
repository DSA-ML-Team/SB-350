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
	
	
	
	public class iterator implements Iterator<T> { 
		
		private int cursor; 
		private int sizeOf;
		

		
		public iterator(){
			this.cursor = 0;
			this.sizeOf = list.size() ; 
		}
		
		public boolean hasNext() {
			return ( cursor != sizeOf) ;
		}
		
		public T next() {
			int i = cursor;
			if(i >= sizeOf) {throw new NoSuchElementException();}
			if( i>= sizeOf ) {throw new IndexOutOfBoundsException();}
			cursor = i + 1; 
			return list.get(i);
		}

	}
	
	
	public class skippingIterator implements Iterator<T> {
		
		private int cursor;
		private int sizeOf;
		public int n ;
		
		public skippingIterator(int n ) {
			this.cursor = 0;
			this.sizeOf = list.size();
			this.n = n;
		}

		public boolean hasNext() {
			if(cursor == 0) {return (cursor + n) < sizeOf ; }
			else {return( cursor < sizeOf); }
		}
		
		public T next() {
			int i = cursor;
			if(i >= sizeOf) {throw new NoSuchElementException();}
			if(i >= sizeOf ) {throw new IndexOutOfBoundsException();}
			cursor = i + n;
			return list.get(i);
		}

		
	}
	
	
	public Iterator<T> iterator(){
		return new iterator();
	}
	
	public Iterator<T> skippingIterator(int n ){
		return new skippingIterator(  n );
	}
	
	

}
