package inputs;
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
    public boolean equals  ( Nom nom ){
        return mots.equals(nom.mots);
    }
}
