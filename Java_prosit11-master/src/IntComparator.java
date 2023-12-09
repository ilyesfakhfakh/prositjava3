
    class IntComparator implements Comparator<Departement> {
        @Override
        public int compare(Departement d1, Departement d2) {
            // Compare strings in reverse order
            return d1.getId() - d2.getId();
        }
    }
