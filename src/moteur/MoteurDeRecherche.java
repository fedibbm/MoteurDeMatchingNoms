package moteur;

import generateur.*;
import comparateurs.ComparateurDeNom;
import selectionneur.*;
import config.indexeur.Indexeur;
import config.preprocessor.Pretraiteur;
import inputs.*;

import java.lang.invoke.CallSite;
import java.util.*;
public class MoteurDeRecherche {
    private ComparateurDeNom comparateur ;
    private Generateur generateur ;
    private Selectionneur selectionneur ;
    private List<Pretraiteur> pretraiteur ;
    private Indexeur indexeur ;
    public MoteurDeRecherche(Generateur generateur, ComparateurDeNom comparateur , Selectionneur selectionneur  ) {
        this.generateur = generateur ;
        this.comparateur = comparateur;
        this.selectionneur = selectionneur ;
    }
    public List< Nom > search (Nom cible, List<Nom> liste  ) {
        List< CoupleAvecScore> listCouplesScores = new ArrayList<>();
        List< Nom> cibleList = new ArrayList<>();
        cibleList.add(cible);
        for (Couple couple : generateur.generer ( liste, cibleList ) ){
            CoupleAvecScore coupleAvecScore = new CoupleAvecScore(couple,comparateur.comparerNom(couple.nom1(),couple.nom2()));
            listCouplesScores.add (coupleAvecScore);

        }
        return (List<Nom>) selectionneur.selectionner(listCouplesScores);
    }




}

