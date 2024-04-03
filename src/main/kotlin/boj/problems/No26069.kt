package boj.problems

import java.io.BufferedReader

class No26069 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val enterUser: HashSet<String?> = HashSet()

        enterUser.add("ChongChong")
        repeat(n) {
            val (a, b) = input.readLine().split(" ")

            if (enterUser.contains(a) || enterUser.contains(b)) {
                enterUser.add(a)
                enterUser.add(b)
            }
        }

        return enterUser.size.toString()
    }
}
