package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Eleve extends Utilisateur {
    protected String niveau;
    protected Classe classe;

    public Eleve(String newNom, String newPrenom, String newEmail, boolean newMale, Date newNaissance, String newNiveau, Classe newClasse) {
        super(newNom, newPrenom, newEmail, newMale, newNaissance);
        this.niveau = newNiveau;
        this.classe = newClasse;
    }

    // Accesseurs LEcture (getter)
    public String getNiveau() {
        return this.niveau;
    }

    public Classe getClasse() {
        return this.classe;
    }

    // Accesseur Ecriture (setter)
    public void setNiveau(String newNiveau) {
        this.niveau = newNiveau;
    }

    public void setClasse(Classe newClasse) {
        this.classe = newClasse;
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
        message += "Niveau : " + this.niveau + "\n";
        message += "Classe : " + this.classe.getNom() + "\n";
        message += "==============================\n";
        return message;
    }
}
