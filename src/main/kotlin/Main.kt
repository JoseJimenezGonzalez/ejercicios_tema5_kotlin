import java.lang.RuntimeException

// 1. Imprimir longitud de una cadena
fun imprimirLongitud(cadena: String) {
    println("La longitud de la cadena es: ${cadena.length}")
}

// 2. Comparación de Cadenas
fun compararCadenas(cadena1: String, cadena2: String) {
    if (cadena1.equals(cadena2)) {
        println("Las cadenas son iguales.")
    } else {
        println("Las cadenas son diferentes.")
    }
}

// 3. Comparación usando compareTo
fun compararConCompareTo(cadena1: String, cadena2: String) {
    val resultado = cadena1.compareTo(cadena2)
    println("El resultado de la comparación es: $resultado")
}

// 4. Convertir a mayúsculas
fun convertirAMayusculas(cadena: String): String {
    return cadena.toUpperCase()
}

// 5. Convertir a minúsculas
fun convertirAMinusculas(cadena: String): String {
    return cadena.toLowerCase()
}

// 6. Eliminar espacios al principio y al final
fun eliminarEspacios(cadena: String): String {
    return cadena.trim()
}

// 7. Extraer subcadena de la posición 5 a la 10
fun extraerSubcadena(cadena: String): String {
    return cadena.substring(5, 11)
}

// 8. Reemplazar ocurrencias de un carácter
fun reemplazarCaracter(cadena: String, viejo: Char, nuevo: Char): String {
    return cadena.replace(viejo, nuevo)
}

// 9. Dividir cadena en un array de subcadenas
fun dividirCadena(cadena: String, separador: Char): Array<String> {
    return cadena.split(separador).toTypedArray()
}

// 10. Unir dos cadenas
fun unirCadenas(cadena1: String, cadena2: String): String {
    return cadena1 + cadena2
}

// 11. Crear cadena de formato
fun cadenaDeFormato(nombre: String, edad: Int): String {
    return "Mi nombre es $nombre y tengo $edad años."
}

// 12. Utilizar substring para extraer parte de una cadena
fun extraerSubcadenaConIndices(cadena: String, inicio: Int, fin: Int): String {
    return cadena.substring(inicio, fin)
}

// 13. Operaciones con Nullable
fun operacionesConNullable(a: Int?, b: Int?): Int {
    return (a ?: 0) + (b ?: 0)
}

// 14. Operador Elvis
fun asignarValorPredeterminado(valor: String?): String {
    return valor ?: "Valor predeterminado"
}

// 15. Smart Cast
fun imprimirLongitudDeString(parametro: Any) {
    if (parametro is String) {
        println("La longitud de la cadena es: ${parametro.length}")
    }
}

// 16. Manejo de Excepciones
fun dividirNumeros() {
    try {
        println("Ingrese el numerador:")
        val numerador = readLine()!!.toDouble()

        println("Ingrese el divisor:")
        val divisor = readLine()!!.toDouble()

        val resultado = numerador / divisor
        println("El resultado de la división es: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: División por cero.")
    } catch (e: NumberFormatException) {
        println("Error: Ingrese valores numéricos válidos.")
    } finally {
        println("Operación completada.")
    }
}

// 17. Operador de Lectura Segura (readLine)
fun leerEntradaUsuario(): Int {
    return readLine()?.toIntOrNull() ?: 0
}

// 18. Operadores Matemáticos
fun operacionesMatematicas(a: Double, b: Double): String {
    return "Suma: ${a + b}, Resta: ${a - b}, Multiplicación: ${a * b}, División: ${if (b != 0.0) a / b else "Indefinida"}"
}

// 19. Casting Seguro e Inseguro
fun castingSeguroEInseguro(valor: Any) {
    // Casting seguro
    val valorSeguro: String? = valor as? String
    println("Casting seguro: $valorSeguro")

    // Casting inseguro
    try {
        val valorInseguro: String = valor as String
        println("Casting inseguro: $valorInseguro")
    } catch (e: ClassCastException) {
        println("Casting inseguro: Error - ${e.message}")
    }
}

// 20. Uso de try, catch y finally
fun bloqueTryCatchFinally() {
    try {
        val resultado = 10 / 0
        println("Resultado: $resultado")
        //Prueba
        throw RuntimeException("Mierda")
    } catch (e: ArithmeticException) {
        println("Error: División por cero.")
    } finally {
        println("Operación completada.")
    }
}

fun main() {
    // Puedes llamar a las funciones aquí para probarlas.
}
