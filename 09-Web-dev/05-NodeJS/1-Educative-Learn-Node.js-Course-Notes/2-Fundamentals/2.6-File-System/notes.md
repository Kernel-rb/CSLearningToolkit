# The fs Module :

En :

- fs is a built-in module in Node.js that allows us to interact with the file system on our computer.
- the fs module provide an synchronous and asynchronous API for interacting with the file system.
- Its should be noted that the async forms always take a completion callback as their last argument.
- the first argument is reserverd for an exception.

Fr : - fs est un module intégré dans Node.js qui nous permet d'interagir avec le système de fichiers sur notre ordinateur. - le module fs fournit une API synchrone et asynchrone pour interagir avec le système de fichiers. - Il convient de noter que les formes asynchrones prennent toujours un rappel de complétion comme dernier argument. - le premier argument est réservé pour une exception.

## Reading Files:

En : - The fs module provides a method called readFile that we can use to read the contents of a file. - The readFile method takes two arguments: the path to the file and a callback function. - The callback function takes two arguments: an error object and the data read from the file. - If an error occurs, the error object will be populated with the error information. - If the file is read successfully, the data argument will contain the contents of the file. - The data argument will be a Buffer object by default, but we can specify an encoding to convert it to a string. - The encoding argument is optional, and if it is not provided, the data will be returned as a Buffer object.

    Fr :
        - Le module fs fournit une méthode appelée readFile que nous pouvons utiliser pour lire le contenu d'un fichier.
        - La méthode readFile prend deux arguments: le chemin du fichier et une fonction de rappel.
        - La fonction de rappel prend deux arguments: un objet d'erreur et les données lues à partir du fichier.
        - Si une erreur se produit, l'objet d'erreur sera rempli avec les informations d'erreur.
        - Si le fichier est lu avec succès, l'argument de données contiendra le contenu du fichier.
        - L'argument de données sera un objet Buffer par défaut, mais nous pouvons spécifier un encodage pour le convertir en chaîne.
        - L'argument d'encodage est facultatif et s'il n'est pas fourni, les données seront renvoyées sous forme d'objet Buffer.

## Read From a File:

En : - We need to import the fs module using the require function. - We can then use the fs.readFile method to read the contents of a file.(fs.readFile(path, callback)) - The readFile method is asynchronous, so we need to provide a callback function that will be called when the file is read. - The callback function takes two arguments: an error object and the data read from the file. - If an error occurs, the error object will be populated with the error information. - If the file is read successfully, the data argument will contain the contents of the file. - The SyncReadFile method is synchronous, so it will block the execution of the program until the file is read. - **Both methods read the entire file into memory before the system . For very large files, this impact on performance and memory usage.**

Fr : - Nous devons importer le module fs en utilisant la fonction require. - Nous pouvons ensuite utiliser la méthode fs.readFile pour lire le contenu d'un fichier. (fs.readFile (chemin, rappel)) - La méthode readFile est asynchrone, nous devons donc fournir une fonction de rappel qui sera appelée lorsque le fichier est lu. - La fonction de rappel prend deux arguments: un objet d'erreur et les données lues à partir du fichier. - Si une erreur se produit, l'objet d'erreur sera rempli avec les informations d'erreur. - Si le fichier est lu avec succès, l'argument de données contiendra le contenu du fichier. - La méthode SyncReadFile est synchrone, elle bloquera donc l'exécution du programme jusqu'à ce que le fichier soit lu. - **Les deux méthodes lisent l'intégralité du fichier en mémoire avant le système. Pour les fichiers très volumineux, cela impacte les performances et l'utilisation de la mémoire.**

## Writing to a Files:

En : - The fs module provides a method called writeFile that we can use to write data to a file. - what if we want to overwrite a file , or perhaps , create a file if it doesn't exist. - for these we have **flags** option that we can pass to the writeFile method.

Fr  : 
    - le module fs fournit une méthode appelée writeFile que nous pouvons utiliser pour écrire des données dans un fichier.

## File Stats :

En :
    - The stats method provides us with a lot of useful information about the file 
Fr : 
    - La méthode stats nous fournit de nombreuses informations utiles sur le fichier

## File Descriptors :
En : 
    - **Descriptors** are unique identifiers that the operating system uses to keep track of open files.
    - When we open a file, the operating system returns a file descriptor that we can use to read and write to the file.
Fr ; 
    - **Les descripteurs** sont des identifiants uniques que le système d'exploitation utilise pour suivre les fichiers ouverts.
    - Lorsque nous ouvrons un fichier, le système d'exploitation renvoie un descripteur de fichier que nous pouvons utiliser pour lire et écrire dans le fichier.
