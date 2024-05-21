package boj.problems

import java.io.BufferedReader
import java.security.MessageDigest

class No10930 {
    fun solve(input: BufferedReader): String {
        val s = input.readLine()

        return MessageDigest.getInstance("SHA-256")
            .digest(s.toByteArray())
            .joinToString("") { "%02x".format(it) }
    }
}
