package boj.problems

import java.io.BufferedReader

class No2558 {
    fun solve(input: BufferedReader): String {
        return (input.readLine().toInt() + input.readLine().toInt()).toString().trimEnd()
    }
}
