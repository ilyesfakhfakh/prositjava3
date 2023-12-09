import java.util.ArrayList; // import the ArrayList clas
import java.util.*;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    ArrayList<Employe> employes;


    public SocieteArrayList() {
        this.employes = new ArrayList<Employe>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
       employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getPrenom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
      employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
        sortEmployeesById(employes);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        sortEmployeesByName(employes);


    }
    Comparator<Employe> comparatorID ;
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getId() - o2.getId();
    }

    public static void sortEmployeesById(List<Employe> employes) {
        // Create a custom comparator to compare employees based on their ID
        Comparator<Employe> idComparator = Comparator.comparingInt(Employe::getId);

        // Use Collections.sort to sort the list using the custom comparator
        Collections.sort(employes, idComparator);
    }
    public static void sortEmployeesByName(List<Employe> employes) {
        // Create a custom comparator to compare employees based on their ID
        Comparator<Employe> nameComparator = Comparator.comparing(Employe::getName);

        // Use Collections.sort to sort the list using the custom comparator
        Collections.sort(employes, nameComparator);
    }
}
