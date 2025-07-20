// Ejercicio 1
fun calcularPromedio(numbers: List<Double>): Double {
    val suma = numbers.reduce { acc, num -> acc + num } // Sumar todos los números usando reduce
    return suma / numbers.size  // Calcular el promedio dividiendo la suma por la cantidad de números

}

val numerosEjercicio1 = listOf(1.0, 2.0, 3.0, 4.0, 6.0)   // Lista de números para calcular el promedio, que debe ser de tipo Double

// Ejercicio 2
val numerosEjercicio2 = listOf(1, 2, 3, 4, 5, 77)

// Ejercicio 3
val cadenaEjercicio3 = "Sometemos" // Cadena de texto para verificar si es un palíndromo
fun isPalindrome(cadena: String) = cadena.lowercase() == cadena.reversed().lowercase() // Verificar si una cadena es un palíndromo comparando la cadena original con su reverso

// Ejercicio 4
val nombresEjercicio4 = listOf("Ana", "Pedro", "María", "Juan", "Lucía") // Lista de nombres para filtrar

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

    // Ejercicio 3
    println("Ejercicio 3: Verificar si una cadena es un palíndromo") // Mensaje descriptivo del ejercicio
    println(isPalindrome(cadenaEjercicio3))  // Imprimir el resultado de la verificación del palíndromo

    // Ejercicio 4
    println(nombresEjercicio4.map { "¡Hola, $it!" }) // Imprimir un saludo personalizado para cada nombre en la lista usando map

}
