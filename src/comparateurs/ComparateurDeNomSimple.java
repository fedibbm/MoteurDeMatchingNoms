package comparateurs;
import inputs.Nom;
public class ComparateurDeNomSimple implements ComparateurDeNom {
    public double comparerNom(Nom nom1, Nom nom2){
        return nom1.equals(nom2) ? 1.0 : 0.0;
    }
}
