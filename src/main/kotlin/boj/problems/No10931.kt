package boj.problems

import java.io.BufferedReader

class No10931 {
    fun solve(input: BufferedReader): String {
        val given = input.readLine()
        val messageDigest = java.security.MessageDigest.getInstance("SHA-384")
        val hash = messageDigest.digest(given.toByteArray())
        return hash.joinToString("") { "%02x".format(it) }
    }
}
