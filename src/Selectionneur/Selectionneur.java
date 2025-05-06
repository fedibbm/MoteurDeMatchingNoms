package Selectionneur;

import inputs.CoupleAvecScore;
import inputs.Nom;

import java.util.List;

public interface Selectionneur<O> {
    double seuil = 0.7 ;
    O selectionner (List<CoupleAvecScore> couplesAvecScores);
}
