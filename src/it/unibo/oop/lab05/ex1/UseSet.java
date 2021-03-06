package it.unibo.oop.lab05.ex1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	
	private static final int CYCLES = 20;

    private UseSet() {
    }
    
    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	final Collection<String> coll = new TreeSet<>();
    	
    	for (int i = 1; i <= CYCLES; i++) {
    		coll.add(Integer.toString(i));
    	}
    	
    	System.out.println(coll.toString());
    	
    	// remove elements divisible by 3
    	Iterator<String> strIterator = coll.iterator();
    	while (strIterator.hasNext()) {
    		String str = strIterator.next();
    		if(Integer.parseInt(str) % 3 == 0) {
    			strIterator.remove();
    		}
    	}
    	
    	// print the collection without using toString()
    	System.out.print("[ ");
    	for (String str : coll) {
    		System.out.print(str + " ");
    	}
    	System.out.println("]");
    	
    	
    	// check if there are only even numbers
    	boolean onlyEven = true;
    	for (String str : coll) {
    		if((Integer.parseInt(str) % 2) != 0) {
    			onlyEven = false;
    		}
    	}
    	
    	System.out.println(onlyEven ? "Solo pari" : "Anche dispari");
    }
}
