public class fraction extends Number {
    private int numerateur;   // Attribut représentant le numérateur
    private int denominateur; // Attribut représentant le dénominateur

    // Constructeur par défaut
    public fraction() {
        this.numerateur = 0; // Initialisation à 0
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

    // Méthode pour additionner deux fractions
    public fraction add(fraction other) {
        int newNumerateur = this.numerateur * other.denominateur + other.numerateur * this.denominateur;
        int newDenominateur = this.denominateur * other.denominateur;
        return new fraction(newNumerateur, newDenominateur);
    }

    // Redéfinition de la méthode equals pour comparer deux fractions
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        fraction other = (fraction) obj;
        return this.numerateur * other.denominateur == other.numerateur * this.denominateur;
    }

    // Méthode pour comparer les fractions
    @Override
    public int compareTo(fraction other) {
        double thisValue = this.doubleValue();
        double otherValue = other.doubleValue();
        return Double.compare(thisValue, otherValue);
    }

    // Méthodes abstraites de Number
    @Override
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public int intValue() {
        return numerateur / denominateur;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }
}
