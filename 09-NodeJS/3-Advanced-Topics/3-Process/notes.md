# The **process** object
En :
    - The **process** object is a global that allows us to control the current process.
    - It also has a method that can provide useful information about the current process.
    - Being an instance of **EventEmitter** class , it has a few important events that can be used to monitor the process.
    - The process object is a core module in Node.js, so it is available to use without any further installation.

Fr :
    - L'objet **process** est un objet global qui nous permet de contrôler le processus en cours.
    - Il possède également une méthode qui peut fournir des informations utiles sur le processus en cours.
    - Étant une instance de la classe **EventEmitter**, il possède quelques événements importants qui peuvent être utilisés pour surveiller le processus.
    - L'objet process est un module central de Node.js, il est donc disponible à utiliser sans aucune autre installation.

## **exit** and **beforeExit** events

En: 
    - these 2 events can be very useful at times. consider the scenario : 
        - You wish to save yout program progress to the cloud once it is done processing.the **beforeExit** event  is very perfect for this job , it is fired when the event loop is empty , which means that the program is about to exit.
        - You can register the **beforeExit** event to make a network call to your cloud druve and upload your data.
        - Once yoyr data is uploaded , you can register the **exit** event to terminate the process.

Fr : 
    - ces 2 événements peuvent être très utiles parfois. considérez le scénario :
        - Vous souhaitez enregistrer les progrès de votre programme dans le cloud une fois qu'il a terminé de traiter. l'événement **beforeExit** est très parfait pour ce travail, il est déclenché lorsque la boucle d'événements est vide, ce qui signifie que le programme est sur le point de se terminer.
        - Vous pouvez enregistrer l'événement **beforeExit** pour effectuer un appel réseau à votre cloud druve et télécharger vos données.
        - Une fois vos données téléchargées, vous pouvez enregistrer l'événement **exit** pour terminer le processus.

## **uncaughtException** event
En : 
    - This event is fired when an exception is thrown but not caught.
    - This event is useful for logging the error and then terminating the process.
    - If you do not register this event, the process will terminate with an error message.

Fr :
    - Cet événement est déclenché lorsqu'une exception est levée mais n'est pas attrapée.
    - Cet événement est utile pour enregistrer l'erreur, puis terminer le processus.
    - Si vous n'enregistrez pas cet événement, le processus se terminera avec un message d'erreur.


## Some methods 
En : 
| Method | Description |
| --- | --- |
|**process.argv** |Returns an array containing the command line arguments passed when the Node.js process was launched.|
|**process.cwd()** |Returns the current working directory of the Node.js process.|
|**process.env** |Returns an object containing the user environment.|
|**process.chdir(directory)** |Changes the current working directory of the Node.js process to the specified directory.|
|**process.exit([code])** |Ends the process with the specified code.|
|**process.memoryUsage()** |Returns an object containing information about the memory usage of the Node.js process.|
|**process.nextTick(callback)** |Calls the callback function on the next iteration of the event loop.|

## Streams
En :
    - As we know that **process.stdin** and **process.stdout** and **process.stderr** are instances of **Stream** class.
    - A stream is an abstract interface for working with streaming data in Node.js. stream can be readable, writable, or both.
    - All streams are instances of **EventEmitter** class, so they emit events that can be used to monitor the stream.
    - process.stdin is a readable stream. We use it to read data from user input.
    - process.stdout is a writable stream. It is written to asynchronously, making it non-blocking. console.log and console.info use this stream.
    - process.stderr is also a writable stream. It is written to synchronously and, hence, is blocking. console.warn and console.error use this stream.

Fr :    
    - Comme nous le savons, **process.stdin** et **process.stdout** et **process.stderr** sont des instances de la classe **Stream**.
    - Un flux est une interface abstraite pour travailler avec des données en streaming dans Node.js. le flux peut être lisible, inscriptible ou les deux.
    - Tous les flux sont des instances de la classe **EventEmitter**, ils émettent donc des événements qui peuvent être utilisés pour surveiller le flux.
    - process.stdin est un flux lisible. Nous l'utilisons pour lire les données de l'entrée utilisateur.
    - process.stdout est un flux inscriptible. Il est écrit de manière asynchrone, ce qui le rend non bloquant. console.log et console.info utilisent ce flux.
    - process.stderr est également un flux inscriptible. Il est écrit de manière synchrone et, par conséquent, est bloquant. console.warn et console.error utilisent ce flux.

## Using the process module 
En : 
    - The process module is a core module in Node.js, so it is available to use without any further installation.
    - To use the process module, you need to require it in your file.
    - The process module is a global object, so you can access it anywhere in your code.
    - The process module has a lot of useful methods and properties that can be used to control the current process.

Fr :
    - Le module process est un module central de Node.js, il est donc disponible à utiliser sans aucune autre installation.
    - Pour utiliser le module process, vous devez le requérir dans votre fichier.
    - Le module process est un objet global, vous pouvez donc y accéder n'importe où dans votre code.
    - Le module process possède de nombreuses méthodes et propriétés utiles qui peuvent être utilisées pour contrôler le processus en cours.