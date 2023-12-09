import java.util.*;

public class AffectationHashMap {


     Map<Employe, Departement> affectations= new HashMap<>();;


    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (!affectations.containsKey(employe)) {
            affectations.put(employe, departement);
            System.out.println("Affectation réussie : " );
        } else {
            System.out.println("Erreur ");
        }
    }



    public void afficherAffectations() {
        System.out.println("Affectations actuelles :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + ", Département : " + entry.getValue());
        }
    }

    public Map<Employe, Departement> getAffectations() {
        return affectations;
    }

    public void setAffectations(Map<Employe, Departement> affectations) {
        this.affectations = affectations;
    }

    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
            affectations.remove(employe);
            System.out.println("Suppression réussie ");
        } else {
            System.out.println("Erreur");
        }
    }
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    public void afficherEmployes() {
        Set<Employe> employeSet = affectations.keySet() ;
        System.out.println("les employes sont : "+employeSet);
    }

    public void afficherDepartements() {
        Collection<Departement> departementCollection = affectations.values();
        System.out.println("les departements sont : "+departementCollection);

    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMapTriee = new TreeMap<>(new ComparateurEmployeParIdentifiant());
        treeMapTriee.putAll(affectations);
        return treeMapTriee;
    }

}


