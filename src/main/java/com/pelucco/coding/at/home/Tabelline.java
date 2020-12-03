package com.pelucco.coding.at.home;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class Tabelline 
{
	static Random random = new Random();
	
    public static void main( String[] args ) throws InterruptedException
    {
    
    	Scanner scanner = new Scanner(System.in);  
    	
    	stampa("Ciao!");
    	pausa();
    	    	
    	stampa("Io sono JOHN, e sono un esperto di tabelline.");
    	pausaLunga();
    	stampa("Tu invece come ti chiami?");
    	String nome = scanner.nextLine();
    	
    	pausa();
    	stampa("Ciao " + nome + ", è un piacere conoscerti!");
    	pausaLunga(); 
    	stampa(nome + ", ti piacciono le tabelline? Puoi rispondere [si] oppure [no]");
    	String risposta = scanner.nextLine();

    	if (StringUtils.equalsIgnoreCase(risposta, "si")) {
    		stampa("Anche a me piacciono tanto!");
    	} else {
    		stampa("Capisco, non a tutti piacciono.. ");
    	}
    	
    	pausaLunga();
    	stampa("Senti, " + nome + ", ti va una sfida alle tabelline? Puoi rispondere [si] oppure [no]");
    	risposta = scanner.nextLine();
    	
    	if (StringUtils.equalsIgnoreCase(risposta, "si")) {
    		stampa("Forza, cominciamo allora!");
    	} else {
    		stampa("Dai, ti prometto che ne facciamo solo qualcuna! Forza, cominciamo!");
    	}
    	
    	pausa();
    	stampa("Puoi smettere quando vuoi, basta che scrivi [STOP]");
    	
    	int risultato;
    	int domande = 0;
    	int risposteCorrette = 0;
    	int risposteErrate = 0;
    	
    	while (true){
    		pausa();
    		int a = random.nextInt(10);
    		int b = random.nextInt(10);
    		int operazione = random.nextInt(2);
    		if (operazione == 1) {
    			risultato = a + b;
    			stampa("Quanto fa: " + a + " + " + b + "?");
    		} else {
    			risultato = a * b;
    			stampa("Quanto fa: " + a + " x " + b + "?");
    		}
    		
    		domande++;
    		
			risposta = scanner.nextLine();
			if (StringUtils.equalsIgnoreCase(risposta, "stop")) {
				break;
			}
			if (("" + risultato).equals(risposta)) {
				rispostaCorretta();
				risposteCorrette++;
			} else {
				rispostaErrata(risultato);
				risposteErrate++;
			}
			
    	}
    	
    	stampa("Ok " + nome + ", grazie per aver giocato con me!");
    	stampa("In questo gioco, ti ho fatto " + domande + " domande");
    	pausa();
    	stampa("Hai risposto correttamente " + risposteCorrette + " volt" + (risposteCorrette > 0 ? "a":"e") + " e hai fatto " + risposteErrate + " error" + (risposteErrate > 0 ? "i":"e"));
    	pausa();
    	stampa("Alla prossima!");
        
    }

	private static void pausaLunga() throws InterruptedException {
		Thread.sleep(500); 		
	}

	private static void pausa() throws InterruptedException {
		Thread.sleep(250); 		
	}

	private static void stampa(String text) throws InterruptedException {
		stampa(text, true);
	}
				
	private static void stampa(String text, boolean newLine) throws InterruptedException {
		
		char[] chars = text.toCharArray();

        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(random.nextInt(40) + 20);
        }
        
        if (newLine) {
        	System.out.println();
        }

	}

	private static void rispostaErrata(int risultato) throws InterruptedException {
		int frase = random.nextInt(2);
		if (frase == 0) {
			stampa("Ma no! Il risultato giusto è: " + risultato + ". Proviamo ancora.");
		} else if (frase == 1) {
			stampa("Peccato! La risposta corretta è: " + risultato + ". Proviamo ancora.");
		} else {
			stampa("Accidenti! Il risultato giusto è: " + risultato + ". Proviamo ancora.");
		}
	}

	private static void rispostaCorretta() throws InterruptedException {
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
