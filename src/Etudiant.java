public abstract class Etudiant {
    int identifiant;
    String nom, prenom;
    float moyenne;

    Etudiant() {
    }

    public Etudiant(int identifiant, String nom, String prenom, float moyenne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
//        if(o.getClass() == Etudiant.class){
        if (o instanceof Etudiant e) {
            return e.nom.equals(this.nom) && this.identifiant == e.identifiant;
        }
        return false;
    }


    public abstract void ajouterUneAbsence();

    @Override
    public String toString() {
        return "L'étudiant N° " + identifiant + " ,nom: " + nom
                + " ,prenom " + prenom + " ,moyenne: " + moyenne;
    }
}
