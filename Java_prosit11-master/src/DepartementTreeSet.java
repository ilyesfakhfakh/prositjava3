import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementTreeSet implements IDepartement<Departement> {
    TreeSet<Departement> treeSet = new TreeSet<>((Comparator) new IntAndStringComparator());

    @Override
    public void ajouterDepartement(Departement o) {
        treeSet.add(o);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = treeSet.iterator();
        while (it.hasNext()) {
            if(it.next().getName().equals(nom))
                return true;

        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement o) {
        Iterator<Departement> it = treeSet.iterator();
        while (it.hasNext()) {
            if(it.next().equals(treeSet))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement o) {
        treeSet.remove(o);

    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Override
    public TreeSet trierDepartementById() {
        return null;
    }

    public void trierDepartementByIdetNom() {
        TreeSet<Departement> tritreeSet = new TreeSet<>((Comparator) new IntAndStringComparator());

        // Add elements from the HashSet to the TreeSet
        tritreeSet.addAll(treeSet);
        treeSet =tritreeSet;


        System.out.println(treeSet);
    }

}
