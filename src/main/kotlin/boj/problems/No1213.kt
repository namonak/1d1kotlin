package boj.problems

import java.io.BufferedReader
import java.util.TreeMap

class No1213 {
    fun solve(input: BufferedReader): String {
        val name = input.readLine()
        val frequency = TreeMap<Char, Int>()
        name.forEach { frequency[it] = frequency.getOrDefault(it, 0) + 1 }

        var middleChar: Char? = null
        val halfStringBuilder = StringBuilder()

        for ((char, freq) in frequency) {
            if (freq % 2 != 0) {
                if (middleChar != null) {
                    return "I'm Sorry Hansoo"
                }
                middleChar = char
            }
            repeat(freq / 2) {
                halfStringBuilder.append(char)
            }
        }

        val halfString = halfStringBuilder.toString()
        val reversedHalfString = halfStringBuilder.reverse().toString()
        return if (middleChar != null) {
            halfString + middleChar + reversedHalfString
        } else {
            halfString + reversedHalfString
        }
    }
}
