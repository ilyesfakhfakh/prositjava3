public class Ecole {

    String nom;
    Etudiant[] etudiants;
    int nbrEtudiants;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[500];
    }

    public int rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < nbrEtudiants; i++) {
            if (etudiants[i].equals(e))
                return i;
        }
        return -1;
    }

    public void ajouterEtudiant(Etudiant e) {
        if (rechercherEtudiant(e) == -1 && nbrEtudiants < 500) {
            etudiants[nbrEtudiants] = e;
            nbrEtudiants++;
        } else {
            System.out.println("L'étudiant est déjà inscrit ou L'ecole est pleine");
        }
    }

    public float getMoyenne3A(){
        int nbrEtudiants3A = 0;
        float sommeMoyenne = 0;
        for (int i = 0; i < nbrEtudiants; i++) {
            if(etudiants[i] instanceof Etudiant3eme){
                nbrEtudiants3A++;
                sommeMoyenne += etudiants[i].moyenne;
            }
        }
        return sommeMoyenne / nbrEtudiants3A;
    }

    public int moyenneSalaireAlternance(){
        int nbrEtudiantsAL = 0;
        int sommeSalaire = 0;
        for (int i = 0; i < nbrEtudiants; i++) {
            if(etudiants[i] instanceof EtudiantAlternance etudiantAlternance){
                nbrEtudiantsAL++;
                sommeSalaire += etudiantAlternance.salaire;
            }
        }
        return sommeSalaire / nbrEtudiantsAL;
    }
}
