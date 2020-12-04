package com.pelucco.coding.at.home.giochi;

import static com.pelucco.coding.at.home.Utilities.*;

import com.pelucco.coding.at.home.AbstractGioco;

public class GiocoNonPronto extends AbstractGioco {

	public GiocoNonPronto(String numero, String titolo) {
		super(numero, titolo);
	}

	public void esegui(String nome) throws InterruptedException {
		stampa("Oh no! Il mio programmatore non ha ancora finito di sviluppare questo gioco. Torna presto e controlla!");
	}

}
