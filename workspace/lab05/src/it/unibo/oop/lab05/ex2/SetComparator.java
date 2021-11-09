package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class SetComparator implements Comparator<String>{

	public int compare(String o1, String o2) {
		return - Integer.parseInt(o1) + Integer.parseInt(o2);
	}

}
