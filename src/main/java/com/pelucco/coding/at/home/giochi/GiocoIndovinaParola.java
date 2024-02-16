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


        // Aggiunta degli indovinelli e delle risposte alla mappa
        indovinelli.put("Chi sono i due fratelli che stanno sempre in mezzo al sole e alla luna?", "Giuca e Luna");
        indovinelli.put("Ha denti ma non mangia, ha un letto ma non dorme. Chi è?", "Una pettine");
        indovinelli.put("Inizia la notte e vola senza rumore. A cosa mi riferisco?", "Le stelle");
        indovinelli.put("Ha molte chiavi ma apre una sola porta. Cosa è?", "Un pianoforte");
        indovinelli.put("Voli senza ali, corri senza gambe. Cosa è?", "Un temporale");
        indovinelli.put("Si getta ma non si bagna mai. Cosa è?", "Un dado");
        indovinelli.put("Ho il cuore in testa, chi sono?", "L'asino");
        indovinelli.put("Attraversa il fiume senza bagnarsi. Cosa è?", "Il ponte");
        indovinelli.put("Sono alto quanto un albero ma non ho foglie, chi sono?", "Il chiodo");
        indovinelli.put("È nero, bianco e rosso tutto intero. Chi è?", "Un pinguino con la febbre");

        indovinelli.put("Quanto è lungo un anno?", "12 mesi");
        indovinelli.put("Qual è l'animale più veloce?", "Il ghepardo");
        indovinelli.put("Qual è la cosa che è più grande quando la comprimi?", "Il buco");
        indovinelli.put("Cosa si può spezzare anche se non si è mai tenuto?", "Una promessa");
        indovinelli.put("Cosa ha le ali ma non vola?", "Una sedia");
        indovinelli.put("Quante lettere ci sono nell'alfabeto?", "11 (nel termine 'nell'alfabeto')");
        indovinelli.put("Cosa si può vedere con gli occhi chiusi?", "Sogni");
        indovinelli.put("Quale parola è scritta in modo errato in ogni dizionario?", "Errato");
        indovinelli.put("Quanto è pesante un kilogrammo di piume?", "Un kilogrammo");
        indovinelli.put("Qual è la parola più lunga della lingua italiana?", "Pneumoultramicroscopicsilicovolcanoconiosi");


    }
}
