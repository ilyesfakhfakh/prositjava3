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
        this.branche = branche;
    }

    @Override
    public void ajouterUneAbsence() {
        this.moyenne -= 0.5f;
    }

}
