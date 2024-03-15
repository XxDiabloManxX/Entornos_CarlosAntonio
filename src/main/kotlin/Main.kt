package net.diablostudio

import java.util.*
import kotlin.random.Random

fun main() {
    var matriz = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = Array(matriz.size){0}
    var sumaColumas = Array(matriz[0].size){0}


    for (fila in matriz.indices){
        for (columna in matriz[fila].indices){
            print("${matriz[fila][columna]} ")
        }
        println()
    }
    sumarArray(matriz, sumaFilas)
    sumarArray(matriz,sumaColumas)

    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColumas))
}

fun sumarArray (m:Array<Array<Int>>, sumaArray:Array<Int>){
    var fila: Int = 0
    var columna: Int = 0

    while (columna < m.size){
        while (fila < m[0].size){
            sumaArray[columna] += m[fila][columna]
            fila++
        }
        fila = 0
        columna++
    }
}
