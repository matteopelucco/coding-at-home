package com.pelucco.coding.at.home.giochi;

import static com.pelucco.coding.at.home.Utilities.pausa;
import static com.pelucco.coding.at.home.Utilities.pausaLunga;
import static com.pelucco.coding.at.home.Utilities.random;
import static com.pelucco.coding.at.home.Utilities.rispostaCorretta;
import static com.pelucco.coding.at.home.Utilities.rispostaErrata;
import static com.pelucco.coding.at.home.Utilities.scanner;
import static com.pelucco.coding.at.home.Utilities.stampa;
import static com.pelucco.coding.at.home.Utilities.stampaVeloce;

import org.apache.commons.lang3.StringUtils;

import com.pelucco.coding.at.home.AbstractGioco;

public class GiocoTabelline extends AbstractGioco {

	public GiocoTabelline(String numero, String titolo) {
		super(numero, titolo);
	}

	public void esegui(String nome) throws InterruptedException {
		rompiIlGhiaccio(
				nome + ", proveremo insieme a ripassare qualche tabellina, ok? Puoi rispondere [si] oppure [no]");

		String risposta;
		int risultato;

		stampa(nome
				+ ", vuoi magari ripassare una tabellina in particolare? Seleziona la tua scelta indicandomi il numero corrispondente.");

		for (int i = 1; i <= 10; i++) {
			stampa("[" + i + "] Ripassa la tabellina del" + (i == 1 ? "l'" : "") + " " + i);
		}
		stampa("[miste] Prova un gioco a tabelline miste");

		risposta = scanner.nextLine();
		Integer rispostaInt = null;
		try {
			rispostaInt = new Integer(risposta);
		} catch (NumberFormatException e) {
			// do nothing
		}
		if (rispostaInt == null || rispostaInt > 10) {
			stampa("Ti aspetta una sfida ardua, tabelline miste in arrivo!");
		} else {
			stampa("Ottimo, ripasseremo la tabellina del" + (rispostaInt == 1 ? "l'" : "") + " " + rispostaInt);
			pausaLunga();
			stampa("Ma prima un veloce ripasso: ");
			pausaLunga();
			for (int i = 1; i <= 10; i++) {
				stampaVeloce(rispostaInt + " x " + i + " = " + rispostaInt * i);
				pausa();
			}
			stampa("Pronti per cominciare? Adesso si fa sul serio!");
			pausaLunga();

		}

		while (true) {
			pausa();
			int a = -1;
			if (rispostaInt == null || rispostaInt > 10) {
				a = random.nextInt(10);
			} else {
				a = rispostaInt;
			}
			int b = random.nextInt(10);

			risultato = a * b;
			stampa("Quanto fa: " + a + " x " + b + "?");

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

			domande++;

		}
	}

}
