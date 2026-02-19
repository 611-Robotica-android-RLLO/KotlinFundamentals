package com.example.lib

fun main(){
    val numeros = listOf(11, 45, 82, 40, 5, 18, 69, 1, 31, 0)
    val numerosquecambian = mutableListOf<Int>()
    numerosquecambian.add(2)
    numerosquecambian.add(3)
    var numeroMaximo = numeros[0]
    //println(unNumero)

    for(n in numeros){
        if(n > numeroMaximo){
            numeroMaximo = n
        }
    }
    println(numeroMaximo)

    val palindromo = "anita lava la tina"
    for (letra in palindromo){
        println(letra)
    }
}