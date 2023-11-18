# Una solución propuesta

Esta solución se apoya en los objetos List y Node revisados en sesiones previas. Es importante comprender su funcionamiento

## Paso 000

Se prepara el espacio de trabajo, se incluyen las clases List y Node

## Paso 001

- Clase contenedora: **Mundo**
- Esta clase contendrá la ludoteca, y se encargará de gobernar los elementos de más alto nivel de toda las simulación. Para empezar, el tiempo que dura toda la simulación.
- En esta clase estará el main() que arranca todo. Aquí se crea la ludoteca, se especifica el tiempo de simulación y se crea el Mundo pasándole estos parámetros mediante el constructor.

## Paso 002

- Procedemos, a partir de lo definido en la clase Mundo, a definir la clase **Ludoteca**.
- Como se indica en las instrucciones del juego, esta ludoteca contendrá a las dos monitoras (Lydia y Aisha) y una pizarra. Esto implica que existirán dos clases nuevas: Monitor y Pizarra, las cuales son declaradas en la clase e inicializadas en el constructor de la misma.
- A efectos de identificación individual de cada monitora, al momento de crear el objeto le pasamos su nombre (que el objeto será responsable de almacenar).

## Paso 003

- Vamos con una clase que a priori es "sencilla" y casi que podríamos dejarla toda lista: la clase **Pizarra**.
- A partir del enunciado, podemos inferir que las responsabilidades de esta clase son permitir que otros objetos puedan escribir un mensaje, puedan leerlo y pueden limpiar la pizarra (borrando el mensaje).

## Paso 004

- Terminada la definición de la clase **Pizarra**, volvemos a la clase **Ludoteca** y vemos que nos queda pendiente la definición de la clase **Monitor**, una clase clave para el juego, por lo que la iremos definiendo y desarrollando cuidadosamente.
- Para empezar, atendemos a lo que nos precisa el constructor que hemos invocado en Ludoteca: al momento de crear la clase Monitor, esta debe almacenar su nombre.
- Asimismo, por definición del problema, cada Monitor gestiona su cola de niños.

## Paso 005

Antes de continuar con la clase **Monitor**, construiremos la clase **Cola**, habida cuenta que está a medio camino entre las clases **Mundo**, **Ludoteca**, **Monitor** por un lado (clases que hemos de personalizar y definir cuidadosamente) y la clase **List** y **Node** (clases muy genéricas). Diríamos que es como la clase **Pizarra**: podemos inferir con alto grado de precisión qué responsabilidades va a asumir y qué cosas le vamos a pedir. Esto es:

|||
|-|-|
Tendrá una lista de niños, que empezará vacía.|
Deberíamos poder pasarle un niño para que lo agrege a la cola.|public void addNiño(Niño niño)
Deberíamos poder pedirle un niño.|public Niño removeNiño()
Deberíamos poder preguntarle si tiene niños.|public boolean hayNiños()
Deberíamos poder preguntarle cuántos niños tiene|public int numeroNiños()
Deberíamos poder pedirle que saque por pantalla a todos los niños.|public void listaNiños()
Deberíamos poder pedirle, para algunas tareas puntuales, que nos pase la lista de niños (no confundir con la tarea anterior, que lo que hace es mostrar o imprimir la lista de los niños). En este caso, lo que debe hacer es devolvernos un objeto de la clase Lista conteniendo los niños de la cola.|public List<Niño> getNiños()

## Paso 006

A partir aquí, tras haber definido las responsabilidades y métodos de la clase **Cola**, y teniendo claro que la clase debe resolver todo únicamente con lo que cuenta (pilar fundamental del abordaje de escenarios mediante la orientación a objetos: encapsulamiento, autonomía, entre otros), procedemos a completar el código de los métodos anteriormente descritos.

> Nota: Es importante recordar y reconocer que no necesitamos tener todas las clases completamente desarrolladas para comenzar a trabajar en una clase específica. A medida que avanzamos en el desarrollo de una clase, iremos completando y refinando las demás. Sin embargo, es crucial mantener claras y respetar las interfaces de cada clase, que definen cómo se comunican y colaboran entre sí. Esto permite un enfoque modular y flexible en la solución de problemas, similar a ensamblar piezas de un rompecabezas que están siendo diseñadas simultáneamente pero deben encajar perfectamente al final. Este proceso iterativo permite que las clases evolucionen y se adapten a medida que el proyecto progresa y nuestras necesidades y comprensión se expanden.

