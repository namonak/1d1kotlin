package boj.problems

import java.io.BufferedReader

object No1296 {
    fun solve(input: BufferedReader): String {
        val myName = input.readLine()
        val n = input.readLine().toInt()
        val names = (1..n).map { input.readLine() }
        val result = names.map { name ->
            val l = myName.count { it == 'L' } + name.count { it == 'L' }
            val o = myName.count { it == 'O' } + name.count { it == 'O' }
            val v = myName.count { it == 'V' } + name.count { it == 'V' }
            val e = myName.count { it == 'E' } + name.count { it == 'E' }
            val winRate = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100
            name to winRate
        }.sortedBy { it.first }

        return result.maxByOrNull { it.second }!!.first
    }
}
