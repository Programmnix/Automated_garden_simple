
# ePortfolio: Tinkerforge
## Programmierübung

# Einleitung

Die Präsentation finden Sie hier: [Präsentation](https://docs.google.com/presentation/d/1ga7UCL06HEAiya0m1iGdhdYJRIMx_e2CzU5-GaaTcLM/edit?usp=sharing)

Dieses Projekt zeigt, wie einfach es ist mit Tinkerforge-Modulen Hardware anzusteuern. Hier wird sich auf die [Java-API-Bindings](www.tinkerforge.com/de/doc/Software/API_Bindings_Java.html) von Tinkerforge bezogen, aber es ist genau so einfach andere unterstütze Programmiersprachen zu verwenden.

Ziel dieser Übung ist es ein Kräutergarten zu bewässern.

# Anforderungen

In den Anforderungen ist definiert, welche Hardware verwendet wird und was die Software können soll.

## Hardware Vorraussetzungen

1. [Master Brick](http://www.tinkerforge.com/de/doc/Hardware/Bricks/Master_Brick.html)
2. [Moisture Bricklet](http://www.tinkerforge.com/de/doc/Hardware/Bricklets/Moisture.html)
3. [Industrial Quad Relay Bricklet](http://www.tinkerforge.com/de/doc/Hardware/Bricklets/Industrial_Quad_Relay.html)

## Software Kriterien

1. Steuern der Pumpe
2. Auslesen des Feuchtigkeitswert
3. Schalten der Pumpe anhand des Feuchtigkeitswert
4. (Optional) Zeitgesteuertes Pumpen schalten

# Übung initialisieren

Nehmt euren lieblings Editor und cloned das Projekt mit dem Tag `init_project`

1. Projekt clonen via git


`git clone https://github.com/Programmnix/Automated_garden_simple.git`

2. Ins Verzeichniss wechseln

`cd Automated_garden_simple`

3. Den Tag auschecken als initiales Projekt

`git checkout -b initial_project_branch init_project`


# Kurze Beschreibung des Projekts

Package: de.dominik_klotz.dhbw.automated_garden

* Controller.java
  * Steuert anhand des Messwertes die Pumpe	
* Hygrometer.java
  * Soll die Feuchtigkeit messen und zurückgebe
* PumpeControl.java
   * Pumpe anschalten, ausschalten und einsehen
   

# Programmieren

Jetzt starten wir mit dem Programmieren!!! ;-)





