package boj.problems

import java.io.BufferedReader

class No10927 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        return java.security.MessageDigest.getInstance("MD5").digest(str.toByteArray()).joinToString("") {
            "%02x".format(it)
        }
    }
}
