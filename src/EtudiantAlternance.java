<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skand
 */
public class EtudiantAlternance extends Etudiant {

    private int salaire;

    public EtudiantAlternance(int id, String nom, String prenom, float moyenne, int salaire) {
        super(id, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
=======
public class EtudiantAlternance extends Etudiant {

    int salaire;

    public EtudiantAlternance(int identifiant, String nom, String prenom,
                              float moyenne, int salaire) {
        super(identifiant, nom, prenom, moyenne);
>>>>>>> 54a8d03d73c38d3c62f56fe04ca00f55722b8da0
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
<<<<<<< HEAD
        this.salaire -= 50;
    }

    public String toString() {
        return super.toString() + " Salaire= " + salaire;
    }

=======
        salaire -= 50;
    }

    @Override
    public String toString() {
        return super.toString() + " ,salaire: " + salaire;
    }
>>>>>>> 54a8d03d73c38d3c62f56fe04ca00f55722b8da0
}
