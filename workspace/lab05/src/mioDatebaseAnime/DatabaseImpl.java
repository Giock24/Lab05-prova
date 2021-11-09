package mioDatebaseAnime;

import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;

public class DatabaseImpl implements DatabaseInteface{

	private final NavigableSet<Anime> set = new TreeSet<>();

	public void addNewAnime(Anime a) {
		this.set.add(a);
	}

	public void animeNotFinished() {
		Set<Anime> notFinished = new TreeSet<>();
		for (Anime a : this.set) {
			if (a.isCompleted() == false) {
				notFinished.add(a);
				System.out.println(a);
			}
		}
		System.out.println(" ------------------------------------------------------------------------------------------------------------ ");
	}

	public void animeFINITI() {
		Set<Anime> Finished = new TreeSet<>();
		for (Anime a : this.set) {
			if (a.isCompleted() == true) {
				Finished.add(a);
				System.out.println(a);
			}
		}
		System.out.println(" ------------------------------------------------------------------------------------------------------------ ");
	}

	public String toString() {
		System.out.println("My anime :");
		for (Anime a : this.set) {
			System.out.println(a);
		}
		return " ------------------------------------------------------------------------------------------------------------ ";
	}

}
