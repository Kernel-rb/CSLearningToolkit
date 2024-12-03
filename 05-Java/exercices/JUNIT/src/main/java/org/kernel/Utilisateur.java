package org.kernel;

/**
 * À vous de compléter la documentation
 *
 * class utilissatrue pour initiliser un utilisatuer
 * @author : @Kernel-rb
 * @since : 0.1
 * @version  : 0.1
 */
public class Utilisateur {
    private String nom;
    private String email;
    private int age;

    /**
     * À documenter : constructeur
     * constrcuteur de la class utilisateur
     * @author @Kernel-rb
     * @param nom le nom de  l utilisateur  de type string
     * @param email  email de l utilisateur de type string
     * @param  age l age de l utilisatuer de type int
     * @since  0.1
     * @version 0.1
     */
    public Utilisateur(String nom, String email, int age) {
        this.nom = nom;
        this.email = email;
        this.age = age;
    }

    /**
     * Méthode à documenter
     * methode qui retour true si l age de l utilisatuer qui plus grand ou égale a 18 , et false si il est inferieur de 18
     * @author  @kernel-rb
     * @return  boolean
     * @since 0.1
     * @version 0.1
     */
    public boolean estMajeur() {
        return age >= 18;
    }

    /**
     * À documenter
     * une methode qui chnage le email de l utilisateur
     * @author @kernel-rb
     * @param nouveau mail de type string
     * @Throw IllegalArgumentException si le mail ne contien un "@"
     * @since 0.1
     * @version 0.1
     */
    public void changerEmail(String nouvelEmail) {
        // Validation basique de l'email
        if (nouvelEmail.contains("@")) {
            this.email = nouvelEmail;
        } else {
            throw new IllegalArgumentException("Email invalide");
        }
    }
}