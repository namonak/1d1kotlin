package boj.problems

import java.io.BufferedReader

class No32292 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            input.readLine().toInt()
            val s = input.readLine().toMutableList()

            var changed: Boolean

            do {
                changed = false
                val length = s.size

                var index = -1
                for (i in 0 until length - 2) {
                    if (s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'B') {
                        index = i
                        break
                    }
                }

                if (index != -1) {
                    s[index] = 'B'
                    s[index + 1] = 'A'
                    s.removeAt(index + 2)
                    changed = true
                }
            } while (changed)

            result.appendLine(s.joinToString(""))
        }

        return result.toString().trimEnd()
    }
}
