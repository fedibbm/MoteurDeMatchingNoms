package Generateur;
import inputs.*;

import java.util.*;
public class GenerateurDeCandidatsParTaille implements Generateur<List<Couple>> {
    public List<Couple> generer(List<Nom> liste1 , List<Nom> liste2 ){
        List<Couple> listeDeTousLesCouples = new ArrayList<>();
        for (Nom nom1 : liste1) {
            for ( Nom nom2 : liste2) {
                if ( nom1.toString().equals(nom2.toString()) ) {
                    listeDeTousLesCouples.add(new Couple(nom1, nom2));
                }
            }
        }
        return listeDeTousLesCouples;
    }}
//    Mapper indexeur = new Mapper();
//    public List<Nom> getListeInitiale() {
//

//        return listeInitiale;
//    }
//    public List<Nom> generer( Nom cible , boolean existsInList ){
//       Mapper map = (Mapper) indexeur;
//        indexeur.setInput(listeInitiale);
//        List<Nom> allPotentialMatches = indexeur.indexer(listeInitiale).get(cible.getMots().toString().length());//finds all the matches
//        if ( existsInList ){
//            for ( Nom nom : allPotentialMatches ){
//                if ( nom == cible){
//                    allPotentialMatches.remove(nom);// removes "cible" that we are looking for matches to , if we want to do that
//                }
//            }}
//        return allPotentialMatches;
    //    }
//public void setListeInitiale(List<Nom> listeInitiale) {
//
//    this.listeInitiale = listeInitiale;
    //}
//public GenerateurDeCandidats() {
//    listeInitiale = new ArrayList<>();
//}





