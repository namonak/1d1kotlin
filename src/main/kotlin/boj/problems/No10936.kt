package boj.problems

import java.io.BufferedReader

class No10936 {
    fun solve(input: BufferedReader): String {
        return java.util.Base64.getDecoder().decode(input.readLine()).toString(Charsets.UTF_8)
    }
}
