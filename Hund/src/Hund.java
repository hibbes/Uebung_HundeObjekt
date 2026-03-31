/**
 * Klasse zur Modellierung eines Hundes als Objekt.
 *
 * <p>Diese Klasse veranschaulicht grundlegende Konzepte der <b>objektorientierten
 * Programmierung (OOP)</b>:</p>
 * <ul>
 *   <li><b>Klasse</b>: Beschreibung / Bauplan (hier: wie sieht "ein Hund" aus?)</li>
 *   <li><b>Objekt</b> (Instanz): ein konkreter Hund (z. B. "Thorsten")</li>
 *   <li><b>Attribute</b>: Eigenschaften des Objekts (Name, Alter, Lautstärke)</li>
 *   <li><b>Konstruktoren</b>: spezielle Methoden zum Erstellen von Objekten</li>
 *   <li><b>Getter</b>: kontrollierter Zugriff auf private Attribute</li>
 *   <li><b>Konstruktor-Verkettung</b> ({@code this(...)}: Code-Wiederholung vermeiden</li>
 * </ul>
 *
 * <p>Die Klasse {@link Schaeferhund} erweitert {@code Hund} durch Vererbung
 * und zeigt, wie spezialisierte Klassen allgemeine Klassen überschreiben können.</p>
 *
 * @author hibbes
 * @see Schaeferhund
 * @see Main
 */
public class Hund {

    // ── Attribute (Instanzvariablen) ──────────────────────────────────────────
    // Jedes Hund-Objekt besitzt eigene Kopien dieser Variablen.
    // Sie sind package-private (kein Zugriffsmodifizierer) – das bedeutet:
    // innerhalb desselben Pakets direkt zugreifbar.

    /** Rassezugehörigkeit des Hundes (z. B. "Schäferhund"). */
    String rasse;

    /** Rufname des Hundes. */
    String name;

    /** Alter des Hundes in Jahren. */
    int alter;

    /**
     * Lautstärke des Bellens in Dezibel (dB).
     * Zum Vergleich: Normales Gespräch ≈ 60 dB, Presslufthammer ≈ 100 dB.
     */
    double lautstaerkeDB;

    // ── Konstruktoren ─────────────────────────────────────────────────────────

    /**
     * Vollständiger Konstruktor – erstellt einen Hund mit allen Eigenschaften.
     *
     * <p>Das Schlüsselwort {@code this} unterscheidet hier zwischen den
     * <em>Parametern</em> (linke Seite) und den <em>Attributen</em> des Objekts
     * (rechte Seite):</p>
     * <pre>
     *   this.name = name;   // Attribut "name" bekommt den Wert des Parameters "name"
     * </pre>
     *
     * @param name          Rufname des Hundes
     * @param alter         Alter in Jahren
     * @param lautstaerkeDB Lautstärke des Bellens in Dezibel
     */
    public Hund(String name, int alter, double lautstaerkeDB) {
        this.name         = name;
        this.alter        = alter;
        this.lautstaerkeDB = lautstaerkeDB;
    }

    /**
     * Vereinfachter Konstruktor – nur Name, Rest wird auf Standardwerte gesetzt.
     *
     * <p>Konstruktor-Verkettung mit {@code this(...)}: Ruft den vollständigen
     * Konstruktor auf und spart duplizierten Code.</p>
     *
     * @param name Rufname des Hundes
     */
    public Hund(String name) {
        this(name, 10, 5);   // delegiert an Hund(String, int, double)
    }

    /**
     * Standard-Konstruktor – erstellt einen Hund mit Standardwerten.
     * Nützlich, wenn noch kein konkreter Hund bekannt ist.
     */
    public Hund() {
        this("Hundi");       // delegiert an Hund(String)
    }

    // ── Getter ────────────────────────────────────────────────────────────────

    /**
     * Gibt die Lautstärke des Bellens zurück.
     *
     * <p>Durch einen <b>Getter</b> wird das Attribut kontrolliert nach außen
     * zugänglich gemacht. Würde {@code lautstaerkeDB} {@code private} sein,
     * könnte man es nur über diesen Getter lesen – und bei Bedarf z. B. eine
     * Validierung einbauen.</p>
     *
     * @return Bellvolumen in Dezibel
     */
    public double getLautstaerkeDB() {
        return lautstaerkeDB;
    }
}
