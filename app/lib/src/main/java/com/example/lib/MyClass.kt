package com.example.lib

fun main() {
//    //Variables INMUTABLES
//    val name : String = "Hila"
//
//    //Variables MUTABLES
//    var age : Int? = null
//    age = 20
//
//    //Tipos de datos int, string, double, float, char, array, bool
//    val isOld : Boolean = false
//    val height : Double = 1.69
//
//    //string Interpolation
//    println("El  nombre es: $name, con edad $age y altura $height m")
//
//    //println(name + " " + age + " " + height)
//    println(height)
//
//    //Estructuras de control
//    //1. If-Else
//    if (age > 18) {
//        println("Es mayor de edad")
//    }
//    else {
//        println("NO es")
//    }
//
//    //Ciclo for
//    for(i in 0..10) {
//        println(i)
//    }
//    for(i in 10 downTo 0) {
//        println(i)
//    }
//
//    //Switch - Case
//    val dayOfWeek = 4
//    when(dayOfWeek){
//        1-
//    }

    //kotlin es un lenguaje null safety
    var base : Double? = 0.0
    var height : Double? = 0.0
    println("Digita la base del rectangulo")
    val baseInput = readlnOrNull()
    base = baseInput?.toDoubleOrNull() ?: 0.0
    println("Digita la altura del rectangulo")
    val heightInput = readlnOrNull()
    height = heightInput?.toDoubleOrNull() ?: 0.0
    val area = base * height
    if(area == 0.0){
        println("no sea payaso")
    } else{
        println("El area es: $area")
    }
}
//Creando funcionalidad 1
