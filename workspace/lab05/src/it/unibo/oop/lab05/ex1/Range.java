package it.unibo.oop.lab05.ex1;

import java.util.Iterator;

public class Range implements Iterable<String>{
	
	private String start;
	private final String stop;
	
	public Range(final String start, final String stop) {
		this.start = start;
		this.stop = stop;
	}
	
	public java.util.Iterator<String> iterator() {
		class RangeIterator implements Iterator<String>{
			
			private String current;
			private final String stop;
			private int count;

			public RangeIterator() {
				this.current = Range.this.start;
				this.stop = Range.this.stop;
				this.count = 0;
			}
			
			public boolean hasNext() {
				return Integer.parseInt(this.current) < Integer.parseInt(this.stop);
			}

			public String next() {
				if(this.count != 0) {
					this.current = Integer.toString(Integer.parseInt(this.current) + 1);
				}
				this.count++;
				return this.current;
			}
			
		}
		
		return new RangeIterator();
	}
	
	
	
}
