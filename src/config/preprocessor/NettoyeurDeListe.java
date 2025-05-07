package config.preprocessor;

import inputs.Nom;

import java.util.ArrayList;
import java.util.List;

public class NettoyeurDeListe implements Pretraiteur{
    public List<Nom> pretraiter ( List<Nom> noms ) {
        List<Nom> cleanList =  new ArrayList<Nom>();
        for ( Nom nom : noms ) {
            nom.getMots().toString().replaceAll("[^a-zA-Z//s]",'');
        }
    }
}
