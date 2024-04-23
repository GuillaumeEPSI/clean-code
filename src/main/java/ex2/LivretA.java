package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(double solde, double tauxRemuneration) {
        super(TypeCompte.LA, solde, 0, Math.max(tauxRemuneration, 0.0));
    }

}
