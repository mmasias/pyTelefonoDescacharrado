# Chinese whispers

En inglés, el juego del "teléfono descacharrado" o "teléfono descompuesto" a menudo se conoce como "Chinese Whispers" o simplemente "Whispers." También puede ser llamado "Telephone" en algunos lugares, aunque "Chinese Whispers" es más común en el Reino Unido y otras partes del mundo. En este juego, los participantes se sientan en un círculo y uno de ellos susurra un mensaje corto a la persona a su lado, quien a su vez susurra el mensaje a la siguiente persona, y así sucesivamente. El objetivo es ver cómo cambia el mensaje a medida que pasa de una persona a otra debido a errores de audición y comunicación, lo que a menudo resulta en una historia cómicamente distorsionada al final del juego.

## Paso 000

Inicio del proceso y puesta a punto del entorno de desarrollo: clase [ChineseWhispers.java](ChineseWhispers.java) en la carpeta [/vPRG1](/)

## Paso 001 - El tiempo

Empezamos por modelar el tiempo de la simulación. En este caso, como lo debatimos en clase, se utiliza un bucle for que gobierna el tiempo que está abierta la ludoteca.

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

Abordamos la llegada de los niños, simplificando (de momento) lo planteado en el enunciado original: la probabilidad de llegada de niños en un minuto es del 30%.

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

En caso que llegue un niño, los recibe Lydia y los pone en cola.

> NOTA: Aprovecho en corregir los nombres de variables y métodos al inglés. ¡Perdón! :(

## Paso 004 - Si puede, se los pasa a Aysha

Si Aysha no está jugando, entonces toma los niños que tiene Lydia y los incorpora a su cola.

```
Ludoteca PRG1 - minuto 0
> No están jugando. Aysha tiene en cola [0] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 1
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aysha tiene en cola [1] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 2
> No están jugando. Aysha tiene en cola [1] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 3
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aysha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 4
> No están jugando. Aysha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 5
> No están jugando. Aysha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 6
> No están jugando. Aysha tiene en cola [2] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 7
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aysha tiene en cola [3] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 8
> Llego un niño. Ahora Lydia tiene en cola [1]
> No están jugando. Aysha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 9
> No están jugando. Aysha tiene en cola [4] y Lydia tiene en cola [0] niños
Ludoteca PRG1 - minuto 10
> No están jugando. Aysha tiene en cola [4] y Lydia tiene en cola [0] niños
```

## Paso 005 - ¿Aysha puede jugar?

Para que Aysha pueda jugar, tienen que cumplirse dos condiciones:

- Que tenga más de cinco niños en cola
- ¡Que no esté jugando!

De momento aquí indicamos que Aysha puede empezar a jugar, en la siguiente iteración analizaremos y desarrollaremos la lógica necesaria para que el juego se realice.

