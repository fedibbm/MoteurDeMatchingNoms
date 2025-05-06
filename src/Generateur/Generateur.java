package Generateur;

import inputs.Nom;

import java.util.List;

public interface Generateur<O> {
   O generer (List<Nom> liste1 , List<Nom> liste2);
}
