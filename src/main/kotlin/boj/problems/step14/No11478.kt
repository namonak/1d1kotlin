package boj.problems.step14

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11478.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No11478 {
    fun solve(input: String): Int {
        val strSet = HashSet<String>()

        for (i in input.indices) {
            for (j in i + 1..input.length) {
                strSet.add(input.substring(i, j))
            }
        }

        return strSet.size
    }
}
