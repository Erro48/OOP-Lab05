package it.unibo.oop.lab05.ex2;

import java.util.Comparator;
import java.util.TreeSet;

public class OrderedTreeSet extends TreeSet<String> implements Comparator<String> {
	
	public OrderedTreeSet() {
		super();
	}
	
	public int compare(String o1, String o2) {
		return (Integer.parseInt(o1)) - (Integer.parseInt(o2));
	}

	
}
