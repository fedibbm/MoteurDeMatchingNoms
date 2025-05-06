import Generateur.GenerateurDeCandidatsParTaille;
import Selectionneur.SelectionneurSimple;
import comparateurs.*;
import inputs.*;
import config.indexeur.*;
import moteur.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ComparateurDeNom comparateur = new ComparateurDeNomSimple();
        Nom nom1 = new Nom();
        Nom nom2 = new Nom();
        Nom nom3 = new Nom();
        Nom nom4 = new Nom();
        List<String> mots1 = new ArrayList<>();
        List<String> mots2 = new ArrayList<>();
        List< String> mots3 = new ArrayList<>();
        List< String> mots4 = new ArrayList<>();
        List< String> mots0= new ArrayList<>();

        mots1.add("Ahmed");
        mots1.add("bouasba");
        mots2.add("Marouan");
        mots2.add("bouhamed");
        mots3.add("Prix");
        mots3.add("khaled");
        mots4.add("marouane");
        mots0.add("ben Hemd ");
        nom1.setMots(mots1);
        nom2.setMots(mots2);
        nom2.setMots(mots2);
        nom3.setMots(mots3);
        nom4.setMots(mots4);
        List<Nom> listeDeNoms = new ArrayList<>();
        listeDeNoms.add(nom1);
        listeDeNoms.add(nom2);
        listeDeNoms.add(nom3);
        listeDeNoms.add(nom4);
        Nom nom0 = new Nom();
        listeDeNoms.add(nom1);
        SelectionneurSimple selectionneur = new SelectionneurSimple();
        GenerateurDeCandidatsParTaille generateur = new GenerateurDeCandidatsParTaille();
        MoteurDeRecherche moteur = new MoteurDeRecherche(generateur,comparateur, selectionneur);
        System.out.println(moteur.search(nom0, listeDeNoms));


}}