package proveDiUsoEnum;

public enum Region {
	ABRUZZO(1),BASILICATA(2), CALABRIA(3), CAMPANIA(4), EMILIA_ROMAGNA(5),
	FRIULI_VENEZIA_GIULIA(6), LAZIO(7), LIGURIA(8), LOMBARDIA(9), MARCHE(10),
	MOLISE(11), PIEMONTE(12), PUGLIA(13), SARDEGNA(14), SICILIA(15), TOSCANA(16),
	TRENTINO_ALTO_ADIGE(17), UMBRIA(18), VALLE_D_AOSTA(19), VENETO(20);
	
	
	private int id;
	
	private Region(final int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
