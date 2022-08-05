import java.io.*;
import java.util.Date;

import Classes.*;

public class Main {

    public static void main(String[] args) {
        Date dateNaissanceElliot = new Date(1986, 8, 17);
        Utilisateur elliot = new Utilisateur("Alderson", "Elliot", "elliot.alderson@fsociety.com", true, dateNaissanceElliot);
        System.out.println(elliot.toString());
    }

}
