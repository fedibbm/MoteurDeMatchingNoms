package generateur;

import inputs.*;

import java.util.List;

public interface Generateur {
   List<Couple> generer (List<Nom> liste1 , List<Nom> liste2);
}
