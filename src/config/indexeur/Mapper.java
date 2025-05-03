package config.indexeur;
import java.util.* ;
import inputs.Nom ;
public class Mapper extends Indexeur{
    private List<Nom> listeDeCandidats ;
    public Map<Integer, List<Nom>> indexer (){
            Map<Integer, List<Nom>> dictionnaire = new HashMap<>();
            for (Nom nom : listeDeCandidats) {
                int taille = nom.getMots().toString().length();
                dictionnaire.computeIfAbsent(taille, k -> new ArrayList<>()).add(nom);
            }
            return dictionnaire;

    }
    public void setListeDeCandidats(List<Nom> listeDeCandidats) {
        this.listeDeCandidats = listeDeCandidats;
    }


}
