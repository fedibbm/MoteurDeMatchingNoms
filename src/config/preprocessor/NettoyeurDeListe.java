package config.preprocessor;

import inputs.Nom;

import java.util.ArrayList;
import java.util.List;

public class NettoyeurDeListe implements Pretraiteur{
    public List<Nom> pretraiter ( List<Nom> noms ) {
        List<Nom> cleanList =  new ArrayList<Nom>();
        for ( Nom nom : noms ) {
            Nom nomTraite = new Nom();
            for( String mt : nom.getMots()) {
                String motTraite = mt.replaceAll("[^a-zA-Z\\s]", "");
                nomTraite.addMot(motTraite);
            }
            cleanList.add(nomTraite);
        }
        return cleanList;
    }
}
