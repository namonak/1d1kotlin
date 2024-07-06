package boj.problems

import java.io.BufferedReader

class No2998 {
    fun solve(input: BufferedReader): String {
        val binary = input.readLine()
        val paddingLength = (3 - (binary.length % 3)) % 3
        val paddedBinary = "0".repeat(paddingLength) + binary

        val octalStringBuilder = StringBuilder()
        for (i in paddedBinary.indices step 3) {
            val binaryChunk = paddedBinary.substring(i, i + 3)
            val octalDigit = binaryChunk.toInt(2)
            octalStringBuilder.append(octalDigit)
        }

        return octalStringBuilder.toString()
    }
}
