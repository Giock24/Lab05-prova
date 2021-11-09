package mioDatebaseAnime;

public class Anime implements Comparable<Anime>{
	
	private static final String MSG = "AO MA METTI UN EPISODIO COL NUMERO POSITIVO";

	private final String name;
	private int ep;
	private boolean completed;
	
	public Anime(final String name) {
		this.name = name;
	}
	
	public Anime(final String name, final int ep) {
		if(ep < 0) {
			throw new java.lang.IllegalArgumentException(Anime.MSG);
		}
		this.name = name;
		this.ep = ep;
	}
	
	public Anime(final String name, final int ep, final boolean completed) {
		if(ep < 0) {
			throw new java.lang.IllegalArgumentException(Anime.MSG);
		}
		this.name = name;
		this.ep = ep;
		this.completed = completed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isCompleted() {
		return this.completed;
	}
	
	public void setEp(int ep) {
		if(ep < 0) {
			throw new java.lang.IllegalArgumentException(Anime.MSG);
		}
		else if (ep >= 0) { 
			this.ep += ep;
		}
	}
	
	public void setCompleted(boolean finito) {
		this.completed = finito;
	}
	
	public int compareTo(Anime o) {
		return this.getName().compareTo(o.getName());
	}

	public String toString() {
		return "[name : " + name + ", ep : " + ep + ", isCompleted? " + completed + "]";
	}

}
