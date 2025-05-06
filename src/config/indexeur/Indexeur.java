package config.indexeur;
import inputs.Nom;
import java.util.*;
public interface Indexeur<O> { //has to be abstract to add an attribute
      O indexer(List<Nom> input);

}
