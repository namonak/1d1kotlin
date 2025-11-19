package boj.problems

import java.io.BufferedReader

class No32762 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        repeat(n) {
            input.readLine() // 각 사람의 정보 (사용하지 않음)
        }

        var totalPrice = 0L

        repeat(m) {
            val (_, price) = input.readLine().split(" ").map { it.toLong() }
            totalPrice += price
        }

        val averagePerPerson = totalPrice.toDouble() / n.toDouble()

        // 소수점 이하 5자리까지 출력 (스페셜 저지지만 맞춰 주는 편이 안전)
        return "%.5f".format(averagePerPerson)
    }
}
