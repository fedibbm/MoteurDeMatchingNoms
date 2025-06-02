#  Système Intelligent de Correspondance de Chaînes

Ce projet est un système modulaire en Java conçu pour effectuer différentes opérations sur des chaînes de caractères, telles que :
- La recherche d’un nom dans une base de données
- La comparaison de deux bases de données
- La déduplication de données

Il permet de configurer dynamiquement les composants suivants :
- **Prétraiteurs** (normalisation des données)
- **Comparateurs** (mesure de similarité)
- **Sélectionneurs** (filtrage des meilleurs résultats)
- **Générateurs de candidats + Indexeurs** (optimisation des performances)

---

## ⚙️ Fonctionnalités

###  Options de prétraitement
- `TransformateurMinuscules` : met tout en minuscules
- `NettoyeurDeListe` : supprime les caractères spéciaux et standardise les entrées
- Il est possible de combiner les deux pour une meilleure normalisation

###  Algorithmes de comparaison
- `ComparateurLevenshtein` : mesure la distance d’édition entre deux chaînes
- `ComparateurJaroWinkler` : mesure la similarité d’alignement des caractères

###  Stratégies de sélection
- `SelectionneurAvecSeuil` : renvoie tous les résultats dépassant un seuil
- `SelectionneurDeNPremiers` : renvoie les N meilleures correspondances
- `SelectionneurTous` : renvoie toutes les correspondances possibles
- `SelectionneurSimple` : stratégie par défaut

###  Génération de candidats
- `GenerateurSimple` : correspondance naïve de tous les éléments
- `GenerateurDeCandidatsParTailleV2` : filtre optimisé basé sur la taille des chaînes

---

##  Exécution du programme
1. **Compiler le projet**
```bash
javac -d out $(find src -name "*.java")
```
2. **Exécution**
```bash
java -cp out Main
```

