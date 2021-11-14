package proveDiUsoEnum;

import java.util.Iterator;

//OK IDEA BOCCIATA
public class Range implements Iterable<Region>{
	
	private Region start;
	private final Region stop;
	
	public Range(final Region start, final Region stop) {
		this.start = start;
		this.stop = stop;
	}
	
	public Iterator<Region> iterator() {
		
		return new Iterator<Region>(){

			private Region current = Range.this.start;
			private final Region stop = Range.this.stop;
			private int count = 0;
			
			public boolean hasNext() {
				return this.current.ordinal() < this.stop.ordinal();
			}

			public Region next() {
				if(this.count != 0) {
					//this.current = Enum.parseInt((this.current.ordinal()) + 1));
				}
				this.count++;
				return this.current;
			}
			
		};
	}
	
}
