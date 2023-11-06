public class Etudiant3eme extends Etudiant{

    String branche;

    public Etudiant3eme(int identifiant, String nom, String prenom, float moyenne, String branche) {
        super(identifiant, nom, prenom, moyenne);
        this.branche = branche;
    }

    @Override
    public void ajouterUneAbsence() {
        moyenne -= 0.5f;
    }
}
