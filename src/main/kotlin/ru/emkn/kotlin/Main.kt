package ru.emkn.kotlin

fun main() {
    val resourceStream = Thread.currentThread().contextClassLoader?.getResourceAsStream("input.txt")!!
    var ch = 0
    val sb = StringBuilder()
    while (resourceStream.read().also({ ch = it }) != -1)
        sb.append(ch.toChar())
    print(sb.toString())
}