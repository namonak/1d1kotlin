package boj.problems

import java.io.BufferedReader

class No1855 {
    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()
        val encryptedMessage = input.readLine()

        val totalLength = encryptedMessage.length
        val rows = totalLength / k
        val table = Array(rows) { CharArray(k) }

        var index = 0
        for (i in 0 until rows) {
            if (i % 2 == 0) {
                for (j in 0 until k) {
                    table[i][j] = encryptedMessage[index++]
                }
            } else {
                for (j in k - 1 downTo 0) {
                    table[i][j] = encryptedMessage[index++]
                }
            }
        }

        val originalMessage = StringBuilder()
        for (j in 0 until k) {
            for (i in 0 until rows) {
                originalMessage.append(table[i][j])
            }
        }

        return originalMessage.toString()
    }
}
