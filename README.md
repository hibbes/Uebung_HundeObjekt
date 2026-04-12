# Uebung_HundeObjekt

Einführung in die **Objektorientierte Programmierung (OOP)** anhand einer Hundeklassen-Hierarchie. Didaktisch gestaltetes Minimalbeispiel, um die zentralen OOP-Konzepte auf möglichst kleinem Raum zu zeigen.

## Klassen

| Klasse | Beschreibung |
|--------|--------------|
| `Hund` | Basisklasse mit Attributen (Name, Alter, Lautstärke) und Konstruktor-Verkettung |
| `Schaeferhund` | Erbt von `Hund`, überschreibt `getLautstaerkeDB()` (Schäferhunde bellen 1,5× lauter) |
| `Main` | Testklasse, demonstriert Objekterzeugung, Getter und Polymorphismus |

## OOP-Konzepte im Überblick

### Klasse vs. Objekt
```java
// Klasse = Bauplan (nur einmal definiert)
public class Hund { ... }

// Objekte = konkrete Instanzen (beliebig viele)
Hund h1 = new Hund("Thorsten", 7, 31.4);
Hund h2 = new Hund("Bello", 3, 28.0);
```

### Vererbung
```java
public class Schaeferhund extends Hund {   // erbt alles von Hund
    @Override
    public double getLautstaerkeDB() {
        return 1.5 * super.getLautstaerkeDB();  // nutzt Methode der Basisklasse
    }
}
```

### Polymorphismus
```java
Hund h = new Schaeferhund("Rex", 4, 20.0);  // Hund-Variable, aber Schäferhund-Objekt
h.getLautstaerkeDB();                        // ruft die Schaeferhund-Methode auf!
```

Der entscheidende Punkt: zur **Laufzeit** wird anhand des tatsächlichen Objekttyps entschieden, welche Methode ausgeführt wird – nicht anhand des deklarierten Variablentyps.

## Lernziele

- Attribute, Konstruktoren, Getter/Setter
- `extends` und `super(...)`-Aufruf
- `@Override` und dynamisches Binden (Polymorphismus)
- Sichtbarkeitsstufen (`private` / `public`)

## Projektstruktur

```
Uebung_HundeObjekt/
└── Hund/                     ← Eclipse-Projekt
    ├── README.md
    └── src/
        ├── Hund.java
        ├── Schaeferhund.java
        └── Main.java
```

## Kontext

Unterrichtsmaterial Informatik, OOP-Einführung (Schiller-Gymnasium Offenburg).
