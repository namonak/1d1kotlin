package boj.problems

import java.io.BufferedReader

class No2484 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt() // 참여하는 사람 수
        var maxPrize = 0 // 가장 많은 상금

        repeat(n) {
            val dice = input.readLine().split(' ').map { it.toInt() }
            val countMap = dice.groupingBy { it }.eachCount()
            var prize = 0

            when {
                countMap.containsValue(4) -> {
                    val diceNum = countMap.filter { it.value == 4 }.keys.first()
                    prize = 50000 + diceNum * 5000
                }
                countMap.containsValue(3) -> {
                    val diceNum = countMap.filter { it.value == 3 }.keys.first()
                    prize = 10000 + diceNum * 1000
                }
                countMap.size == 2 && countMap.all { it.value == 2 } -> {
                    val diceNums = countMap.keys.toList()
                    prize = 2000 + diceNums.sumOf { it * 500 }
                }
                countMap.containsValue(2) -> {
                    val diceNum = countMap.filter { it.value == 2 }.keys.first()
                    prize = 1000 + diceNum * 100
                }
                else -> {
                    prize = dice.maxOrNull()!! * 100
                }
            }

            if (prize > maxPrize) {
                maxPrize = prize
            }
        }

        return maxPrize.toString()
    }
}
