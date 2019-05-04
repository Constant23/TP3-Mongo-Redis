# TP3-Mongo-Redis
Authors : LANGNITO Constant
# Mongo DB

## Quelles sont les limites d'une base de données orientée document ?

Une des limites d'une base orientée document est qu'on ne dispose pas d'une structure clairement définie, la qualité des données fournies sont variable et les requêtes sont très limitées.

De plus sur un très grand volume de données (centaines-milliers de Teraoctets) le modèle peut atteindre des limites en terme de performance.


## Quels sont les types de données stockés dans Redis ?

Chaînes de caractères, tableaux associatifs, listes, ensembles, ensembles ordonnées...

## Que peut-on faire comme type de requêtes ?

Avec Redis, on ne peut faire des requêtes que sur les clefs.
Il est possible d'ajouter une valeur (SET), supprimer (DEL) une valeur ou voir les valeurs (GET) d'une clé avec Redis. Il est également possible d'incrémenter un nombre contenu dans une clé (INCR)
