package inputs;
//
//public record CoupleAvecScore(Couple coupleDeNoms, double score) {
//}

public class CoupleAvecScore implements Comparable<CoupleAvecScore>{
    Couple coupleDeNoms;
    double score;

    public int compareTo(CoupleAvecScore autreCoupleAvecScore){
        return Double.compare(this.score, autreCoupleAvecScore.score);
    }
}
