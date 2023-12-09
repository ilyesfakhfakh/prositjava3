
class IntAndStringComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {

        int idComparison = Integer.compare(d1.getId(), d2.getId());

        if (idComparison == 0) {
            return d1.getName().compareTo(d2.getName());
        }

        return idComparison;
    }
}



