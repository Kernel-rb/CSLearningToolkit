# UDP
En : 
    - UDP is  the ther most common communication protocol on the internet.
    - It provides a simple and lightweight connectionless communication protocol.
    - Being connectionless, UDP is faster than TCP.
    - UDP is a good choice for real-time applications like online games, live streaming, and VoIP.
    - UDP is a datagram protocol, meaning that data is sent in small packets called datagrams.

Fr :
    - UDP est le deuxième protocole de communication le plus courant sur Internet.
    - Il fournit un protocole de communication simple et léger sans connexion.
    - Étant sans connexion, UDP est plus rapide que TCP.
    - UDP est un bon choix pour les applications en temps réel comme les jeux en ligne, le streaming en direct et la VoIP.
    - UDP est un protocole de datagramme, ce qui signifie que les données sont envoyées dans de petits paquets appelés datagrammes.


## The **dgram** module
En : 
    - The **dgram** module provides an async network api for creating datagram-based servers (dgram.createSocket()) and clients (dgram.createSocket()).
    - The **dgram** module is used to create UDP clients and servers.
    - The **dgram** module provides an implementation of UDP Datagram sockets 

Fr :
    - Le module **dgram** fournit une API réseau asynchrone pour créer des serveurs (dgram.createSocket()) et des clients (dgram.createSocket()) basés sur des datagrammes.
    - Le module **dgram** est utilisé pour créer des clients et des serveurs UDP.
    - Le module **dgram** fournit une implémentation des sockets de datagrammes UDP


## Diff between TCP and UDP
En : 
    - TCP is connection-oriented, meaning that a connection must be established between the sender and the receiver before data can be sent.
    - TCP is a full-duplex protocol, meaning that data can be sent in both directions at the same time.
    - TCP is reliable, meaning that it provides a reliable way of sending packets in an ordered and error-checked stream.
    - UDP is connectionless, meaning that no connection needs to be established between the sender and the receiver before data can be sent.
    - UDP is faster than TCP because it is connectionless.
    - UDP is a datagram protocol, meaning that data is sent in small packets called datagrams.
    - UDP is not reliable, meaning that it does not provide a reliable way of sending packets in an ordered and error-checked stream.

Fr :

    - TCP est orienté connexion, ce qui signifie qu'une connexion doit être établie entre l'expéditeur et le destinataire avant que les données puissent être envoyées.
    - TCP est un protocole full-duplex, ce qui signifie que les données peuvent être envoyées dans les deux sens en même temps.
    - TCP est fiable, ce qui signifie qu'il fournit un moyen fiable d'envoyer des paquets dans un flux ordonné et vérifié par erreur.
    - UDP est sans connexion, ce qui signifie qu'aucune connexion n'a besoin d'être établie entre l'expéditeur et le destinataire avant que les données puissent être envoyées.
    - UDP est plus rapide que TCP car il est sans connexion.
    - UDP est un protocole de datagramme, ce qui signifie que les données sont envoyées dans de petits paquets appelés datagrammes.
    - UDP n'est pas fiable, ce qui signifie qu'il ne fournit pas un moyen fiable d'envoyer des paquets dans un flux ordonné et vérifié par erreur.

