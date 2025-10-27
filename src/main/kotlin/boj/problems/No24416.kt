package boj.problems

import java.io.BufferedReader

class No24416 {
    fun solve(input: BufferedReader): String {
        val number = input.readLine().toInt()
        val fibo = IntArray(number + 1)
        fibo[1] = 1.also { fibo[2] = it }
        for (i in 3..number) {
            fibo[i] = fibo[i - 1] + fibo[i - 2]
        }

        return "${fibo[number]} ${number - 2}"
    }
}
