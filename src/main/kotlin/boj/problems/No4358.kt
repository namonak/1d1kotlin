package boj.problems

import java.io.BufferedReader
import java.util.Locale

class No4358 {
    fun solve(input: BufferedReader): String {
        val trees = HashMap<String, Int>()
        val result = StringBuilder()

        while (true) {
            val tree = input.readLine() ?: break

            trees[tree] = trees.getOrDefault(tree, 0) + 1
        }

        val total = trees.values.sum()
        if (total == 0) return ""

        trees.entries
            .sortedBy { it.key }
            .forEach { (name, count) ->
                val percentage = count.toDouble() / total * 100.0
                val formatted = String.format(Locale.US, "%.4f", percentage)
                result.append(name).append(' ').append(formatted).append('\n')
            }

        return result.toString().trimEnd()
    }
}
