

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Skand
 */
public class Ecole {

    private String nom;
    private Etudiant[] etudiants;
    private int nbr_etudiants;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[500];
    }

    public int rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < nbr_etudiants; i++) {
            if (etudiants[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public void ajouterEtudiant(Etudiant e) throws EtudiantExisteException {
        if (rechercherEtudiant(e) == -1) {
            etudiants[nbr_etudiants] = e;
            nbr_etudiants++;
        } else {
            throw new EtudiantExisteException("Cet étudiant existe déjà");
        }
    }

    public float getMoyenne3A() {
        float moy_3A = 0;
        int nbr_etudiants_3A = 0;
        for (int i = 0; i < nbr_etudiants; i++) {
            if (etudiants[i] instanceof Etudiant3eme) {
                moy_3A += etudiants[i].moyenne;
                nbr_etudiants_3A++;
            }
        }
        return moy_3A / nbr_etudiants_3A;
    }

    public int moyenneSalaireAlternants() {
        int moy_salaire = 0;
        int nbr_etudiants_alt = 0;
        for (int i = 0; i < nbr_etudiants; i++) {
            if (etudiants[i] instanceof EtudiantAlternance) {
                EtudiantAlternance e = (EtudiantAlternance) etudiants[i];
                moy_salaire += e.getSalaire();
                nbr_etudiants_alt++;
            }
        }
        return moy_salaire / nbr_etudiants_alt;
    }

    public String toString() {
        String s = "Nom: " + nom + " - Etudiants: \n";
        for (int i = 0; i < nbr_etudiants; i++) {
            s += etudiants[i].toString();
            s += "\n";
        }
        return s;
    }

    public void changerEcole(Etudiant etd, Ecole e) {
        int position = rechercherEtudiant(etd);
        if (position != -1) {
            try {
                e.ajouterEtudiant(etd);
            } catch (EtudiantExisteException ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = position; i < nbr_etudiants; i++) {
                etudiants[i] = etudiants[i + 1];
                etudiants[nbr_etudiants] = null;
                nbr_etudiants--;
            }
        } else {
            System.out.println("Cet étudiant n'éxiste pas");
        }
    }
}
