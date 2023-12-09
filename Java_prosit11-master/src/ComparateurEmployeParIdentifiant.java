public class ComparateurEmployeParIdentifiant implements Comparator<Employe> {
        @Override
        public int compare(Employe employe1, Employe employe2) {
            // Comparer les identifiants des employés
            return employe1.getId() - employe2.getId();
        }
    }

