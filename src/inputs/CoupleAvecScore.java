package inputs;

public class CoupleAvecScore implements Comparable<CoupleAvecScore>{
    public Couple coupleDeNoms;
    public double score;
    public CoupleAvecScore ( Couple coupleDeNoms, double score){
        this.coupleDeNoms = coupleDeNoms;
        this.score = score;
    }
    public int compareTo(CoupleAvecScore autreCoupleAvecScore){
        return Double.compare(this.score, autreCoupleAvecScore.score);
    }
}