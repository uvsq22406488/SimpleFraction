public class main {
    public static void main(String[] args) {
        // Crée une instance de Fraction
        fraction fraction = new fraction();
        System.out.println(fraction.toString());  // Cela affichera "Je suis une fraction : 0/1"

        // Tests pour vérifier le bon fonctionnement des méthodes
        fraction f1 = new fraction(1, 2);
        fraction f2 = new fraction(1, 3);
        fraction result = f1.add(f2);
        System.out.println(result.toString()); // Affiche "Je suis une fraction : 5/6"

        // Vérification de l'égalité
        fraction f3 = new fraction(2, 4); // Équivaut à 1/2
        System.out.println(f1.equals(f3)); // Devrait afficher "true"

        // Comparaison
        System.out.println(f1.compareTo(f2)); // Devrait afficher un nombre positif (1/2 > 1/3)
    }
}
