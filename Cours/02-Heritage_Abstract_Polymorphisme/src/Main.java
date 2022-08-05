import java.io.*;
import java.util.Date;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        Date dateNaissanceElliot = new Date(1986, 8, 17);
        Classe classe1 = new Classe("BTS SIO 1");
        Eleve elliot = new Eleve("Alderson", "Elliot", "elliot.alderson@fsociety.com", true, dateNaissanceElliot,"1er annee", classe1);
        classe1.addEleve(elliot);
        System.out.println(elliot);
        System.out.println(classe1);
    }
}
