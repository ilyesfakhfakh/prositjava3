import java.util.Scanner;
public class employe implements Comparable<employe> {
    int id;
    String nom, prenom;
    String nomDep;
    int grade;

    public employe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("id: ");
        this.id= scanner.nextInt();
        System.out.println("nom: ");
        this.nom= scanner.nextLine();
        System.out.println("prenom: ");
        this.prenom=scanner.nextLine();
        System.out.println("nom departement: ");
        this.nomDep= scanner.nextLine();
        System.out.println("grade: ");
        this.grade= scanner.nextInt();
    }

    public employe(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public boolean equals(employe e) {
        return (this.id == e.id)&&(this.nom.equals(e.nom));
    }

    @Override
    public String toString() {
        return "id: "+id+"nom: "+nom+"nom departement: "+nomDep+"grade: "+grade;
    }

    @Override
    public int compareTo(employe e) {
        return this.id - e.id;
    }
}
