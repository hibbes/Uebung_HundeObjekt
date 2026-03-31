/**
 * Testklasse für die Hund-Klassenhierarchie.
 *
 * <p>Demonstriert die Erstellung von Objekten, den Aufruf von Methoden
 * und den Effekt von Methodenüberschreibung (Polymorphismus).</p>
 *
 * @author hibbes
 * @see Hund
 * @see Schaeferhund
 */
public class Main {

    /**
     * Erstellt Hund- und Schaeferhund-Objekte und gibt ihre Eigenschaften aus.
     *
     * @param args Kommandozeilenargumente (nicht verwendet)
     */
    public static void main(String[] args) {

        // ── Einfaches Hund-Objekt ────────────────────────────────────────────
        // new Hund("Thorsten", 7, 31.4) ruft den vollständigen Konstruktor auf.
        Hund h1 = new Hund("Thorsten", 7, 31.4);
        System.out.println("Lautstärke von " + h1.name + ": " + h1.getLautstaerkeDB() + " dB");

        // ── Schaeferhund-Objekt ──────────────────────────────────────────────
        // Schaeferhund erbt alles von Hund, überschreibt aber getLautstaerkeDB().
        // Ergebnis: 22.6 * 1.5 = 33.9 dB (statt 22.6 dB beim normalen Hund)
        Schaeferhund s1 = new Schaeferhund("Blutbert", 6, 22.6);
        System.out.println("Rasse von " + s1.name + ": " + s1.rasse);
        System.out.println("Lautstärke von " + s1.name + ": " + s1.getLautstaerkeDB()
            + " dB (1.5× Basis " + s1.getLautstaerkeDB()/1.5 + " dB)");

        // ── Polymorphismus demonstrieren ─────────────────────────────────────
        // Eine Hund-Variable kann auch einen Schaeferhund halten.
        // getLautstaerkeDB() ruft dann trotzdem die überschriebene Version auf!
        Hund polyHund = new Schaeferhund("Poly", 3, 20.0);
        System.out.println("Polymorphismus: polyHund ist Hund-Variable, aber ruft "
            + "Schaeferhund-Methode auf: " + polyHund.getLautstaerkeDB() + " dB");
    }
}
