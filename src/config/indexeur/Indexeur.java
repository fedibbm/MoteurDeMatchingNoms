package config.indexeur;
import inputs.Nom;
import java.util.*;
public abstract class Indexeur { //has to be abstract to add an attribute
    List<Nom> liste ;
    public abstract Map<Integer,List<Nom>> indexer( );
}
