package Classes;

import java.util.Date;

public class Professeur extends Utilisateur {
    protected String matiere;
    protected boolean profPrincipale;

    // Constructeur héritage
    public Professeur(String newNom, String newPrenom, String newEmail, boolean newMale, Date newNaissance, String newMatiere, boolean newProfPrincipale) {
        super(newNom, newPrenom, newEmail, newMale, newNaissance);
        this.matiere = newMatiere;
        this.profPrincipale = newProfPrincipale;
    }

    // Accesseur Lecture (getter)
    public String getMatiere() {
        return this.matiere;
    }

    public boolean getProfPrincipale() {
        return this.profPrincipale;
    }

    // Accesseur Ecriture (setter)
    public void setMatiere(String newMatiere) {
        this.matiere = newMatiere;
    }

    public void setProfPrincipale(boolean newProfPrincipale) {
        this.profPrincipale = newProfPrincipale;
    }

    @Override
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
        message += "Matiere : " + this.matiere + "\n";
        message += "Prof Principale : " + this.profPrincipale + "\n";
        message += "==============================\n";
        return message;
    }
}
