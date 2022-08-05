package Classes;

import java.util.Date;

public class Utilisateur {
    // Attribus
    private String nom;
    private String prenom;
    private String email;
    private boolean isMale;
    private Date naissance;

    // Constructeur
    public Utilisateur(String newNom, String newPrenom, String newEmail, boolean newMale, Date newNaissance) {
        this.nom = newNom;
        this.prenom = newPrenom;
        this.email = newEmail;
        this.isMale = newMale;
        this.naissance = newNaissance;
    }

    // Accesseurs Lecture (getter)

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getIsMale() {
        return this.isMale;
    }

    public Date getNaissance() {
        return this.naissance;
    }

    // Accesseurs Ecriture (setter)

    public void setNom(String newNom) {
        this.nom = newNom;
    }

    public void setPrenom(String newPrenom) {
        this.prenom = newPrenom;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void  setIsMale(boolean newIsMale) {
        this.isMale = newIsMale;
    }

    public void setNaissance(Date newNaissance) {
        this.naissance = newNaissance;
    }

    // Surcharge ToString

    public String toString() {
        String message = "==============================\n";
        message += "Nom : " + this.nom + "\n";
        message += "Prenom : " + this.prenom + "\n";
        message += "Email : " + this.email + "\n";
        if (this.isMale) {
            message += "Sexe : Homme \n";
        }
        else {
            message += "Sexe : Femme \n";
        }
        message += "Date de naissance : " + this.naissance.getDate() + "/" + this.naissance.getMonth() + "/" + this.naissance.getYear() + "\n";
        message += "==============================\n";
        return message;
    }
}
