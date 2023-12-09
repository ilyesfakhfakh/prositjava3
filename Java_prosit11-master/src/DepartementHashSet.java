import java.util.*;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {
Set<Departement> departements =new HashSet<Departement>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = departements.iterator();
        while (it.hasNext()) {
            if(it.next().getName().equals(nom))
                return true;

        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        Iterator<Departement> it = departements.iterator();
        while (it.hasNext()) {
            if(it.next().equals(departement))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
       departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = departements.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
}

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> treeSet = new TreeSet<>((Comparator) new IntComparator());

        // Add elements from the HashSet to the TreeSet
        treeSet.addAll(departements);
        System.out.println(treeSet);
        return treeSet;
    }
}
