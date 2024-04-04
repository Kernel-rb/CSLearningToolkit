# Software Archetecture Patterns
- definiton : A software architecture pattern is a general, reusable solution to a commonly occurring problem in software architecture within a given context.
## Patterns in Software 
- Solutions to common problems in software design
- Like in writting , u can't to write a  blog whitout a structure ( title, subtitle, paragraphs, etc)

### Pattern Examples 
| Pattern | Description |
|---------|-------------|
|Repository| A layer that sits between the domain and the data source , for example a database|
|Factory| A class that creates objects for example in a game, a factory class that creates enemies|
|Singleton| A class that has only one instance , for example in a game, a class that manages the game state|
|Observer| A class that notifies other classes of changes , for example in a game, a class that notifies other classes of a player's score|
|Strategy| A class that allows you to change the behavior of an object at runtime , for example in a game, a class that allows  you to change the behavior of an enemy|

### TryParse in c#
```csharp
int x = int.Parse("123");
int y = int.Parse("abc"); // Error
```
```csharp
int z = 0;
if(int.TryParse(input, out z))
{
    // z is the parsed value
}
else
{
    // input is not a number
}
```
