package com.pelucco.coding.at.home.giochi;

import static com.pelucco.coding.at.home.Utilities.pausa;
import static com.pelucco.coding.at.home.Utilities.random;
import static com.pelucco.coding.at.home.Utilities.scanner;
import static com.pelucco.coding.at.home.Utilities.stampa;

import org.apache.commons.lang3.StringUtils;

import com.pelucco.coding.at.home.AbstractGioco;

public class GiocoAddizioni extends AbstractGioco {

	private static final CharSequence COMANDO_DI_USCITA = null;

	public GiocoAddizioni(String numero, String titolo) {
		super(numero, titolo);
	}

	public void esegui(String nome) throws InterruptedException {

		rompiIlGhiaccio(nome + ", proverò a chiederti qualche somma, ok? Puoi rispondere [si] oppure [no]");

		String risposta;
		int risultato;
		
		stampa(nome + ", preferisci un gioco [facile] o [difficile]?");
		risposta = scanner.nextLine();
		int bound = 50;
		if (StringUtils.equalsIgnoreCase(risposta, "difficile")) {
			stampa("Hai attivato la modalità difficile, pronti!");
		} else {
			bound = 10;
			stampa("Hai scelto la modalità facile, cominciamo!");
		}

		pausa();
		
		while (true) {
			pausa();
			int a = random.nextInt(bound);
			int b = random.nextInt(bound);
			risultato = a + b;
			stampa("Quanto fa: " + a + " + " + b + "?");
			risposta = scanner.nextLine();

			if (vuoiUscire(risposta)) {
				break;
			}
			controllaLaRisposta(risposta, risultato);

		}
	}

	

}
