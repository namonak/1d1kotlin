package boj.problems

import java.io.BufferedReader

class No10935 {
    fun solve(input: BufferedReader): String {
        return java.util.Base64.getEncoder().encodeToString(input.readLine().toByteArray())
    }
}
