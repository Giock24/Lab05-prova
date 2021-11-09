package mioDatebaseAnime;

import java.io.*;

public class UseAnimeDatabase {
	
	public static int getIntFromKbd() {
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader keyboardInput = new BufferedReader(ISR);
		String line = null;
		try {
			line = keyboardInput.readLine();
		} catch (IOException e) {
			line = "WTF";
		}
		return Integer.parseInt(line);
	}

	public static void main(String[] args) {
		
		DatabaseImpl g = new DatabaseImpl();
		
		int prova = getIntFromKbd();
		System.out.println(prova);
		
		/*
		Anime a1 = new Anime("Naruto", 200, true);
		Anime a2 = new Anime("Boruto Next Generation", 220);
		Anime a3 = new Anime("Naruto Shippuden", 500, true);
		
		g.addNewAnime(a1);
		g.addNewAnime(a2);
		g.addNewAnime(a3);
		
		//a1.setEp(-2);
		
		System.out.println(g);
		g.animeFINITI();
		g.animeNotFinished();
		
		a2.setEp(20);
		
		g.animeNotFinished();
		*/
	}

}
