package com.pelucco.coding.at.home;

import java.util.LinkedList;
import java.util.List;

import com.pelucco.coding.at.home.giochi.GiocoAddizioni;
import com.pelucco.coding.at.home.giochi.GiocoNonPronto;
import com.pelucco.coding.at.home.giochi.GiocoSottrazioni;
import com.pelucco.coding.at.home.giochi.GiocoTabelline;

public class ArchivioGiochi {

	private final List<Gioco> giochi = new LinkedList<Gioco>();

	public ArchivioGiochi() {

		GiocoAddizioni addizioni = new GiocoAddizioni("1", "Addizioni");
		GiocoSottrazioni sottrazioni = new GiocoSottrazioni("2", "Sottrazioni");
		GiocoNonPronto moltiplicazioni = new GiocoNonPronto("3", "Moltiplicazioni");
		GiocoTabelline tabelline = new GiocoTabelline("4", "Tabelline da 1 a 10");
		GiocoNonPronto amiciDel = new GiocoNonPronto("5", "Amici del..");

		giochi.add(addizioni);
		giochi.add(sottrazioni);
		giochi.add(moltiplicazioni);
		giochi.add(tabelline);
		giochi.add(amiciDel);

	}

	public List<Gioco> elencoGiochi() {
		return giochi;
	}
}
