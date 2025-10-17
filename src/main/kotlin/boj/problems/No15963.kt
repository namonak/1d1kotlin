package boj.problems

class No15963 {
    fun solve(reader: java.io.BufferedReader): String {
        val (n, m) = reader.readLine().split(" ").map { it.toLong() }
        return if (n == m) "1" else "0"
    }
}
