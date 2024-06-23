# Matching Nodes
## En
- In cypher we use the `MATCH` clause to match nodes.
- Matching provides a way to find nodes in the graph.

## Fr
- En cypher, nous utilisons la clause `MATCH` pour faire correspondre des nœuds.
- La correspondance fournit un moyen de trouver des nœuds dans le graphe.

## To return the nodes on the graph
### En
- To return all the nodes in the graph, we can use the following query:
```cypher
MATCH (n) RETURN n
```

### Fr
- Pour retourner tous les nœuds du graphe, nous pouvons utiliser la requête suivante :
```cypher
MATCH (n) RETURN n
```
### To return node with particular label
#### En
- To return all the nodes with a particular label, we can use the following query:
```cypher
MATCH (n:Person) RETURN n
```

#### Fr
- Pour retourner tous les nœuds avec une étiquette particulière, nous pouvons utiliser la requête suivante :
```cypher
MATCH (n:Personne) RETURN n
```

### To return node with particular property
#### En
- To return all the nodes with a particular property, we can use the following query:
```cypher
MATCH (n:Person {name: 'Alice'}) RETURN n
```

#### Fr
- Pour retourner tous les nœuds avec une propriété particulière, nous pouvons utiliser la requête suivante :
```cypher
MATCH (n:Personne {nom: 'Alice'}) RETURN n
```

