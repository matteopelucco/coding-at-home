package com.pelucco.coding.at.home;

public interface Gioco {

	public String numero();
	
	public String titolo();

	public void esegui(String nome) throws InterruptedException;
	
	public int domande();
	
	public int risposteCorrette();
	
	public int risposteErrate();
	
}
