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


        for (Caisse caisse : caisses){
            if(caisse.addItem(item)){
                break;
            }
        }

        //TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
        if (item.getPoids() < 5) {
            caisses.get(0).getItems().add(item);
        }
        if (item.getPoids() >= 5 && item.getPoids() <= 20) {
            caisses.get(1).getItems().add(item);
        }
        if (item.getPoids() >= 20) {
            caisses.get(2).getItems().add(item);
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
