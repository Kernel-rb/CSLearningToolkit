# The web
En : 
    - Websites like Google , dont use a command line interface to interact with the server.
    - Simple server and clients that works using the terminal exist on the transport layer.
    - whereas HTTP resides on the application layer of the internet protocol suite.
    - This is the layer users interact with using a website's front end.
    - Node js allows us to serve web pages using the HTTP module.
    - The HTTP module provides a way of creating a server that listens for incoming requests.


Fr  :   
    - Des sites Web comme Google n'utilisent pas d'interface en ligne de commande pour interagir avec le serveur.
    - Des serveurs et des clients simples qui fonctionnent en utilisant le terminal existent sur la couche de transport.
    - alors que HTTP réside sur la couche d'application de la suite de protocoles Internet.
    - C'est la couche avec laquelle les utilisateurs interagissent en utilisant l'interface frontale d'un site Web.
    - Node js nous permet de servir des pages Web en utilisant le module HTTP.
    - Le module HTTP fournit un moyen de créer un serveur qui écoute les demandes entrantes.

## The **http** module

| method | description |
| --- | --- |
| http.createServer() | creates a new HTTP server |
| server.listen() | listens for incoming requests |
| server.on() | listens for events |
| server.close() | closes the server |
| res.statusCode | status code of the response |
| res.setHeader() | sets the header of the response |
| res.write() | writes the response to the client |
| res.end() | ends the response |
