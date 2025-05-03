package moteur;

import inputs.Nom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Selectionneur {
    private static final double seuil = 0.7 ;
    private MoteurDeRecherche moteur ;
    public List<Nom> slectionner(Nom cible ){
        List<Nom> listeFinale = new ArrayList<Nom>();
         for (Nom nom : moteur.search(cible).keySet()){
             if ( moteur.search(cible).get(nom)>seuil ){
                 listeFinale.add(nom);
             }
         }
         return listeFinale;
    }
}

