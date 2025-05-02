package Moteur;

import Comparateurs.ComparateurDeNom;
import Config.Preprocessor.Pretraiteur;
import Inputs.Nom;
import java.util.*;
import Moteur.GenerateurDeCandidats;
public class MoteurDeRecherche {
    private ComparateurDeNom comparateur ;
    private Pretraiteur pretraiteur ;
    private GenerateurDeCandidats candidats ;

    public Map<Double , Nom> search ( Nom cible  ) {
        Map<Double, Nom > scoreEtNoms = new HashMap<>();
        Nom cleanCible = Pretraiteur.superCleanName(cible);
        Pretraiteur pproc = new Pretraiteur();
        pproc.setListeDeNoms(this.candidats.getListeInitiale().subList(0, candidats.getListeInitiale().size()));
        List<Nom> pprocessedList=pproc.superClean();
        for ( int i= 0 ; i < pprocessedList.size() ; i++ ) {
            scoreEtNoms.put ( comparateur.comparerNom ( pprocessedList.get(i), cleanCible ),candidats.getListeInitiale().get(i) );// this links every name from the initial table to the result of the comparaison of its encoded form to the encoded cible name
        }
    return scoreEtNoms;

    }
}
