package Classes;

import java.util.ArrayList;

public class Classe {
    private String nom;
    private ArrayList<Eleve> eleves;

    // Constructeur de base
    public Classe(String newNom, ArrayList<Eleve> newEleves) {
        this.nom = newNom;
        this.eleves = newEleves;
    }

    // Surcharge constructeur sans Collection eleves
    public Classe(String newNom) {
        this.nom = newNom;
        this.eleves = new ArrayList<Eleve>();
    }

    // Accesseur Lecture (getter)
    public String getNom() {
        return this.nom;
    }

    public ArrayList<Eleve> getEleves() {
        return this.eleves;
    }

    // Accesseur Ecriture (setter)
    public void setNom(String newNom) {
        this.nom = newNom;
    }

    public void setEleves(ArrayList<Eleve> newEleves) {
        this.eleves = newEleves;
    }

    public void addEleve(Eleve newEleve) {
        this.eleves.add(newEleve);
    }

    public String toString() {
        String message = "==============================\n";
        message += "Nom classe : " + this.nom + "\n";
        if (this.eleves.size() > 0) {
            message += "Eleves : \n";
            for (Eleve eleve : this.eleves) {
                message += "     - " + eleve.nom + " " + eleve.prenom + "\n";
            }
        }
        message += "==============================\n";
        return message;
    }

    public ArrayList<Eleve> getElevesHommes() {
        ArrayList<Eleve> elevesHommes = new ArrayList<Eleve>();
        for (Eleve eleve : this.eleves) {
            if (eleve.isMale) {
                elevesHommes.add(eleve);
            }
        }
        return elevesHommes;
    }

    public ArrayList<Eleve> getElevesFemmes() {
        ArrayList<Eleve> elevesFemmes = new ArrayList<Eleve>();
        for (Eleve eleve : this.eleves) {
            if (!eleve.isMale) {
                elevesFemmes.add(eleve);
            }
        }
        return elevesFemmes;
    }
}
