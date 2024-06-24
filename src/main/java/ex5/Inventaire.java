package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 4));
        caisses.add(new Caisse("Moyens objets", 20));
        caisses.add(new Caisse("Grands objets", Integer.MAX_VALUE)); // valeur arbitraire
    }

    public void addItem(Item item) {

        //TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
        for (Caisse caisse : caisses){
            if(caisse.addItem(item)){
                break;
            }
        }
    }

    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses){
            tailleTotale += caisse.getSize();
        }
        return tailleTotale;
    }
}
