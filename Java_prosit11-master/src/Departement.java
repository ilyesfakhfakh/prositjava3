import java.util.Objects;

public class Departement {
    private int id;
    private String name;
    private int nbremployes;

    public Departement(int id, String name, int nbremployes) {
        this.id = id;
        this.name = name;
        this.nbremployes = nbremployes;
    }
    public Departement() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbremployes() {
        return nbremployes;
    }

    public void setNbremployes(int nbremployes) {
        this.nbremployes = nbremployes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nbremployes == that.nbremployes && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nbremployes);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nbremployes=" + nbremployes +
                '}';
    }



}
