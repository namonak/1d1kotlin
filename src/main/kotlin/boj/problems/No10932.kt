package boj.problems

import java.io.BufferedReader
import java.math.BigInteger
import java.security.MessageDigest

class No10932 {
    fun solve(input: BufferedReader): String {
        return input.readLine().sha512()
    }

    private fun String.sha512(): String {
        val md = MessageDigest.getInstance("SHA-512")
        return BigInteger(1, md.digest(toByteArray(Charsets.UTF_8))).toString(16).padStart(128, '0')
    }
}
