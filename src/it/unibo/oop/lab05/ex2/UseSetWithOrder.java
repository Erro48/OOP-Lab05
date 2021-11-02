package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {
	
	private static final int CYCLES = 100;

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	TreeSet<String> orderedTreeSet = new OrderedTreeSet();
    	
    	for(int i = 0; i < CYCLES; i++) {
    		int rand = (int)(Math.random() * 100);
    		orderedTreeSet.add(Integer.toString(rand));
    	}
    	
    	System.out.println(orderedTreeSet);
    	
    }
}
