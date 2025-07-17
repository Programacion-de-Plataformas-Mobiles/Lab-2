// Ejercicio 1
fun calcularPromedio(numbers: List<Double>): Double {
    val suma = numbers.reduce { acc, num -> acc + num } // Sumar todos los números usando reduce
    return suma / numbers.size  // Calcular el promedio dividiendo la suma por la cantidad de números

}

val numerosEjercicio1 = listOf(1.0, 2.0, 3.0, 4.0, 6.0)   // Lista de números para calcular el promedio, que debe ser de tipo Double

// Ejercicio 2
val numerosEjercicio2 = listOf(1, 2, 3, 4, 5, 77)

fun main() {
    // Ejercicio 1
    println("Ejercicio 1: Calcular el promedio de una lista de números") // Mensaje descriptivo del ejercicio
    println(calcularPromedio(numerosEjercicio1))  // Imprimir el resultado del promedio calculado

    // Ejercicio 2
    val numerosImpares by lazy {
        numerosEjercicio2.filter { it % 2 != 0} // Filtrar los números impares de la lista usando lazy para optimizar el rendimiento
    }

    println("Ejercicio 2: Filtrar números impares de una lista") // Mensaje descriptivo del ejercicio
    println(numerosImpares)  // Imprimir la lista de números impares
}
