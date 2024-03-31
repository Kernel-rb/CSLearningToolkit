# What is package.json?

En : 
    - every published package has **package.json** file.
    - This file makes it easy for developers to understand the package.
    - it's gives infomration to **npm** that allows it to identify the project as well as handle the project's dependencies.
    - Nodejs is only aware of two fields **name** and **version**.
    - However , other fields such as **dependencies** and **main** are vital for the package to work properly.

fr : 
    - chaque package publié a un fichier **package.json**.
    - Ce fichier permet aux développeurs de comprendre facilement le package.
    - il fournit des informations à **npm** qui lui permettent d'identifier le projet ainsi que de gérer les dépendances du projet.
    - Nodejs n'est conscient que de deux champs **name** et **version**.
    - Cependant, d'autres champs tels que **dependencies** et **main** sont vitaux pour que le package fonctionne correctement.

## Fields in package.json

| Field | Description |
| --- | --- |
| name | The name of the package. |
| version | The version of the package. |
| description | A brief description of the package. |
| main | The entry point of the package. |
|repository | The location of the source code. |
| keywords | An array of keywords that describe the package. |
|dependencies | An object that lists the package's dependencies. |
|devDependencies | An object that lists the package's development dependencies. |
|name | The name of the package. |
|contributors | An array of contributors to the package. |
|homepage | The URL to the package's homepage. |

## Package dependencies
En  :
    - **dependencies** can be added to the **package.json** file using the **npm install** command.
    - **dependencies** are packages that the project depends on to work properly.
    - **dependencies** are installed in the **node_modules** folder.
    - **dependencies** can be installed using the **npm install** command followed by the package name.

fr :
    - **dependencies** peuvent être ajoutées au fichier **package.json** en utilisant la commande **npm install**.
    - **dependencies** sont des packages dont le projet dépend pour fonctionner correctement.
    - **dependencies** sont installées dans le dossier **node_modules**.
    - **dependencies** peuvent être installées en utilisant la commande **npm install** suivie du nom du package.

## package-lock.json
En :
    - **package-lock.json** is a file that is automatically generated for any operations where **npm** modifies either the **node_modules** directory or the **package.json** file.
    - It describes the exact tree that was generated, such that subsequent installs are able to generate identical trees, regardless of intermediate dependency updates.
    - In simple words , **package-lock.json** is used to lock the version of the package. 

fr :
    - **package-lock.json** est un fichier qui est généré automatiquement pour toutes les opérations où **npm** modifie le répertoire **node_modules** ou le fichier **package.json**.
    - Il décrit l'arbre exact qui a été généré, de sorte que les installations ultérieures peuvent générer des arbres identiques, indépendamment des mises à jour des dépendances intermédiaires.
    - En termes simples, **package-lock.json** est utilisé pour verrouiller la version du package.