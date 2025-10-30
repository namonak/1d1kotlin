package boj.problems

import java.io.BufferedReader

class No11723 {
    fun solve(input: BufferedReader): String {
        val m = input.readLine().toInt()
        val set = mutableSetOf<Int>()
        val sb = StringBuilder()

        repeat(m) {
            val inputs = input.readLine().split(" ")
            val command = inputs[0]
            val num = if (inputs.size > 1) inputs[1] else null

            when (command) {
                "add" -> set.add(num!!.toInt())
                "remove" -> set.remove(num!!.toInt())
                "check" -> sb.append("${if (set.contains(num!!.toInt())) 1 else 0}\n")
                "toggle" -> if (set.contains(num!!.toInt())) set.remove(num.toInt()) else set.add(num.toInt())
                "all" -> set.addAll(1..20)
                "empty" -> set.clear()
            }
        }

        return sb.toString().trimEnd()
    }
}
