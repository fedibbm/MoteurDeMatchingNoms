package Selectionneur;
import comparateurs.ComparateurDeNom;
import inputs.CoupleAvecScore;
import moteur.*;
import inputs.Nom;

import java.util.ArrayList;
import java.util.List;

public class SelectionneurSimple implements Selectionneur<List<Nom>> {

    public  List<Nom> selectionner(List<CoupleAvecScore> couplesAvecScores) {
        List<Nom> nomsSelectionnes  = new ArrayList<>();
        for ( CoupleAvecScore couple : couplesAvecScores ){
            if ( couple.score() >= seuil ){
                nomsSelectionnes.add(couple.coupleDeNoms().nom2());
            }
       }
        return nomsSelectionnes;
    }

}

