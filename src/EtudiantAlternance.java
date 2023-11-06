public class EtudiantAlternance extends Etudiant {

    int salaire;

    public EtudiantAlternance(int identifiant, String nom, String prenom,
                              float moyenne, int salaire) {
        super(identifiant, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
        salaire -= 50;
    }

    @Override
    public String toString() {
        return super.toString() + " ,salaire: " + salaire;
    }
}
