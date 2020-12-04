package com.pelucco.coding.at.home;

import java.util.Random;
import java.util.Scanner;

public final class Utilities {
	
	public final static Random random = new Random();
	public final static Scanner scanner = new Scanner(System.in);  


	static public void pausaLunga() throws InterruptedException {
		Thread.sleep(500); 		
	}

	static public void pausa() throws InterruptedException {
		Thread.sleep(250); 		
	}

	static public void stampa(String text) throws InterruptedException {
		stampa(text, true, false);
	}
	
	static public void stampaVeloce(String text) throws InterruptedException {
		stampa(text, true, true);
	}
				
	static public void stampa(String text, boolean newLine, boolean speed) throws InterruptedException {
		
		char[] chars = text.toCharArray();

        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (!speed) Thread.sleep(random.nextInt(40) + 20);
        }
        
        if (newLine) {
        	System.out.println();
        }

	}

	public static void rispostaErrata(int risultato) throws InterruptedException {
		int frase = random.nextInt(2);
		if (frase == 0) {
			stampa("Ma no! Il risultato giusto è: " + risultato + ". Proviamo ancora.");
		} else if (frase == 1) {
			stampa("Peccato! La risposta corretta è: " + risultato + ". Proviamo ancora.");
		} else {
			stampa("Accidenti! Il risultato giusto è: " + risultato + ". Proviamo ancora.");
		}
	}

	public static void rispostaCorretta() throws InterruptedException {
		int frase = random.nextInt(3);
		if (frase == 0) {
			stampa("Complimenti! Un'altra!");
		} else if (frase == 1) {
			stampa("Risposta corretta! Un'altra!");
		} else if (frase == 2) {
			stampa("Hai studiato bene! Un'altra!");
		} else {
			stampa("Bravissima! Un'altra!");
		}
		
		
	}
}
