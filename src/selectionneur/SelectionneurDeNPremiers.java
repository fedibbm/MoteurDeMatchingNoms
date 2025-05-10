package selectionneur;

import inputs.CoupleAvecScore;
import inputs.Nom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionneurDeNPremiers implements Selectionneur<List<Nom>> {
     public List<Nom> selectionner(List<CoupleAvecScore> couplesAvecScores){
        Collections.sort(couplesAvecScores);
        List<Nom> listeDeNomsSelectionnes = new ArrayList<>();
        for (CoupleAvecScore couple : couplesAvecScores){
            listeDeNomsSelectionnes.add(couple.coupleDeNoms.nom2());
        }
        return listeDeNomsSelectionnes;
     }
}
