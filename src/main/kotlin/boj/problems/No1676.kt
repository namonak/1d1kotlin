package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1676.solve(input.readLine().toInt()).toString())

    input.close()
    output.close()
}

object No1676 {
    fun solve(input: Int): Int {
        var count = 0
        var n = input

        while (n >= 5) {
            count += n / 5
            n /= 5
        }

        return count
    }
}
