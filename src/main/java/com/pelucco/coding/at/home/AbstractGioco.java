package com.pelucco.coding.at.home;

import static com.pelucco.coding.at.home.Utilities.pausaLunga;
import static com.pelucco.coding.at.home.Utilities.rispostaCorretta;
import static com.pelucco.coding.at.home.Utilities.rispostaErrata;
import static com.pelucco.coding.at.home.Utilities.scanner;
import static com.pelucco.coding.at.home.Utilities.stampa;

import org.apache.commons.lang3.StringUtils;

public abstract class AbstractGioco implements Gioco {

	private static final String COMANDO_DI_USCITA = "stop";
	private String numero; 
	private String titolo; 
	
	protected int domande = 0;
	protected int risposteCorrette = 0;
	protected int risposteErrate = 0;
	
	public AbstractGioco(String numero, String titolo) {
		this.numero = numero; 
		this.titolo = titolo; 
	}
	
	public String numero() {
		return numero;
	}
	public String titolo() {
		return titolo;
	}
	public int domande() {
		return domande;
	}
	public int risposteCorrette() {
		return risposteCorrette;
	}
	public int risposteErrate() {
		return risposteErrate;
	}
	
	protected void rompiIlGhiaccio(String testo) throws InterruptedException {
		stampa(testo);
		String risposta = scanner.nextLine();
		if (StringUtils.equalsIgnoreCase(risposta, "si")) {
			stampa("Mi piacciono i tipi convinti! Pronti, partenza... via!");
		} else {
			stampa("Il mio Creatore Supremo non accetta rifiuti. Cominciamo! ");
		}

		pausaLunga();
		stampa("Ti ricordo che puoi interrompere quando vuoi, basta che scrivi [" + COMANDO_DI_USCITA + "]");

	}

	protected void controllaLaRisposta(String risposta, int risultato) throws InterruptedException {
		if (("" + risultato).equals(risposta)) {
			rispostaCorretta();
			risposteCorrette++;
		} else {
			rispostaErrata(risultato);
			risposteErrate++;
		}

		domande++;

	}

	protected void controllaLaRisposta(String risposta, String risultato) throws InterruptedException {
		if (StringUtils.equalsIgnoreCase(risposta, risultato)) {
			rispostaCorretta();
			risposteCorrette++;
		} else {
			rispostaErrata(risultato);
			risposteErrate++;
		}

		domande++;
	}

	protected boolean vuoiUscire(String risposta) {
		return StringUtils.equalsIgnoreCase(risposta, COMANDO_DI_USCITA);
	}
	
	
}
