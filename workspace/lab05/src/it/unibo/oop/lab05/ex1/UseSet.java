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

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    /**
     * @param args
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
    	
    	/*
    	for (int i = 1; i < 20; i++) {
    		coll.add(Integer.toString(i)); // brutta roba, mai fare cose con MagicNumber
    	}
    	*/
    	
    	/**
    	 * @Giock choice your range
    	 */
    	for(final String s : new Range("1", "20")) {
    		coll.add(s);
    		//System.out.println(s);
    	}
    	
    	System.out.println(coll);
    	
    	/**
    	 * @Giock remove all number divisible for 3
    	 */
    	//coll.removeAll()
    	Iterator<String> it= coll.iterator();
    	while(it.hasNext()) {
    		if (Integer.parseInt(it.next()) % 3 == 0) {
    			it.remove();
    		}
    	}
    	
    	System.out.print("[");
    	
    	for(final String s : coll) {
    		int i = Integer.parseInt(s);
    		System.out.print("" + Integer.toString(i) + ", ");
    	
    	}
    	
    	System.out.print("]");
    	System.out.println("");
    
    	for(final String s : coll) {
    		int i = Integer.parseInt(s);
    		if (i % 2 != 0) {
    			System.out.println("WRONG: Not All Numbers are even");
    			break;
    		}
    	}
    }
}
