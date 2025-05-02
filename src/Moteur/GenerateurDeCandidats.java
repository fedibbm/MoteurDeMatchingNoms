package Moteur;
import Config.Indexeur.Indexeur;
import Inputs.Nom ;
import Config.Indexeur.Mapper;
import java.util.*;
public class GenerateurDeCandidats  {
    private List<Nom> listeInitiale ;
    Indexeur indexeur ;
    public List<Nom> genererCandidats( Nom cible , boolean exists){
        indexeur = new Mapper() ;
        ((Mapper)indexeur).setListeDeCandidats(listeInitiale);
       List<Nom> allPotentialMatches = ((Mapper)indexeur).indexer().get(cible.getMots().toString().length());//finds all the matches
       if ( exists ){
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



