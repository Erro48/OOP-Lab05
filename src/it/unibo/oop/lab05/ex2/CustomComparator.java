package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class CustomComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
