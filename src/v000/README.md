# Una solución propuesta

Esta solución se apoya en los objetos List y Node revisados en sesiones previas. Es importante comprender su funcionamiento

## Paso 000

- Se prepara el espacio de trabajo, se incluyen las clases List y Node

## Paso 001

- Clase contenedora: **Mundo**
- Esta clase contendrá la ludoteca, y se encargará de gobernar los elementos de más alto nivel de toda las simulación. Para empezar, el tiempo que dura toda la simulación.
- En esta clase estará el main() que arranca todo. Aquí se crea la ludoteca, se especifica el tiempo de simulación y se crea el Mundo pasándole estos parámetros mediante el constructor.

## Paso 002

- Procedemos, a partir de lo definido en la clase Mundo, a definir la clase **Ludoteca**.
- Como se indica en las instrucciones del juego, esta ludoteca contendrá a las dos monitoras (Lydia y Aisha) y una pizarra. Esto implica que existirán dos clases nuevas: Monitor y Pizarra, las cuales son declaradas en la clase e inicializadas en el constructor de la misma.
- A efectos de identificación individual de cada monitora, al momento de crear el objeto le pasamos su nombre (que el objeto será responsable de almacenar).

