//package config.preprocessor;
//import java.util.* ;
//import  inputs.Nom;
//public class PretraiteurSimple implements Pretraiteur<List<Nom>> {
//
//    public List<Nom> pretraiter (List<Nom> listeDeNoms )   {
//        for ( Nom nom : listeDeNoms ){
//            List<String> cleanMots = new ArrayList<>();
//            for ( String mot : nom.getMots() ){
//                mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase(); //^ means not in regexs, this method removes all special characters and turns the string to lowercase
//                cleanMots.add(mot) ;
//            }
//            nom.setMots(cleanMots) ;
//        }
//        return listeDeNoms;
//    }
//    public static List<Nom> superClean(List<Nom> listeDeNoms){
//        for ( Nom nom : listeDeNoms){
//            List<String> cleanMots = new ArrayList<>();
//            for ( String mot : nom.getMots() ){
//                cleanMots.add(mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().replaceAll("[eyaoui]","" ));
//
//            }
//            nom.setMots(cleanMots) ;
//        }
//    return listeDeNoms ;
//    }
//    public static Nom superCleanName ( Nom name  ){
//        List<String> cleanMots = new ArrayList<>();
//        for ( String mot : name.getMots() ){
//           cleanMots.add( mot.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().replaceAll("[eyaoui]","" ));
//
//        }
//        name.setMots(cleanMots) ;
//        return name ;
//    }
//    public static List<Nom> suprimerVoyelles(List<Nom> listeDeNoms){
//        for ( Nom nom : listeDeNoms){
//            List<String> cleanMots = new ArrayList<>();
//            for ( String mot : nom.getMots() ){
//
//                mot.replaceAll("[eyaoui]","" );// same here this removes the vowels from the names as a type of encoding
//                cleanMots.add(mot) ;
//            }
//            nom.setMots(cleanMots) ;
//        }
//        return listeDeNoms ;
//    }
//
//}
