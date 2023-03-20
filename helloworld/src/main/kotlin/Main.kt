import com.diacht.ktest.compose.startTestUi
import com.diacht.ktest.library.BuildConfig
import kotlin.math.abs
import kotlin.math.ln
import kotlin.math.max
import kotlin.math.tan

fun seed(): String = "Nikarionec"


fun labNumber() : Int = BuildConfig.LAB_NUMBER


fun main(args: Array<String>) {
    println("Лабораторна робота №${labNumber()} користувача ${seed()}")

    startTestUi(seed(), labNumber())
    }
fun iCalculate(x0: Int = 41, x1: Int = -125, x2: Int = 49, x3: Int = 10, x4: Int = 67) {
    val max = maxOf(x0, x1, x2, x3, x4)
    var result1 = ln(max.toDouble())
    println("Результат = $result1")
}
fun dCalculate(x0: Double = 65.72, x1: Double = -11.22, x2: Double = -102.12, x3: Double =-12.96, x4: Double = -47.38) {

    val arg = abs(x0) + abs(x1) + abs(x2) + abs(x3) + abs(x4)
    var result2 = tan(arg)
    println("Результат = $result2")
}

fun strCalculate(x0: String = "A G T C J", x1: String = "G T C J A"): Int {
    var count = 0
    for (i in x0.indices) {
        if ((x0[i] == 'T' || x0[i] == 'C') && (x1[i] == 'T' || x1[i] == 'C') && x0[i] != x1[i]) {
            count++
        }
    }
    return count
    println(count)
}
