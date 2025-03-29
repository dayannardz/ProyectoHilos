# Proyecto de Hilos en Java

Este proyecto demuestra el uso de hilos en Java utilizando tanto la implementación de la interfaz `Runnable` como la herencia de la clase `Thread`. Se crean múltiples hilos que ejecutan tareas simultáneamente, lo que permite entender mejor la concurrencia y el manejo de estados de los hilos en Java.

## Estructura del Proyecto

El proyecto está compuesto por varias clases principales:

### 1. `HiloR.java`
Esta clase contiene el método `main` y es el punto de entrada del programa. Aquí se crean y ejecutan varios hilos utilizando la interfaz `Runnable`. Se implementa un `Runnable` con una expresión lambda para simular una carrera de caballos donde cada hilo representa un caballo.

**Características:**
- Se crean 4 hilos utilizando `Thread` y un `Runnable`.
- Cada hilo imprime su nombre y espera un tiempo aleatorio antes de continuar.
- Se usa `join()` para asegurar que el `main` espere la finalización de los hilos antes de continuar.
- Se imprime el estado de los hilos después de su ejecución.

### 2. `ThreadSimple.java`
Esta clase hereda de `Thread` y representa un hilo que ejecuta una tarea específica.

**Características:**
- Se sobrescribe el método `run()` para definir la tarea del hilo.
- Cada hilo imprime su nombre en cada iteración.
- Se utiliza `Thread.sleep()` para simular pausas aleatorias.

### 3. `RunnableSimple.java`
Esta clase implementa `Runnable` y define una tarea ejecutada por un hilo.

**Características:**
- Recibe un nombre como parámetro para identificar el hilo.
- Se usa `Thread.sleep()` para simular pausas en la ejecución.
- Se imprime el estado de inicio y finalización de cada hilo.

### 4. `Hilos.java`
Esta clase también contiene el método `main` y crea hilos usando la clase `ThreadSimple`, pero de manera más sencilla. Se crean dos hilos, los cuales se ejecutan simultáneamente.

**Características:**
- Se crean dos instancias de `ThreadSimple`, cada una representando un hilo con un nombre específico.
- Se ejecutan los hilos utilizando el método `start()`.
- Se imprime el estado del primer hilo utilizando `getState()`.


# Proyecto Productor-Consumidor en Java

Este proyecto implementa el problema clásico de Productor-Consumidor utilizando hilos en Java. Se simula el funcionamiento de una panadería donde un panadero hornea panes y un consumidor los retira de manera sincronizada. Se utilizan `wait()` y `notify()` para coordinar la producción y el consumo.

## Estructura del Proyecto

El proyecto está compuesto por cinco clases principales:

### 1. `Panaderia.java`
Esta clase representa el recurso compartido entre el productor y el consumidor. Gestiona la producción y el consumo de panes de manera sincronizada.

**Características:**
- Usa `synchronized` para garantizar exclusión mutua.
- Implementa `wait()` y `notify()` para la correcta coordinación entre hilos.
- Controla la disponibilidad del pan con una variable de estado.

### 2. `Panadero.java`
Clase que representa al panadero (productor). Implementa `Runnable` y se encarga de hornear panes y almacenarlos en la panadería.

**Características:**
- Itera 10 veces para hornear panes numerados.
- Usa `Thread.sleep()` para simular tiempos de producción variables.
- Llama a `hornear()` en la clase `Panaderia` para depositar el pan.

### 3. `Consumidor.java`
Clase que representa al consumidor, quien toma los panes horneados. Implementa `Runnable`.

**Características:**
- Itera 10 veces para consumir panes.
- Llama al método `consumir()` de la panadería para retirar el pan.
- Imprime un mensaje cada vez que consume un pan.

### 4. `EjemploProductorConsumidor.java`
Clase principal que inicia el programa utilizando hilos tradicionales con `Runnable`.

**Características:**
- Crea una instancia de `Panaderia`.
- Inicia un hilo para el `Panadero` y otro para el `Consumidor`.
- Simula la interacción entre productor y consumidor.

### 5. `EjemploProductorConsumidorJava8.java`
Versión alternativa que utiliza expresiones lambda para iniciar los hilos en Java 8+.

**Características:**
- Usa `Thread` con expresiones lambda en lugar de clases `Runnable`.
- Mantiene la misma lógica de producción y consumo.

## Análisis del Código
### ¿Qué es una flag?
Una *flag* (bandera) es una variable que se usa como indicador para señalar un estado dentro de un programa. En este caso, la variable `disponible` en `Panaderia.java` actúa como una flag para indicar si hay pan disponible o no.

### ¿Qué es el método `wait()`?
El método `wait()` se utiliza en programación concurrente para hacer que un hilo espere hasta que otro hilo lo notifique. Se llama dentro de un bloque `synchronized` y libera el monitor del objeto hasta que otro hilo llama a `notify()`.

### ¿Qué es el método `notify()`?
El método `notify()` despierta un hilo que estaba en espera después de haber llamado a `wait()`. Esto permite reanudar la ejecución de un hilo que estaba pausado, asegurando la correcta sincronización entre productor y consumidor.

### Diferencias entre programación normal y programación funcional
- **Programación normal**: Se basa en la ejecución secuencial y el uso de estructuras de control como bucles e iteraciones explícitas.
- **Programación funcional**: Se centra en el uso de funciones de orden superior, expresiones lambda y evita el estado mutable. En este proyecto, la versión `EjemploProductorConsumidorJava8.java` usa programación funcional con expresiones lambda para crear hilos de manera más concisa.

## Requisitos
- Java 8 o superior.
- Un entorno de desarrollo compatible (Eclipse, IntelliJ IDEA o NetBeans).

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Para más información, consulta el archivo `LICENSE`.
