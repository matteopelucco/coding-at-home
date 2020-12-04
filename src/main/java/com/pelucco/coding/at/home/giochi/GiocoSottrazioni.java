package com.pelucco.coding.at.home.giochi;

import static com.pelucco.coding.at.home.Utilities.*;
import org.apache.commons.lang3.StringUtils;

import com.pelucco.coding.at.home.AbstractGioco;

public class GiocoSottrazioni extends AbstractGioco {

	private static final CharSequence COMANDO_DI_USCITA = null;

	public GiocoSottrazioni(String numero, String titolo) {
		super(numero, titolo);
	}

	public void esegui(String nome) throws InterruptedException {

		rompiIlGhiaccio(nome + ", proverò a chiederti qualche sottrazione, ok? Puoi rispondere [si] oppure [no]");

		String risposta;
		int risultato;

		while (true) {
			pausa();
			int a = random.nextInt(50);
			int b = random.nextInt(50) + a;
			risultato = b + a;
			stampa("Quanto fa: " + b + " + " + a + "?");
			risposta = scanner.nextLine();

			if (vuoiUscire(risposta)) {
				break;
			}
			controllaLaRisposta(risposta, risultato);

		}
	}

	

}
