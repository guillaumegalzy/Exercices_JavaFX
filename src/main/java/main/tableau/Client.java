package main.tableau;

public class Client {
    private String nom;
    private String prenom;
    private String ville;

    /**
     *Constructeur par défaut
     */
    public Client() {
    }

    /**
     * Constructeur avec paramètres
     * @param nom : nom du client
     * @param prenom :prénom du client
     * @param ville :ville du client
     */
    public Client(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    //Getters and Setters
    public String getNom() {return nom;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
