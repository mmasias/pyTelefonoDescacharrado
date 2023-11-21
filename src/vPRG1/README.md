# Chinese whispers

En inglés, el juego del "teléfono descacharrado" o "teléfono descompuesto" a menudo se conoce como "Chinese Whispers" o simplemente "Whispers." También puede ser llamado "Telephone" en algunos lugares, aunque "Chinese Whispers" es más común en el Reino Unido y otras partes del mundo. En este juego, los participantes se sientan en un círculo y uno de ellos susurra un mensaje corto a la persona a su lado, quien a su vez susurra el mensaje a la siguiente persona, y así sucesivamente. El objetivo es ver cómo cambia el mensaje a medida que pasa de una persona a otra debido a errores de audición y comunicación, lo que a menudo resulta en una historia cómicamente distorsionada al final del juego.

## Paso 000

|Descripción|Archivo de avance|
|-|-|
Inicio del proceso y puesta a punto del entorno de desarrollo|Clase [ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/2aa9fff7eebd8bf318f58a4933231e0f0f793923/src/vPRG1/ChineseWhispers.java) en la carpeta [/vPRG1](/)

## Paso 001 - El tiempo

|Descripción|Archivo de avance|
|-|-|
Empezamos por modelar el tiempo de la simulación. En este caso, como lo debatimos en clase, se utiliza un bucle for que gobierna el tiempo que está abierta la ludoteca.|[ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/8c753ae4f4510b2acbd155c436142e1aa18f82b8/src/vPRG1/ChineseWhispers.java)

```
┏[manuel]--[seguimiento-desarrollo-vPRG1 ≡ ● ]
┖[~/misRepos/pyTelefonoDescacharrado]
    java vPRG1.ChineseWhispers 
Ludoteca PRG1 - minuto 0
Ludoteca PRG1 - minuto 1
Ludoteca PRG1 - minuto 2
Ludoteca PRG1 - minuto 3
Ludoteca PRG1 - minuto 4
Ludoteca PRG1 - minuto 5
Ludoteca PRG1 - minuto 6
Ludoteca PRG1 - minuto 7
Ludoteca PRG1 - minuto 8
Ludoteca PRG1 - minuto 9
Ludoteca PRG1 - minuto 10
(...)
```

## Paso 002 - Llegada de niños

|Descripción|Archivo de avance|
|-|-|
Abordamos la llegada de los niños, simplificando (de momento) lo planteado en el enunciado original: la probabilidad de llegada de niños en un minuto es del 30%.|[ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/dd823ff818c35cd5534033f2e67bb56faa03d23d/src/vPRG1/ChineseWhispers.java)
Para fomentar la claridad del código y ejercitar el principio de adecuado reparto de responsabilidades y la teoría de métodos estáticos, crearemos el método estático llegaNiño que nos dirá si llega un niño.
En este punto, pasa el tiempo y sabemos si llega un niño.

```
┏[manuel]--[seguimiento-desarrollo-vPRG1 ≡ ● ]
┖[~/misRepos/pyTelefonoDescacharrado]
    java vPRG1.ChineseWhispers 
Ludoteca PRG1 - minuto 0
Ludoteca PRG1 - minuto 1
> Llego un niño!
Ludoteca PRG1 - minuto 2
> Llego un niño!
Ludoteca PRG1 - minuto 3
> Llego un niño!
Ludoteca PRG1 - minuto 4
Ludoteca PRG1 - minuto 5
Ludoteca PRG1 - minuto 6
Ludoteca PRG1 - minuto 7
Ludoteca PRG1 - minuto 8
Ludoteca PRG1 - minuto 9
Ludoteca PRG1 - minuto 10
(...)
```

## Paso 003 - Los recibe Lydia

|Descripción|Archivo de avance|
|-|-|
En caso que llegue un niño, los recibe Lydia y los pone en cola.|[ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/03a22ab41bacc32302cc265b1e54bb85e7dc990f/src/vPRG1/ChineseWhispers.java)

> NOTA: Aprovecho en corregir los nombres de variables y métodos al inglés. ¡Perdón! :(

## Paso 004 - Si puede, se los pasa a Aisha

|Descripción|Archivo de avance|
|-|-|
Si Aisha no está jugando, entonces toma los niños que tiene Lydia y los incorpora a su cola.|[ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/2ab76f8ec912cfba72fec8d69d944508e526fc91/src/vPRG1/ChineseWhispers.java)

```
Ludoteca PRG1 - minuto 0
> No están jugando. Aisha tiene en cola [0] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 1
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [1] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 2
> No están jugando. Aisha tiene en cola [1] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 3
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 4
> No están jugando. Aisha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 5
> No están jugando. Aisha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 6
> No están jugando. Aisha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 7
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [3] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 8
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 9
> No están jugando. Aisha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 10
> No están jugando. Aisha tiene en cola [4] y Lydia tiene en cola [0] niños
```

## Paso 005 - ¿Aisha puede jugar?

Para que Aisha pueda jugar, tienen que cumplirse dos condiciones:

- Que tenga más de cinco niños en cola
- ¡Que no esté jugando!

|Descripción|Archivo de avance|
|-|-|
De momento aquí indicamos que Aisha puede empezar a jugar, en la siguiente iteración analizaremos y desarrollaremos la lógica necesaria para que el juego se realice.|[ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/18ed070facb1708142de9b82f0723a3d40f96026/src/vPRG1/ChineseWhispers.java)

```
(...)
Ludoteca PRG1 - minuto 14
> No están jugando. Aisha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 15
> No están jugando. Aisha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 16
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [5] y Lydia tiene en cola [0] niños
> Aisha empieza a jugar!!!
(...)
```

> NOTA: [Corrijo una errata, se me pasó declarar MINIMAL_CHILDS.](https://github.com/mmasias/pyTelefonoDescacharrado/blob/974fbeddd152153a4de0344715f99e949b8ca2a3/src/vPRG1/ChineseWhispers.java)

## Paso 006 - Aisha empieza a jugar

Empezar a jugar puede descomponerse en dos momentos:

- El inicio del juego, cuando Aisha le da el mensaje al primer niño.
- Las siguientes etapas del juego, cuando los niños se van transmitiendo el mensaje.

### Inicio del juego

|||
|-|-|
Hay que indicar que estamos jugando (de modo que Lydia no pase más niños, sino que los ponga en cola)|Lo gobierna isPlaying
Hay que preparar un mensaje|Por mantenerlo simple enviamos el mensaje "Dicen que el examen estará difícil. ¡Pásalo!"
Hay que indicar qué niño juega (en este caso, el primero)|Creamos childTurn
Esto ocurre solo al inicio de un juego, porque luego, cuando Aisha haya cedido el turno al primer niño, hay que manejarlo de otro modo (hasta llegar al último)|

***Archivo de avance:*** [ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/929c1f328a8cdf7e258272069902201ac7cfc6a4/src/vPRG1/ChineseWhispers.java)

### Juego

Si el juego ya ha dado inicio, en cada turno:

|||
|-|-|
El niño al que le toca, altera el mensaje|Apoyándonos en alteredMessage()
Se pasa el turno al siguiente niño.|Incrementamos childTurn
El turno termina al llegar al niño final.|Comparamos childTurn y el número de niños que tiene Aisha en cola.


***Archivo de avance:*** [ChineseWhispers.java](https://github.com/mmasias/pyTelefonoDescacharrado/blob/6a618b9b7d05a94a468b131a7551fc2e647e437f/src/vPRG1/ChineseWhispers.java)

> NOTA: Por mantener sencilla esta implementación, asumimos que los niños alteran el mensaje agregándole una X al final. Más adelante podremos complicar esta forma de alterar el mensaje.

```
Ludoteca PRG1 - minuto 8
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 9
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aisha tiene en cola [5] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 10
> Llego un niño. Ahora Lydia tiene en cola [1]
El niño [1] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!X
Ludoteca PRG1 - minuto 11
> Llego un niño. Ahora Lydia tiene en cola [2]
El niño [2] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XX
Ludoteca PRG1 - minuto 12
> Llego un niño. Ahora Lydia tiene en cola [3]
El niño [3] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XXX
Ludoteca PRG1 - minuto 13
El niño [4] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XXXX
Ludoteca PRG1 - minuto 14
> Llego un niño. Ahora Lydia tiene en cola [4]
El niño [5] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XXXXX
Ludoteca PRG1 - minuto 15
> No están jugando. Aisha tiene en cola [9] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 16
El niño [1] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!X
Ludoteca PRG1 - minuto 17
> Llego un niño. Ahora Lydia tiene en cola [1]
El niño [2] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XX
Ludoteca PRG1 - minuto 18
El niño [3] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XXX
Ludoteca PRG1 - minuto 19
El niño [4] pasa este mensaje: Dicen que el examen estará difícil. ¡Pásalo!XXXX
```

## Más cosas 2Do:

- [x] Dibujar las colas.
- [x] Mostrar quién tiene la pizarra.
- [x] Pulir la llegada de niños (no más niños a partir del minuto 40)
- [ ] Hacer seguimiento del mensaje final.
- [ ] Mostrar qué tiene el que tiene la pizarra.

```
==============================
Ludoteca PRG1 - minuto 35
Lydia > 🧒🧒
------------------------------
Aisha > 🧒🧒🧒🗨️ 🧒🧒🧒🧒
------------------------------
🗨️: Dicen que el examen estará difícil. ¡Pásalo!XXX
```

**showQueue()** hace uso de una característica muy interesante llamada sobrecarga. Recordármelo en clase para comentarlo.
