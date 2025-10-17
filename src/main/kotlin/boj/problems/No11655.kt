package boj.problems

import java.io.BufferedReader

private const val ROT13 = 13

class No11655 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val stringBuilder = StringBuilder()

        str.forEach {
            if (it.isLowerCase()) {
                stringBuilder.append(
                    if (it + ROT13 > 'z') {
                        (it + ROT13 - 'z' + 'a'.code - 1).toChar()
                    } else {
                        (it + ROT13)
                    }
                )
            } else if (it.isUpperCase()) {
                stringBuilder.append(
                    if (it + ROT13 > 'Z') {
                        (it + ROT13 - 'Z' + 'A'.code - 1).toChar()
                    } else {
                        (it + ROT13)
                    }
                )
            } else {
                stringBuilder.append(it)
            }
        }

        return stringBuilder.toString()
    }
}
