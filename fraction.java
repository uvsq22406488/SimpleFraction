public class fraction {
    private int numerateur;   // Attribut représentant le numérateur
    private int denominateur; // Attribut représentant le dénominateur

    // Constructeur par défaut
    public fraction() {
        this.numerateur = 0;
        this.denominateur = 1; // On initialise à 1 pour éviter la division par zéro
    }

    // Constructeur avec paramètres (numérateur et dénominateur)
    public fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // Constructeur avec juste le numérateur (dénominateur égal à 1)
    public fraction(int numerateur) {
        this(numerateur, 1); // Appelle le constructeur avec deux paramètres
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Je suis une fraction : " + numerateur + "/" + denominateur;
    }

    // Déclaration des constantes
    public static final fraction ZERO = new fraction(0, 1); // Fraction représentant 0
    public static final fraction UN = new fraction(1, 1);   // Fraction représentant 1

    // Méthode pour obtenir le numérateur
    public int getNumerateur() {
        return numerateur;
    }

    // Méthode pour obtenir le dénominateur
    public int getDenominateur() {
        return denominateur;
    }

    // Méthode pour obtenir la valeur sous forme d'un nombre à virgule flottante
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    // Autres méthodes à ajouter plus tard (addition, soustraction, etc.)
}
