package boj.problems.step12

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1436.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No1436 {
    fun solve(input: Int): Int {
        var count = 0
        var num = 666

        while (true) {
            if (num.toString().contains("666")) {
                count++
            }

            if (count == input) {
                return num
            }

            num++
        }
    }
}
