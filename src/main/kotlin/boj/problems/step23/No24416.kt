package boj.problems.step23

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No24416.solve(input.readLine().toInt()))

    input.close()
    output.flush()
    output.close()
}

object No24416 {
    fun solve(number: Int): String {
        val fibo = IntArray(number + 1)
        fibo[1] = 1.also { fibo[2] = it }
        for (i in 3..number) {
            fibo[i] = fibo[i - 1] + fibo[i - 2]
        }

        return "${fibo[number]} ${number - 2}"
    }
}
