package selectionneur;

import inputs.CoupleAvecScore;

import java.util.List;

public interface Selectionneur<O> {
    double seuil = 0.7 ;
    O selectionner (List<CoupleAvecScore> couplesAvecScores);
}
