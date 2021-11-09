package it.unibo.oop.lab05.ex1;

public class Range implements Iterable<String>{
	
	private String start;
	private final String stop;
	
	public Range(final String start, final String stop) {
		this.start = start;
		this.stop = stop;
	}
	
	public java.util.Iterator<String> iterator() {
		return new RangeIterator(this.start, this.stop);
	}	
}
