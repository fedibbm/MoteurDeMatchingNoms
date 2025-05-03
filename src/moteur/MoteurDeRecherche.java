package moteur;

import comparateurs.ComparateurDeChaine;
import comparateurs.ComparateurDeNom;
import config.preprocessor.Pretraiteur;
import inputs.Nom;
import java.util.*;

public class MoteurDeRecherche {
    private ComparateurDeNom comparateur ;
    private GenerateurDeCandidats candidats ;

    public Map<Nom,Double> search (Nom  cible) {
        Map< Nom , Double  > scoreEtNoms = new HashMap<>();
        Nom cleanCible = Pretraiteur.superCleanName(cible);
        List<Nom> pprocessedList=Pretraiteur.superClean(candidats.getListeInitiale());
        for ( int i= 0 ; i < pprocessedList.size() ; i++ ) {
            scoreEtNoms.put (candidats.getListeInitiale().get(i),comparateur.comparerNom(pprocessedList.get(i),cleanCible));
            // this links every name from the initial table to the result of the comparaison of its encoded form with the encoded cible name
            // changed the order of the HashMap because two names can possibly produce the same score to a comparaison
            // this solution though has it's own problems because we have to suppose that the list to candidats has no redundancies
            // still felt better than the first one, debatable
        }
        return scoreEtNoms;

    }
}
