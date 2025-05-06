package config.preprocessor;
import inputs.Nom;
import java.util.*;
public interface Pretraiteur<O>{
    public O pretraiter ( List < Nom > listeDeNom );
}
