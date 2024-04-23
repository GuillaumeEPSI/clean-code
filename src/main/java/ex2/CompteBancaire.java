package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private TypeCompte type;

    /**
     * Ce constructeur est celui appelé par les enfants
     *
     * @param solde
     * @param decouvert
     * @param type
     */
    protected CompteBancaire(TypeCompte type, double solde, double decouvert, double tauxRemuneration) {
        super();
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = tauxRemuneration;
    }


    /**
     * Ce constructeur est utilisé pour créer un compte de type Compte Courant
     *
     * @param solde            représente le solde du compte
     * @param decouvert        représente le découvert autorisé
     */
    public CompteBancaire(double solde, double decouvert) {
        super();
        this.type = TypeCompte.CC;
        this.solde = solde;
        this.decouvert = Math.min(decouvert, 0.0);
        this.tauxRemuneration = 0.0;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant > decouvert) {
            this.solde = solde - montant;
        } else {
            System.out.println("Fonds insuffisants");
        }


    }

    public void appliquerRemuAnnuelle() {
        this.solde = solde + solde * tauxRemuneration / 100;
    }

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        if (this.type == TypeCompte.CC) {
            this.decouvert = Math.min(decouvert, 0.0);;
        }
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        if (this.type == TypeCompte.LA) {
            this.tauxRemuneration = Math.max(tauxRemuneration, 0.0);
        }
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public TypeCompte getType() {
        return type;
    }
}
