import java.math.BigDecimal
import java.util.Arrays

fun main(args: Array<String>) {
    println("Hello World!")

    val test1 = 1
    var test2 = 2

    val byte: Byte = 30
    val short: Short = 30000
    val int: Int = 2000000000
    val long: Long = 200000000000000000

    val float: Float = 2.0f
    val double: Double = 2.0
    val bigDecimal: BigDecimal = BigDecimal(20000.00)

    val boolean: Boolean = false

    val char: Char = 'A'
    val string: String = "Bom dia"

    val array: Array<Int> = arrayOf(1, 2, 3, 4, 20, 32)
    println(Arrays.toString(array))
    test2 = 3
    println(test1)
    println(test2)
}