package boj.problems

import java.io.BufferedReader

class No2703 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val results = mutableListOf<String>()

        repeat(t) {
            val encryptedMessage = input.readLine()
            val conversionRule = input.readLine()
            val conversionMap = ('A'..'Z').zip(conversionRule.asIterable()).toMap()
            val originalMessage = encryptedMessage.map { char ->
                when {
                    char.isWhitespace() -> char
                    char.isUpperCase() -> conversionMap[char] ?: char
                    else -> char
                }
            }.joinToString("")

            results.add(originalMessage)
        }

        return results.joinToString("\n")
    }
}
