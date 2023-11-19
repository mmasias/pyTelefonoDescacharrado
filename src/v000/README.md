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

## Paso de repaso

- Clases que tenemos: Mundo, Ludoteca, Monitor, Cola, Pizarra.
- Clases auxiliares: List, Node.

## Paso 007

Repasando las clases creadas, vemos que está pendiente iniciar la definición de la clase **Niño**, además por supuesto, de completar algunos métodos para otras clases y de completar la funcionalidad. Para mantener este esquema de construcción, terminemos con la creación de la clase Niño, para asi tener completo el ecosistema sobre el que se apoyará la implementación de la solución.

Del enunciado del problema podemos inferir las responsabilidades:

|||
|-|-|
Un niño debería tener un nombre y la capacidad de tener un pizarrín.
Un niño debería poder recibir un pizarrin.
Un niño debería poder recibir un mensaje, y anotarlo en su pizarrín.
Un niño debería poder mostrar el mensaje que tiene anotado en su pizarrín.
Un niño debería poder limpiar su pizarrín cuando reciba la instrucción de hacerlo.

Con esto en mente, creamos la clase Niño y especificamos los atributos privados que le permitan tener lo que debe tener (nombre y pizarrín), así como los métodos que le permitan hacer cosas. Definiremos en esta iteración los atributos y métodos más básicos/obvios/sencillos (constructor), y dejamos para la siguiente iteración el concluir la definición de esta clase: procedemos con 

|||
|-|-|
Un niño debería tener un nombre y la capacidad de tener un pizarrín.|
Un niño debería poder recibir un pizarrin.|public void recibirPizarrin(Pizarra pizarra)

Definiremos también el constructor, el cual recibe un único parámetro (el nombre del niño). Asimismo, un getter para poder acceder al nombre del niño.

## Paso 008

Continuando con la clase Niño, vamos a concluir con la implementación del comportamiento restante.

||||
|-|-|-|
Un niño debería poder recibir un mensaje, y anotarlo en su pizarrín|Siendo la recepción del mensaje una comunicación que recibe de fuera, y la tarea de anotarlo en su pizarrín responsabilidad del niño, colaborando con la clase pizarrin que tiene asociada.|public void recibirMensaje(String mensaje)
||Al resolver este comportamiento, hemos de tener en cuenta que los niños "*a veces inadvertidamente suelen cambiar una o dos letras del mensaje al escribirlo*". Por tanto, además de usar el método *escribirMensaje* del pizarrin asociado al niño, antes el niño debe modificar el mensaje recibido de acuerdo lo anteriormente dicho. Para esto crearemos el método privado modificarMensaje.
Un niño debería poder mostrar el mensaje que tiene anotado en su pizarrín.||public String mostrarMensaje()
Un niño debería poder limpiar su pizarrín cuando reciba la instrucción de hacerlo.||public void limpiarPizarrin()

Con esto, salvo que aparezca alguna cuestión no prevista más adelante, podríamos dar por terminada la implementación de la clase Niño, sabiendo, no obstante, que podrían aparecer cambios, pero que por la naturaleza del código escrito sería razonablemente sencillo incluirlo

> Nota: nótese como durante el desarrollo e iteraciones se ha hecho especial hincapié en evitar el efecto yo-yo. Es decir, cuando evaluamos y desarrollamos una clase, nos centrábamos en los datos y comportamiento de la misma, y teníamos claro que la clase debe ser autosuficiente y resolver todo únicamente con lo que cuenta. Es clave para esto una adecuada asignación de responsabilidades a la clase.

## Paso 009

Cerrada la clase Niño, toca continuar con alguna de las clases que tenemos pendientes, las cuales son **Mundo**, **Ludoteca** y **Monitor**. Podemos, nuevamente, volver a la clase "principal", la que está en la parte más alta de la jerarquía, que es la clase **Mundo**, resolver lo que tengamos que dejar resuelto allí y nuevamente iterar hacia las siguientes clases descendentes.

En la clase **Mundo** habíamos dejado pendiente inminente el método iniciarSimulación, que sería el que dispararía el proceso completo. Esta simulación tendría que realizarse minuto a minuto hasta que se alcance el tiempo total.

|Durante cada uno de esos minutos tocaría|||
|-|-|-|
|Gestión de los niños||iniciarSimulación()
||Implementar las reglas de llegada de los niños|private boolean llegaNiño()
||Implementar la generación de un niño|private Niño generarNiño()
||Método auxiliar que se "inventa" un nombre.|private String inventarNombre()|
|Hacer pasar al niño que llega a la ludoteca.||ludoteca.recibirNiño(niño)
|Indicarle a la ludoteca que haga lo que tenga que hacer.||ludoteca.actualizar()
|Indicarle a la ludoteca que nos diga como va todo||ludoteca.verEstado()

Nótese como hemos delegado a la ludoteca las responsabilidades de recibir a los niños, actualizar su estado (tanto de los niños en espera como los niños jugando), así como de saber contarnos como va todo.

> NOTA: Para esta iteración se ha simplificado la regla de llegada de niños, asumiendo un 50% de probabilidades de llegada de un niño en un minuto. El carácter modular de la solución debería permitirnos luego ajustar esto sin mayor impacto en las demás clases o métodos de esta clase.

> NOTA II: A partir de ahora se incluyen, en algunos métodos, impresiones por pantalla para ir viendo la evolución de la simulación. Hemos de ser cuidadosos con su inclusión para no entorpecer la claridad del código que generamos, y hacerlo de modo que luego podamos extraerlo a lo que más adelante veremos que se conocen como *clases de vista*.

## Paso 010

Abordamos ahora una de las dos clases que tenemos pendientes: Ludoteca y Monitor. Por continuar la progresión jerárquica, elegimos trabajar con la clase Ludoteca, la cual además tiene ya "deberes asignados" por la clase Mundo:

|Mundo le pide a Ludoteca|||
|-|-|-|
|recibirNiño(niño)|Recibir un niño implica -en la Ludoteca- que los reciba Lydia, los ponga en cola, le pregunte a Aisha si está jugando, y si no está jugando, le entregue a los niños para que en la siguiente ronda de juego cuente con ellos para jugar.
|actualizar()|Habíamos dicho que aquí la Ludoteca "haga lo que tenga que hacer", y lo que tiene que hacer (o mejor dicho, lo que le queda por hacer dado que ya recibió un niño y lo colocó con la monitora que debía), es jugar, si la monitora puede.
|verEstado()|Aquí la ludoteca nos muestra su estado, que pasa por mostrar como va cada una de las monitoras: haremos pues que cada una de ellas nos mueste su lista de niños.

### Mención especial a la entrega de niños

Una cuestión de diseño que puede resultar interesante de analizar: como pasan los niños de un monitor a otro. Las consideraciones no son menores, sobretodo teniendo en cuenta como estamos estructurando la información. Caben dos aproximaciones: 

|Aisha recibe los Niños|Lydia entrega los Niños|
|-|-|
aisha.recibeNiños(lydia)|lydia.entregaNiños(aisha)

Como eso es una responsabilidad que se ve(rá) gestionada al completo por la clase Monitor, elegimos una de ambas (guardamos bajo la manga la posibilidad de elegir el otro camino) y cuando estemos abordando el análisis y desarrollo de la clase Monitor evaluaremos pros & contras de cada una de estas aproximaciones y nos decantaremos por aquella que consideremos más favorable.
