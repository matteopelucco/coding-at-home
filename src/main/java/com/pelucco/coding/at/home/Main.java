package com.pelucco.coding.at.home;

import java.util.LinkedList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static com.pelucco.coding.at.home.Utilities.*;

import org.apache.commons.lang3.StringUtils;

public class Main {

	private final static String NOME = "Vercingetorige";
	private final static ArchivioGiochi archivioGiochi = new ArchivioGiochi();
	
    public static void main( String[] args ) throws InterruptedException {
    
    	stampa("Ciao!");
    	pausa();
    	    	
    	stampa("Io sono " + NOME + ", sono stato progettato dal mio Creatore Supremo per giocare con te.");
    	pausaLunga();
    	stampa("Tu invece come ti chiami?");
    	String nome = scanner.nextLine();
    	
    	pausa();
    	stampa("Ciao " + nome + ", è un piacere conoscerti!");
    	pausaLunga(); 
    	
    	stampa("Sai che conosco tanti giochi simpatici e divertenti? Dimmi a che gioco vuoi giocare, scrivi il suo numero");
    	
    	List<Gioco> giochi = archivioGiochi.elencoGiochi();
    	for (Gioco gioco : giochi) {
    		stampaVeloce("[" + gioco.numero() + "] " + gioco.titolo());
    	}
    	
    	String scelta = scanner.nextLine();
    	Gioco giocoScelto = null;
    	for (Gioco gioco : giochi) {
    		if (StringUtils.equals(scelta,  gioco.numero())){
    			stampa("Bene! Hai scelto il gioco \"" + gioco.titolo() + "\". Cominciamo!");
    			giocoScelto = gioco;
    		}
    	}
    	
    	if (giocoScelto == null) {
    		stampa("Mi dispiace, non ho capito a che gioco vuoi giocare..");
    		pausa();
    		stampa("Per ora ti saluto, " + nome + ", torna a giocare con me!");
    	}
    	
    	giocoScelto.esegui(nome);
    	
    	stampa("Ok " + nome + ", grazie per aver giocato con me!");
    	
    	if (giocoScelto.domande() > 0) {
    	
	    	stampa("In questo gioco, ti ho fatto " + (giocoScelto.domande()) + " domand" + (giocoScelto.domande() == 1 ? "a":"e") + ".");
	    	pausa();
	    	stampa("Hai risposto correttamente " + giocoScelto.risposteCorrette() + " volt" + (giocoScelto.risposteCorrette() == 1 ? "a":"e") + " e hai fatto " + giocoScelto.risposteErrate() + " error" + (giocoScelto.risposteErrate() == 1 ? "e":"i") + ".");
	    	pausa();
	    	stampa("Alla prossima!");
    	
    	}
        
    }

	
}
