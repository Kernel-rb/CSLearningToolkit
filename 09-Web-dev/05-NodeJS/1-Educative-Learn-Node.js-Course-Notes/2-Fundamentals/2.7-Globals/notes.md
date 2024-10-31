# Everywhere 
En : 
    - Global object are available in all modules. 
    - This allows them to be used without importing them.
Fr :
    - Les objets globaux sont disponibles dans tous les modules.
    - Cela permet de les utiliser sans les importer.
## Some Global Objects:
En : 
    - **__dirname** : The directory name of the current module.
    - **__filename** : The file name of the current module.
    - **exports** : An object that is used to export from a module.
    - **module** : A reference to the current module.
    - **require()** : A function to import modules.
    - **console** : A global console object.
    - **process** : A global process object.
Fr :
    - **__dirname** : Le nom du répertoire du module actuel.
    - **__filename** : Le nom du fichier du module actuel.
    - **exports** : Un objet utilisé pour exporter à partir d'un module.
    - **module** : Une référence au module actuel.
    - **require()** : Une fonction pour importer des modules.
    - **console** : Un objet console global.
    - **process** : Un objet processus global.

## The Global Object:
En :
    - There is a difference in what is considered the global scope in the browser and in Node.js.
    - In the browser, the global scope is the window object.
    - In Node.js, the global scope is the global object.
    - An easy way to think about is as follows : 
        - A var defined in a browser will be global and accessible from anywhere.
        - A var defined on Node.js will be local to that module alone and not accessible from other modules.
    - In node js, the global object can be used to see whatever is in the global scope.
Fr :
    - Il y a une différence dans ce qui est considéré comme la portée globale dans le navigateur et dans Node.js.
    - Dans le navigateur, la portée globale est l'objet window.
    - Dans Node.js, la portée globale est l'objet global.
    - Un moyen facile de penser est le suivant :
        - Une var définie dans un navigateur sera globale et accessible de n'importe où.
        - Une var définie sur Node.js sera locale à ce module uniquement et non accessible depuis d'autres modules.
    - Dans node js, l'objet global peut être utilisé pour voir ce qui est dans la portée globale.