package boj.problems

import java.io.BufferedReader

class No27964 {
    fun solve(input: BufferedReader): String {
        input.readLine()
        val toppings = input.readLine().split(" ")
        val uniqueCheeses = toppings.filter { it.endsWith("Cheese") }.toSet()

        return if (uniqueCheeses.size >= 4) "yummy" else "sad"
    }
}
