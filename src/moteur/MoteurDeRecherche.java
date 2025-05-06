package moteur;

import Generateur.GenerateurDeCandidatsParTaille;
import comparateurs.ComparateurDeNom;
import Selectionneur.*;
import config.indexeur.Indexeur;
import config.preprocessor.Pretraiteur;
import inputs.*;
import inputs.Nom;
import java.util.*;
public class MoteurDeRecherche {
    private ComparateurDeNom comparateur ;
    private GenerateurDeCandidatsParTaille generateur ;
    private Selectionneur selectionneur ;
    private Pretraiteur pretraiteur ;
    private Indexeur indexeur ;
    public MoteurDeRecherche(GenerateurDeCandidatsParTaille generateur, ComparateurDeNom comparateur , Selectionneur selectionneur  ) {
        this.generateur = generateur ;
        this.comparateur = comparateur;
        this.selectionneur = selectionneur ;
    }
    public List< Nom > search (Nom cible, List<Nom> liste  ) {
        List< CoupleAvecScore> listCouplesScores = new ArrayList<>();
        List< Nom> cibleList = new ArrayList<>();
        cibleList.add(cible);
        for (Couple couple : generateur.generer ( liste, cibleList ) ){
            CoupleAvecScore coupleAvecScore = new CoupleAvecScore( couple , comparateur.comparerNom(couple.nom1(),couple.nom2()));
            listCouplesScores.add (coupleAvecScore);

        }

            return (List<Nom>) selectionneur.selectionner(listCouplesScores);

    }

}
//    public Map<Nom,Double> search (Nom  cible ) {
//        Map< Nom , Double  > scoreEtNoms = new HashMap<>();
//        Nom cleanCible = PretraiteurSimple.superCleanName(cible);
//        List<Nom> candidats = generateur.generer(cible,false);
//        List<Nom> pprocessedList= PretraiteurSimple.superClean(candidats);
//        for ( int i= 0 ; i < pprocessedList.size() ; i++ ) {
//            scoreEtNoms.put (generateur.getListeInitiale().get(i),comparateur.comparerNom(pprocessedList.get(i),cleanCible));
//            // this links every name from the initial table to the result of the comparaison of its encoded form with the encoded cible name
//            // changed the order of the HashMap because two names can possibly produce the same score to a comparaison
//            // this solution though has it's own problems because we have to suppose that the list to candidats has no redundancies
//            // still felt better than the first one, debatable
//        }
//        return scoreEtNoms;
//
//    }
