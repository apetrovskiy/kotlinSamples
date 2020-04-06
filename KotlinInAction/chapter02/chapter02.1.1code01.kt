fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(5, 6))
    println(max2(8, 7))
    println(max3(9, 10))

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    if (args.size > 0) {
        println("Hello, ${args[0]}")
    }
}

fun max(a: Int, b: Int): Int {
    return if (a> b)a else b
}

fun max2(a: Int, b: Int): Int = if (a> b) a else b

fun max3(a: Int, b: Int) = if (a> b) a else b
