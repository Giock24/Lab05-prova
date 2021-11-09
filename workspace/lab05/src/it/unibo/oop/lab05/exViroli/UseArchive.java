package it.unibo.oop.lab05.exViroli;

public class UseArchive {
	
	public static void main(String[] args) {
		final Archive arc = new ArchiveImpl();
		arc.add("Rossi", 1960, false);
		arc.add("Bianchi", 1980, true);
		arc.add("Verdi", 1972, true);
		arc.add("Neri", 1968, false);
		System.out.println(arc);
		arc.remove("Neri", 1968);
		System.out.println(arc);

		System.out.println(arc.size()); // 3
		System.out.println(arc.allMarried()); // [Bianchi,Verdi]
	}

}
