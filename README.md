
# ePortfolio: Tinkerforge
## Programmierübung

# Einleitung

Die Präsentation finden Sie hier: [Präsentation](https://docs.google.com/presentation/d/1ga7UCL06HEAiya0m1iGdhdYJRIMx_e2CzU5-GaaTcLM/edit?usp=sharing)

Dieses Projekt zeigt, wie einfach es ist, mit Tinkerforge-Modulen Hardware anzusteuern. Hier wird sich auf die [Java-API-Bindings](www.tinkerforge.com/de/doc/Software/API_Bindings_Java.html) von Tinkerforge bezogen, aber es ist genau so einfach andere unterstützte Programmiersprachen zu verwenden.

Ziel dieser Übung ist es, einen Kräutergarten zu bewässern.

# Anforderungen an den Kräutergarten

In den Anforderungen ist definiert, welche Hardware verwendet wird und was die Software können soll.

## Hardware Vorraussetzungen

1. [Master Brick](http://www.tinkerforge.com/de/doc/Hardware/Bricks/Master_Brick.html)
2. [Moisture Bricklet](http://www.tinkerforge.com/de/doc/Hardware/Bricklets/Moisture.html)
3. [Industrial Quad Relay Bricklet](http://www.tinkerforge.com/de/doc/Hardware/Bricklets/Industrial_Quad_Relay.html)

## Software Kriterien

1. Steuern der Pumpe
2. Auslesen des Feuchtigkeitswertes
3. Schalten der Pumpe anhand des Feuchtigkeitswertes
4. (Optional) Zeitgesteuertes Pumpen schalten


# Programmierübung

Dieses Projekt enthält den fertigen Quelltext der Programmierübung. Der Ausganspunkt der Programmierübung ist mit dem Tag "init_project" versehen, welcher auch als neuer Branch ausgecheckt wird.


## Vorraussetzungen

* Java-IDE
* Java-Runtime

## Übung initialisieren

Nehmt euren Lieblingseditor und cloned das Projekt mit dem Tag `init_project`

1. Projekt clonen via git


`git clone https://github.com/Programmnix/Automated_garden_simple.git`

2. Ins Verzeichnis wechseln

`cd Automated_garden_simple`

3. Den Tag als initiales Projekt auschecken

`git checkout -b initial_project_branch init_project`

4. Ordner in Java-IDE einbiden

5. Fügt die "lib/Tinkerforge.jar" zu dem Build-Path hinzu.


**ODER**

[Source.zip hier](https://github.com/Programmnix/Automated_garden_simple/archive/init_project.zip)


## Init-Projekt Übersicht

Package: de.dominik_klotz.dhbw.automated_garden

* Controller.java
  * Steuert anhand des Messwertes die Pumpe	
* Hygrometer.java
  * Soll die Feuchtigkeit messen und via Interface zurückgeben
* PumpeControl.java
  * Pumpe anschalten, ausschalten und einsehen
* MainClass.java
  * Ruft den Controller auf 
 

# Programmieren

Jetzt starten wir mit dem Programmieren!!! ;-)





