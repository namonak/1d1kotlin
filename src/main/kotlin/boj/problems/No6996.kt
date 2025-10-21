package boj.problems

import java.io.BufferedReader

class No6996 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()

        repeat(n) {
            val (a, b) = input.readLine().split(" ")
            result.append("$a & $b are ${if (isAnagram(a, b)) "" else "NOT "}anagrams.\n")
        }
        return result.toString().trimEnd()
    }

    private fun isAnagram(
        a: String,
        b: String
    ): Boolean {
        if (a.length != b.length) return false
        val aMap = mutableMapOf<Char, Int>()
        val bMap = mutableMapOf<Char, Int>()
        for (i in a.indices) {
            aMap[a[i]] = aMap.getOrDefault(a[i], 0) + 1
            bMap[b[i]] = bMap.getOrDefault(b[i], 0) + 1
        }
        return aMap == bMap
    }
}
