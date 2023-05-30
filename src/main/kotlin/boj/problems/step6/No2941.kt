package boj.problems.step6

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2941.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No2941 {
    private val croatianAlphabetArray = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    fun solve(input: String): Int {
        var result = input

        croatianAlphabetArray.forEach { word ->
            result = result.replace(word, "0")
        }

        return result.length
    }
}
