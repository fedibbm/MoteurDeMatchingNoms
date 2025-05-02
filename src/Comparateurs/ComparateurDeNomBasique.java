package Comparateurs;
import Inputs.Nom;

public class ComparateurDeNomBasique implements ComparateurDeNom {
//    private ComparateurDeChaine comparateurDeChaine;

    public double comparerNom (Nom nom1, Nom nom2) {
        int minMots = Math.min( nom1.getMots().size(), nom2.getMots().size() );
        double score = 0.0 ;
        for ( int i = 0; i < minMots; i++ ) {
        score+= comparer(nom1.getMots().get(i), nom2.getMots().get(i))/minMots ;
    }
        return score ;
    }
    public double comparer( String nom1, String nom2 ){
        int minLength = Math.min( nom1.length(), nom2.length() );
        int commonLetters = 0 ;
        for ( int i = 0; i < minLength; i++ ){
            if ( nom1.charAt(i) == nom2.charAt(i) ){
                commonLetters++;
            }

        }
        return (double)(commonLetters/minLength);
    }
}
