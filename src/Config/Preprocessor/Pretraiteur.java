package Config.Preprocessor;
import java.util.* ;
import  Inputs.Nom;
public class Pretraiteur {
    private List<Nom> listeDeNoms ;
    public List<Nom> nettoyerList ( )   {
        for ( Nom nom : listeDeNoms ){
            List<String> cleanMots = new ArrayList<>();
            for ( String mot : nom.getMots() ){
                mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase(); //^ means not in regexs, this methods removes all special characters and turns the string to lowercase
                cleanMots.add(mot) ;
            }
            nom.setMots(cleanMots) ;
        }
        return listeDeNoms;
    }
    public List<Nom> superClean(){
        for ( Nom nom : listeDeNoms){
            List<String> cleanMots = new ArrayList<>();
            for ( String mot : nom.getMots() ){
                cleanMots.add(mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().replaceAll("[eyaoui]","" ));
                // same here this removes the vowels from the names as a type of encoding

            }
            nom.setMots(cleanMots) ;
        }
    return listeDeNoms ;
    }
    public static Nom superCleanName ( Nom name  ){
        List<String> cleanMots = new ArrayList<>();
        for ( String mot : name.getMots() ){
           cleanMots.add( mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().replaceAll("[eyaoui]","" ));

        }
        name.setMots(cleanMots) ;
        return name ;
    }
    public List<Nom> suprimerVoyelles(){
        for ( Nom nom : listeDeNoms){
            List<String> cleanMots = new ArrayList<>();
            for ( String mot : nom.getMots() ){

                mot.replaceAll("[eyaoui]","" );// same here this removes the vowels from the names as a type of encoding
                cleanMots.add(mot) ;
            }
            nom.setMots(cleanMots) ;
        }
        return listeDeNoms ;
    }
    public List<Nom> getListeDeNoms () {
        return listeDeNoms;
    }
    public void setListeDeNoms (List<Nom> listeDeNoms) {
        this.listeDeNoms = listeDeNoms;
    }
}
