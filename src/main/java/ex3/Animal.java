package ex3;

public class Animal {
    private String nom;
    private TypeAnimal type;
    private Comportement comportement;

    public Animal(String nom, TypeAnimal type, Comportement comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    public String getNom() {
        return nom;
    }

    public TypeAnimal getType() {
        return type;
    }

    public Comportement getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return nom + " " + type.name() + " " + comportement.name();
    }
}
