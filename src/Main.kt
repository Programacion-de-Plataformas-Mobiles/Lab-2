// Ejercicio 1
fun calcularPromedio(numbers: List<Double>): Double {
    val suma = numbers.reduce { acc, num -> acc + num } // Sumar todos los números usando reduce
    return suma / numbers.size  // Calcular el promedio dividiendo la suma por la cantidad de números

}

val numeros = listOf(1.0, 2.0, 3.0, 4.0, 6.0)   // Lista de números para calcular el promedio, que debe ser de tipo Double

fun main() {
    // Ejercicio 1
    println(calcularPromedio(numeros))  // Imprimir el resultado del promedio calculado
}