package proveDiUsoEnum;

import java.util.*;

public class UseEnum {

	public static void main(String[] args) {
		// Creo la mia lista in cui metto le Regioni
		List<Region> regionList = new ArrayList<>();
		
		/*Si possono aggiungere tutte le Regioni enumerate 
		* in una botta sola? Certo eheh!
		*/
		
		for (Region r : Region.values()) {
			//System.out.println(r);
			regionList.add(r);
		}
		//regionList.add(Region.ABRUZZO);
		//regionList.add(Region.BASILICATA);
		//regionList.add(Region.CALABRIA);
		
		// Stampo a video tutto ciò che ho messo in regionList
		for (Region r : regionList) {
			System.out.println(r);
		}
	}

}
