package moteur;
import config.indexeur.Indexeur;
import inputs.Nom ;
import config.indexeur.Mapper;
import java.util.*;
public class GenerateurDeCandidats  {
    private Indexeur indexeur ;
    private List<Nom> listeInitiale ;
    public List<Nom> genererCandidats( Nom cible , boolean existsInList ){
        indexeur = new Mapper() ;
        ((Mapper)indexeur).setListeDeCandidats(listeInitiale);
       List<Nom> allPotentialMatches = ((Mapper)indexeur).indexer().get(cible.getMots().toString().length());//finds all the matches
       if ( existsInList ){
        for ( Nom nom : allPotentialMatches ){
           if ( nom == cible){
               allPotentialMatches.remove(nom);// removes "cible" that we are looking for matches to , if we want to do that
           }
       }}
       return allPotentialMatches;
    }

    public List<Nom> getListeInitiale() {
        return listeInitiale;
    }
}



