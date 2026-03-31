/**
 * Spezialisierte Unterklasse von {@link Hund}: ein Schäferhund.
 *
 * <p>Diese Klasse demonstriert das OOP-Prinzip der <b>Vererbung</b>:</p>
 * <ul>
 *   <li>{@code Schaeferhund extends Hund} bedeutet: Schaeferhund <em>erbt</em>
 *       alle Attribute und Methoden von Hund.</li>
 *   <li>{@code super(...)} im Konstruktor ruft den Konstruktor der Elternklasse auf
 *       – das ist Pflicht, wenn die Elternklasse keinen parameterlosen Konstruktor hat.</li>
 *   <li>{@code @Override getLautstaerkeDB()} überschreibt die geerbte Methode:
 *       Ein Schäferhund bellt 1,5× lauter als der Basiswert.</li>
 * </ul>
 *
 * <p><b>Warum Vererbung?</b><br>
 * Man muss nicht von Grund auf neu schreiben, was bereits in {@link Hund} existiert.
 * Schaeferhund hat automatisch {@code name}, {@code alter}, {@code rasse} etc.,
 * ohne dass man diese Zeilen wiederholen muss.</p>
 *
 * @author hibbes
 * @see Hund
 */
public class Schaeferhund extends Hund {

    /**
     * Erstellt einen Schäferhund und setzt automatisch die Rasse.
     *
     * <p>{@code super(name, alter, lautstaerkeDB)} delegiert die Initialisierung
     * der geerbten Attribute an den Elternklassen-Konstruktor.</p>
     *
     * @param name          Rufname
     * @param alter         Alter in Jahren
     * @param lautstaerkeDB Basis-Bellvolumen in dB (wird intern mit 1,5 multipliziert)
     */
    public Schaeferhund(String name, int alter, double lautstaerkeDB) {
        super(name, alter, lautstaerkeDB);  // Elternklassen-Konstruktor aufrufen
        this.rasse = "Schaeferhund";        // Rasse direkt setzen (package-private in Hund)
    }

    /**
     * Überschreibt die Methode der Elternklasse: Schäferhunde bellen 1,5× lauter.
     *
     * <p>{@code @Override} ist keine Pflicht, aber gute Praxis: Die Annotation
     * stellt sicher, dass tatsächlich eine Methode der Elternklasse überschrieben
     * wird – sonst gibt es einen Compile-Fehler.</p>
     *
     * <p>{@code super.getLautstaerkeDB()} ruft die Originalimplementierung in
     * {@link Hund} auf – so muss der Basiswert nicht erneut gespeichert werden.</p>
     *
     * @return Bellvolumen des Schäferhunds (1,5 × Basiswert)
     */
    @Override
    public double getLautstaerkeDB() {
        return 1.5 * super.getLautstaerkeDB();
    }
}
