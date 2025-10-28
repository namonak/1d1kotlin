package boj.problems

import java.io.BufferedReader
import java.util.Locale

class No2204 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val n = input.readLine().toInt()
            if (n == 0) break
            val words = mutableListOf<String>()
            repeat(n) {
                words.add(input.readLine())
            }
            words.sortWith { o1, o2 ->
                o1.lowercase(Locale.getDefault()).compareTo(o2.lowercase(Locale.getDefault()))
            }
            sb.append("${words.minByOrNull { it.lowercase(Locale.getDefault()) }}\n")
        }
        return sb.toString().trimEnd()
    }
}
