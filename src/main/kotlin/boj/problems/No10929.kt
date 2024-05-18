package boj.problems

import java.io.BufferedReader
import java.security.MessageDigest

class No10929 {
    fun solve(input: BufferedReader): String {
        val given = input.readLine()
        return sha224Hash(given)
    }

    private fun sha224Hash(input: String): String {
        val bytes = input.toByteArray()
        val md = MessageDigest.getInstance("SHA-224")
        val digest = md.digest(bytes)
        return digest.joinToString("") { "%02x".format(it) }
    }
}
