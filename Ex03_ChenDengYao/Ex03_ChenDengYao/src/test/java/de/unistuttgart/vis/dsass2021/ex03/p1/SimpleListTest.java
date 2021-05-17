package de.unistuttgart.vis.dsass2021.ex03.p1;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import de.unistuttgart.vis.dsass2021.ex03.p1.ISimpleListIterable;
import de.unistuttgart.vis.dsass2021.ex03.p1.SimpleList;

public class SimpleListTest {
	@Test
	public void IterTest() {
		SimpleList<String> Gundam = new SimpleList<String>();
		Gundam.append("RX-78");
		Gundam.append("GP-03");
		Gundam.append("RX-0");
		Gundam.append("RX-93");
		Gundam.append("MSZ-006");
		Iterator<String> it1  =  Gundam.iterator();
		Iterator<String> it2 =  Gundam.skippingIterator(2);
		while( it1.hasNext() ) { System.out.println( it1.next() );  }
		System.out.println("***********");
		while( it2.hasNext() ) { System.out.println( it2.next()); }
		
		// yes, it gives out the correct sequence of gundam names
		// for each iterator and skippingIterator
	}
}
