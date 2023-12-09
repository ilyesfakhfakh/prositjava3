import java.util.*;

public class SocieteArrayList implements IGestion<employe>{
    List listEmp= new ArrayList<employe>();
    public void ajouterEmploye(employe e){
        listEmp.add(e);
    }
    public boolean rechercherEmploye(String nom){
        Iterator<employe> iterator = listEmp.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getNom().equals(nom))
                return true;
        }
        return false;
    }
    public boolean rechercherEmploye(employe e){
        Iterator<employe> iterator = listEmp.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(e))
                return true;
        }
        return false;
    }
    public void supprimerEmploye(employe e){
        if(rechercherEmploye(e))
            listEmp.remove(e);
    }
    public void displayEmploye(){
        for(int i=0;i<listEmp.size();i++){
            System.out.println(listEmp.get(i));
        }
    }
    public void trierEmployeParId(){
        Collections.sort(listEmp);
    }
    public void trierEmployeParNomDépartementEtGrade(){
        Comparator<employe>  c= new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                if(e1.getNomDep().equals(e2.getNomDep())){
                    return e1.getGrade()-e2.getGrade();
                }
                return e1.getNomDep().compareTo(e2.getNomDep());
            }
        };
    }
}
