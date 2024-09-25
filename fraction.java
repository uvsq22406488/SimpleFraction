public class Fraction {
    private int numerateur;   // Attribut représentant le numérateur
    private int denominateur; // Attribut représentant le dénominateur

    // Constructeur par défaut
    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1; // On initialise à 1 pour éviter la division par zéro
    }

    // Constructeur avec paramètres
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Je suis une fraction : " + numerateur + "/" + denominateur;
    }

    // Méthode pour obtenir le numérateur
    public int getNumerateur() {
        return numerateur;
    }

    // Méthode pour obtenir le dénominateur
    public int getDenominateur() {
        return denominateur;
    }

    // Autres méthodes à ajouter plus tard (addition, soustraction, etc.)
}
