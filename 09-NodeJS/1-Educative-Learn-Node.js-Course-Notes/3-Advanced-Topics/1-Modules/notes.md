# What is a module 
En : 
  - Each separate file is treated as a **module** in Node.js.
  - The most common use of modules is to use code or functions from another file.
  - This allows us to keep our code organized and separated into different files.

Fr :
    - Chaque fichier séparé est traité comme un **module** dans Node.js.
    - L'utilisation la plus courante des modules est d'utiliser du code ou des fonctions d'un autre fichier.
    - Cela nous permet de garder notre code organisé et séparé dans différents fichiers.

## Require 
En :
    - **require** is used to import modules , JSON files, and local files.
    - It is passed a relative path as a **string**.
    - It returns the **exports** object of the target module.
    - If the module is not found, it throws an error.

Fr :
    - **require** est utilisé pour importer des modules, des fichiers JSON et des fichiers locaux.
    - Il est passé un chemin relatif en tant que **chaîne**.
    - Il renvoie l'objet **exports** du module cible.
    - Si le module n'est pas trouvé, il lance une erreur.

## The module Wrapper 
En :
    - Before a module is exported , Node js wraps the module code in a function wrapper.
    -```javascript
        (function(exports, require, module, __filename, __dirname){
            // Module code actually lives in here
        });
    ```
    - this wrapper allows us to  :
        - use the **exports** object to export variables and functions.
        - use the **require** function to import other modules.
        - use the **module** object to access information about the current module.
        - use the **__filename** and **__dirname** variables to find the filename and directory name of the current module.

Fr :
    - Avant qu'un module ne soit exporté, Node js enveloppe le code du module dans un wrapper de fonction.
    -```javascript
        (function(exports, require, module, __filename, __dirname){
            // Le code du module vit en fait ici
        });
    ```
    - ce wrapper nous permet de :
        - utiliser l'objet **exports** pour exporter des variables et des fonctions.
        - utiliser la fonction **require** pour importer d'autres modules.
        - utiliser l'objet **module** pour accéder aux informations sur le module actuel.
        - utiliser les variables **__filename** et **__dirname** pour trouver le nom du fichier et le nom du répertoire du module actuel.
    
## Export or module.exports
En :
    - All the var of functions that we want to be accessible in other module have to ve exportedd using **module.exports** or **exports**.
    - The **exports** variable is available within a module's file.
    - it is assigned the value of **module.exports** before the module is evaluated.
    - **module.exports** is the object that's actually returned as the result of a require call.
    - **module.exports** is the object that's actually returned as the result of a require call.
    - **module.exports** is the object that's actually returned as the result of a require call.

Fr :
    - Toutes les variables ou fonctions que nous voulons rendre accessibles dans un autre module doivent être exportées en utilisant **module.exports** ou **exports**.
    - La variable **exports** est disponible dans le fichier d'un module.
    - il se voit attribuer la valeur de **module.exports** avant que le module ne soit évalué.
    - **module.exports** est l'objet qui est réellement renvoyé en tant que résultat d'un appel à require.
    - **module.exports** est l'objet qui est réellement renvoyé en tant que résultat d'un appel à require.
    - **module.exports** est l'objet qui est réellement renvoyé en tant que résultat d'un appel à require.
     