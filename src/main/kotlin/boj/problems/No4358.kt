package boj.problems

import java.io.BufferedReader
import java.util.Locale

class No4358 {
    fun solve(input: BufferedReader): String {
        val trees = HashMap<String, Int>()
        val result = StringBuilder()

        while (true) {
            val tree = input.readLine()
            if (tree == null) break

            trees[tree] = trees.getOrDefault(tree, 0) + 1
        }

        val total = trees.values.sum()
        val sortedNames = trees.keys.sorted()
        for (name in sortedNames) {
            val count = trees[name]!!
            val percentage = count.toDouble() / total * 100
            val formatted = String.format(Locale.US, "%.4f", percentage)
            result.append("$name $formatted\n")
        }

        return result.toString().trimEnd()
    }
}
