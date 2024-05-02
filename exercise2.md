
# **EXERCISE 2**    

## **Inhalt**
Einstieg in die Verwendung von GitHub und den wichtigsten Befehlen in diesem Zusammenhang.

## **Begriffserklärung (git)**
1. Beschreibung inklusive Funktionsweise
2. übergebbare Parameter
3. betroffene Daten
4. Änderungsort 

- ### git config 
1. Konfiguriert Git-Einstellungen, zum Beispiel Benutzername oder 
      E-Mail Adresse.
2. verschiedene:  
    
    | --global | --local |
    |----------|---------|
    |globale Konfiguration | lokale Konfiguration 

3. Meta-Informationen von Benutzer, Repository
4. Lokale Konfiguration in Repository-Verzeichnis gespeichert
Globale Konfiguration in Home-Verzeichnis gespeichert 

- ### git init 	
1. Initialisiert neues Git-Repository in vorhandenem Verzeichnis bzw. 
      erstellt neues Verzeichnis dafür.
2. Keine
3. Verzeichnis
4. Arbeitsverzeichnis


- ### git commit 
1. Speichert alle Änderungen in Arbeitsverzeichnis in Repository.
2. -m --> für Commit Nachricht
3. geänderten Dateien und Commit-Historie
4. Repository

- ### git status 
1. Zeigt Status geänderter, hinzugefügter Dateien im Arbeitsverzeichnis.
2. Keine
3. Arbeitsverzeichnis und Index
4. Keine, nur Anzeigen vom Status

- ### git add 
1. fügt geänderte Dateien dem Index hinzu, damit sie für den 
     nächsten Commit bereit sind.
2. Dateinamen oder Verzeichnisse
3. Index
4. Staging-Bereich

- ### git log 
1. zeigt die Commit-Historie vom Repository an.
2. verschiedene, zum Filtern und Formatieren
3. Commit-Historie
4. keine, nur Anzeigen von Historie



- ### git diff 
1. Zeigt Unterschiede zwischen Arbeitskopien und dem Index bzw. 
      zwischen Commits an.
2. verschiedene, für spezifische Ansichten
3. Unterschiede zwischen Dateiversionen
4. lokales Arbeitsverzeichnis

- ### git pull 
1. Holt Änderungen aus einem Repository und bringt sie auf neuesten 
      Stand.
2. keine
3. lokale Kopie vom Repository
4. lokales Arbeitsverzeichnis

- ### git push 
1. Überträgt lokale Commits (Änderungen) auf ein entfremdetes 
      Repository bzw. Speicherort (z.B. GitHub), um mit anderen zu teilen.
2. Remote-Repository und Branch-Name
3. Änderungen im Remote-Repository
4. Remote-Repository (z.B. GitHub) 



 ## **Notieren Sie sich, wann welcher Befehl aufgerufen wird,**
- **ob er mehrmals ausgeführt wird, und**
- **in welcher Reihenfolge (nummeriert) die Befehle ausgeführt werden.**

1. git konfig: mehrmals, für Name und E-Mail, main statt master, …
2. git init: einmalig, Erstellen von neuem Repository
3. git add: mehrmals, Zum Hinzufügen von Dateien
4. git commit: einmalig, für ersten Commit 
5. git status: mehrmals, zum Abrufen der Änderungen
6. git commit: mehrmals, zum Updaten bzw. Hinzufügen neuer Datei
7. git log: einmalig, zum Abrufen der Commit History


## **Führen Sie git status erneut aus. Was fällt Ihnen dazu auf?**
Die beiden Dateien 	
"exercise1.html" "exexercise1.pdf" werden nun nicht mehr angezeigt.
