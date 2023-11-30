package boj.problems

import java.io.BufferedReader

object No10928 {
    fun solve(input: BufferedReader): String {
        val given = input.readLine()
        return given.sha1()
    }

    private fun String.sha1(): String {
        val bytes = this.toByteArray()
        val md = java.security.MessageDigest.getInstance("SHA-1")
        val digest = md.digest(bytes)
        return digest.fold("") { str, it -> str + "%02x".format(it) }
    }
}
