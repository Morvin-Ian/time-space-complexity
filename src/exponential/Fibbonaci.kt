package exponential

fun fibonacciIterative(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    for (i in 2..n) {
        val c = a + b
        a = b
        b = c
    }
    return b
}
