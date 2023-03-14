package boj.problems.step22

object No2164 {
    fun solve(input: Int): Int {
        val queue = ArrayDeque<Int>()

        for (i in 1..input) {
            queue.add(i)
        }

        while (queue.size > 1) {
            queue.removeFirst()
            queue.add(queue.removeFirst())
        }

        return queue.first()
    }
}

fun main() {
    val input = System.`in`.bufferedReader().readLine().toInt()
    val output = System.out.bufferedWriter()

    output.write("${No2164.solve(input)}\n")

    output.flush()
    output.close()
}
