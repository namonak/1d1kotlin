package boj.problems

import java.math.BigInteger
import java.security.MessageDigest

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10932.solve(input.readLine()))

    input.close()
    output.flush()
    output.close()
}

object No10932 {
    fun solve(input: String): String {
        return input.sha512()
    }

    private fun String.sha512(): String {
        val md = MessageDigest.getInstance("SHA-512")
        return BigInteger(1, md.digest(toByteArray(Charsets.UTF_8))).toString(16).padStart(128, '0')
    }
}
