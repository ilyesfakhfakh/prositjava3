

public class Main {
    public static void main(String[] args) {
        Departement d1 = new Departement(1, "IT", 10);
        Departement d2 = new Departement(3, "dev", 14);
        Departement d3 = new Departement(2, "res", 58);
        Departement d4 = new Departement(4, "C", 26);
        Departement d5 = new Departement(10, "D", 26);
        Departement d6 = new Departement(20, "C", 26);
        Departement d10 = new Departement(1, "n", 10);

        Employe e1 = new Employe(1,"nakhla","najib","",10);
        Employe e2 = new Employe(2,"ahmed","ahmed","",10);
        Employe e3 = new Employe(3,"adem","adem","",10);
        Employe e6 = new Employe(7,"zied","adem","",10);




        /*  DepartementHashSet depManager = new DepartementHashSet();

        depManager.departements.add(d1);
        depManager.departements.add(d2);
        depManager.departements.add(d3);
        depManager.departements.add(d4);
        depManager.departements.add(d6);

        System.out.println("Recherche ");
        System.out.println(depManager.rechercherDepartement("m"));
        System.out.println(depManager.rechercherDepartement(d5));
        System.out.println("display");
        depManager.displayDepartement();
        System.out.println("***********");
        depManager.supprimerDepartement(d6);
        depManager.displayDepartement();
        System.out.println("tree");
        depManager.trierDepartementById();

 */

  /*      DepartementTreeSet depManager = new DepartementTreeSet();

        depManager.treeSet.add(d1);
        depManager.treeSet.add(d2);
        depManager.treeSet.add(d3);
        depManager.treeSet.add(d4);
        depManager.treeSet.add(d6);



        System.out.println("Recherche ");
        System.out.println(depManager.rechercherDepartement("m"));
        System.out.println(depManager.rechercherDepartement(d5));
        System.out.println("display");
        depManager.displayDepartement();
        System.out.println("***********");
        depManager.supprimerDepartement(d6);
        depManager.displayDepartement();
        System.out.println("tree");
        depManager.treeSet.add( d10);
        depManager.trierDepartementByIdetNom();


   */

         AffectationHashMap ah = new AffectationHashMap();
         ah.ajouterEmployeDepartement(e3,d2);
         ah.ajouterEmployeDepartement(e1,d3);
         ah.ajouterEmployeDepartement(e2,d2);
         ah.afficherAffectations();
         ah.afficherEmployes();
         ah.afficherDepartements();
         //ah.supprimerEmploye(e1);
         //ah.afficherAffectations();

        System.out.println(ah.rechercherEmploye(e1));
        System.out.println(ah.rechercherEmploye(e6));
        System.out.println(ah.rechercherDepartement(d2));
        System.out.println( ah.rechercherDepartement(d4));
        System.out.println("instruction finale de treeMap");
        System.out.println(ah.trierMap());



    }


    }

