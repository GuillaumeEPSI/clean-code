package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;

    private int poidsMAx;
    private List<Item> items;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom, int poidsMAx) {
        super();
        this.nom = nom;
        this.poidsMAx = poidsMAx;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Getter pour l'attribut poidsMax
     *
     * @return le poidsMAx
     */
    public int getPoidsMAx() {
        return poidsMAx;
    }

    /**
     *
     * @param poidsMAx the poidsMAx to set
     */
    public void setPoidsMAx(int poidsMAx) {
        this.poidsMAx = poidsMAx;
    }

    /**
     * Indique si une caisse peut "accueillir un objet
     * @param item l'item à tester
     * @return true si sont poids est inférieur au poidsMax, false sinon
     */
    public boolean canHoldItem(Item item){
        return item.getPoids() <= poidsMAx;
    }

    /**
     * Ajoute un item si il rentre dans la caisse
     * @param item l'item à rajouter
     */
    public boolean addItem(Item item){
        if (canHoldItem(item)){
            items.add(item);
            return true;
        }
        return false;
    }

    public int getSize(){
        return items.size();
    }
}
