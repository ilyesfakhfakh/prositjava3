import java.util.Objects;

public class Employe {
    private int id ;
    private String name ;
    private String prenom;
    private String name_dep;

    private int grade ;


    public Employe() {}

    public Employe(int id, String name, String prenom, String name_dep, int grade) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.name_dep = name_dep;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getName_dep() {
        return name_dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setName_dep(String name_dep) {
        this.name_dep = name_dep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prenom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", name_dep='" + name_dep + '\'' +
                ", grade=" + grade +
                '}';
    }



}
