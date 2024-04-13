# Matching nodes and relationships
## En
- In cypher we use the `MATCH` clause to match nodes and relationships.
- ```cypher
MATCH (s:Student {first:'Alia'}) --(c:Country) RETURN *
```

## Fr
- En cypher, nous utilisons la clause `MATCH` pour faire correspondre des nœuds et des relations.
- ```cypher
MATCH (s:Student {first:'Alia'}) --(c:Country) RETURN *
```

# Accessing properties of nodes with relationships
## En
- To access the properties of nodes with relationships, we can use the following query:
```cypher
MATCH (s:Student)-[r:OBTAINED]-> () WHERE r.gpa > 3.98 RETURN s.first , s.last ,r.gpa
```

## Fr
- Pour accéder aux propriétés des nœuds avec des relations, nous pouvons utiliser la requête suivante :
```cypher
MATCH (s:Student)-[r:OBTAINED]-> () WHERE r.gpa > 3.98 RETURN s.first , s.last ,r.gpa
```


### Example
- In this example, we are matching a student with the first name "Alia" who has a GPA greater than 2.0. We are returning the first name, last name, and GPA of the student. 

```cypher
MATCH (s:Student)-[r:OBTAINED]-> () WHERE r.gpa > 2.0 AND s.first ="Alia" RETURN s.first AS Name , s.last AS Family , r.gpa AS GPA
```
