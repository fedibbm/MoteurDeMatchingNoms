package Inputs;
import java.util.*;
public class Nom {
    private List<String> mots;

    public Nom() {
        mots = new ArrayList<>();
    }

    public Nom (List<String> mots) {
        this.mots = mots;
    }
    public List<String> getMots() {
        return mots;
    }

    public void setMots(List<String> mots) {
        this.mots = mots;
    }

    public boolean equals(Object o) {
        Nom nom = (Nom) o;
        return mots.equals(nom.mots);
    }
    public String toString() {
        return String.join("", mots);
    }
}
//    public Nom nettoyer ( ){ // remove all type of special characters that might make comparaison inaccurate
//        Nom name = new Nom();
//        for ( String mot : mots ){
//            mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().trim(); //^ means not in regexs, this methods removes all special characters and turns the string to lowercase
//            name.mots.add(mot);
//            }
//        return name ;
//    }
//    public Nom supprimerVoyelles ( ){
//       Nom name = new Nom();
//       this.nettoyer();
//       for ( String mot : mots ){
//           mot.replaceAll("[eyaoui]","" );// same here this removes the vowels from the names as a type of encoding
//               name.mots.add(mot);
//       }
//       return name ;
//    }
