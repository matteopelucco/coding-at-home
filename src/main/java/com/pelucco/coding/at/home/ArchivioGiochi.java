package com.pelucco.coding.at.home;

import java.util.LinkedList;
import java.util.List;

import com.pelucco.coding.at.home.giochi.*;

public class ArchivioGiochi {

	private final List<Gioco> giochi = new LinkedList<Gioco>();

	public ArchivioGiochi() {

		GiocoAddizioni addizioni = new GiocoAddizioni("1", "Addizioni");
		GiocoSottrazioni sottrazioni = new GiocoSottrazioni("2", "Sottrazioni");
		GiocoNonPronto moltiplicazioni = new GiocoNonPronto("3", "Moltiplicazioni");
		GiocoTabelline tabelline = new GiocoTabelline("4", "Tabelline da 1 a 10");
		GiocoNonPronto amiciDel = new GiocoNonPronto("5", "Amici del..");
		GiocoIndovinaParola indovina = new GiocoIndovinaParola("6", "Indovina Parola");

		giochi.add(addizioni);
		giochi.add(sottrazioni);
		giochi.add(moltiplicazioni);
		giochi.add(tabelline);
		giochi.add(amiciDel);
		giochi.add(indovina);

	}

	public List<Gioco> elencoGiochi() {
		return giochi;
	}
}
