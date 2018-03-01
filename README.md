# ShapeCreator
L’approfondimento tratta della collaborazione tra i pattern Observer, Abstract Factory e Strategy.
![Screenshot](https://i.imgur.com/E2gxcKz.png)

## INTENTO
Presentare un’interfaccia per la creazione di famiglie di prodotti, in modo tale che il Client che le utilizza non abbia conoscenza delle loro classi concrete, ed essere in grado di cambiare famiglia in maniera dinamica.
## SCENARIO D’ESEMPIO
Un Client vuole mettere in vita diversi prodotti di tipo Shape (Circle e Square) che abbiano tutti lo stesso colore (rosso, verde oppure blu). La scelta del colore da usare è delegata ad una classe, ColorChooser, che è indipendente da qualsiasi altra responsabilità.
