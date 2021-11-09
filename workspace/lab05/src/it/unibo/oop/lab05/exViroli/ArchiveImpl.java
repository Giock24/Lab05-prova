package it.unibo.oop.lab05.exViroli;

import java.util.Set;
import java.util.HashSet;

public class ArchiveImpl implements Archive {
	
	private final Set<Persona> set = new HashSet<>();

	public void add(String nome, int annoNascita, boolean sposato) {
		this.set.add(new Persona(nome, annoNascita, sposato));
	}

	public void remove(String nome, int annoNascita) {
		for (Persona p : this.set) {
			if (p.getName() == nome && p.getAnnoNascita() == annoNascita) {
				this.set.remove(p);
			}
		}
	}

	public int size() {
		return this.set.size();
	}

	public Set<String> allMarried() {
		Set<String> copy = new HashSet<>();
		for (Persona p : this.set) {
			if (p.isSposato() == true) {
				copy.add(p.getName());
			}
		}
		return copy;
	}

	public String toString() {
		return "ArchiveImpl [set=" + set + "]";
	}

}
