package com.pelucco.coding.at.home.giochi;

import com.pelucco.coding.at.home.AbstractGioco;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import static com.pelucco.coding.at.home.Utilities.*;
import static com.pelucco.coding.at.home.Utilities.scanner;

public class GiocoIndovinaParola extends AbstractGioco {

    public GiocoIndovinaParola(String numero, String titolo) {
        super(numero, titolo);
    }

    private final Map<String, String> indovinelli = new LinkedHashMap<String, String>();

    @Override
    public void esegui(String nome) throws InterruptedException {

        caricaIndovinelli();

        rompiIlGhiaccio(nome + ", vuoi giocare a Indovina Parola? Puoi rispondere [si] oppure [no]");

        String risposta;
        while (true) {
            pausa();


            Object[] indovinelliArray = indovinelli.keySet().toArray();
            String domanda = (String) indovinelliArray[new Random().nextInt(indovinelliArray.length)];
            String risultato = indovinelli.get(domanda);


            stampa(domanda);
            risposta = scanner.nextLine();

            if (vuoiUscire(risposta)) {
                break;
            }

            controllaLaRisposta(risposta, risultato);
        }
    }

    private void caricaIndovinelli() {

        indovinelli.put("Mi gratto le orecchie usando il naso. Chi sono?", "elefante");
        indovinelli.put("Al pomeriggio lo schiacci, ma non si fa mai male...", "pisolino");
        indovinelli.put("Quando arriva ci fa tremare, anche se non è spaventoso. Chi è?", "freddo");
        indovinelli.put("Chi sposa tante donne ma non ha nemmeno una moglie?", "prete");

        indovinelli.put("Quale cosa è più grande del cielo?", "futuro");
        indovinelli.put("Cosa si rompe senza mai essersi toccata?", "silenzio");
        indovinelli.put("Quale parola diventa più corta aggiungendo una lettera?", "Corta");
        indovinelli.put("Chi può essere tuo amico e nemico allo stesso tempo?", "tempo");
        indovinelli.put("Qual è l'animale che cammina con la testa?", "gambero");
        indovinelli.put("Qual è la cosa più leggera del mondo?", "piuma");
        indovinelli.put("Quale cosa inizia in piedi, continua seduta e finisce sdraiata?", "candela");
        indovinelli.put("Cosa si può tenere dopo averla data?", "parola");
        indovinelli.put("Cosa è sempre in anticipo ma non arriva mai?", "futuro");
        indovinelli.put("Qual è la cosa che diventa più umida più si asciuga?", "asciugamano");
        indovinelli.put("Cosa si può spezzare anche se non si è mai tenuto?", "segreto");
        indovinelli.put("Cosa si può vedere con gli occhi chiusi?", "Sogni");
        indovinelli.put("Qual è la fine di tutto?", "o");

        indovinelli.put("Quanto è lungo un anno?", "12 mesi");
        indovinelli.put("Qual è l'animale più veloce?", "ghepardo");
        indovinelli.put("Qual è la cosa che è più grande quando la comprimi?", "buco");
        indovinelli.put("Cosa si può spezzare anche se non si è mai tenuto?", "promessa");
        indovinelli.put("Cosa ha le ali ma non vola?", "Una sedia");
        indovinelli.put("Quante lettere ci sono nell'alfabeto?", "11");
        indovinelli.put("Cosa si può vedere con gli occhi chiusi?", "Sogni");
        indovinelli.put("Quale parola è scritta in modo errato in ogni dizionario?", "Errato");
        indovinelli.put("Quanto è pesante un kilogrammo di piume?", "Un kilogrammo");
        indovinelli.put("Qual è la parola più lunga della lingua italiana?", "Pneumoultramicroscopicsilicovolcanoconiosi");


    }
}
