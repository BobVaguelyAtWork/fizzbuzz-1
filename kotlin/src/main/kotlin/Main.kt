package org.example

fun fizzbuzzOf(n: Int): String {
    val ret = n.toString()
    if (n % 3 == 0) return "Fizz"
    if (n % 5 == 0) return "Buzz"
    return ret
}

fun fizzbuzzUpTo(n: Int): List<String> {
    return (1 until 20).map { fizzbuzzOf(it) }
}

/** returns an infinite cycle of the provided list, e.g. [1, 2, 3].cycle() = [1, 2, 3, 1, 2, 3, ...]
 */
fun <T> List<T>.cycle(): Sequence<T> = generateSequence { this }.flatten() 

fun fizzbuzzNoMath(upTo: Int): List<String> {
    val fizzes = listOf("", "", "Fizz").cycle()
    TODO("fill in the rest")
}
