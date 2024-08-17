package boj.problems

import java.io.BufferedReader

class No31775 {
    fun solve(input: BufferedReader): String {
        val s1 = input.readLine().first()
        val s2 = input.readLine().first()
        val s3 = input.readLine().first()

        val chars = setOf(s1, s2, s3)
        val requiredChars = setOf('l', 'k', 'p')

        return if (chars.containsAll(requiredChars)) {
            "GLOBAL"
        } else {
            "PONIX"
        }
    }
}
