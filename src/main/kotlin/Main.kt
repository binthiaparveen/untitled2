
fun main() {
    val numRows = 5
    Pyramid(numRows)
}
fun Pyramid(rows: Int) {
    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }
        println()

    }
}
