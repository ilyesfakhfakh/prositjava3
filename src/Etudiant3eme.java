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
public class Etudiant3eme extends Etudiant {

    private String branche;

    public Etudiant3eme(int id, String nom, String prenom, float moyenne, String branche) {
        super(id, nom, prenom, moyenne);
        this.branche = branche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
=======
public class Etudiant3eme extends Etudiant{

    String branche;

    public Etudiant3eme(int identifiant, String nom, String prenom, float moyenne, String branche) {
        super(identifiant, nom, prenom, moyenne);
>>>>>>> 54a8d03d73c38d3c62f56fe04ca00f55722b8da0
        this.branche = branche;
    }

    @Override
    public void ajouterUneAbsence() {
<<<<<<< HEAD
        this.moyenne -= 0.5f;
    }

=======
        moyenne -= 0.5f;
    }
>>>>>>> 54a8d03d73c38d3c62f56fe04ca00f55722b8da0
}
