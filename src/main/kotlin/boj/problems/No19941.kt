package boj.problems

import java.io.BufferedReader

class No19941 {
    fun solve(input: BufferedReader): String {
        val (_, k) = input.readLine().split(" ").map { it.toInt() }
        val seats = input.readLine()
        return countPeopleWithHamburgers(seats, k).toString()
    }

    private fun countPeopleWithHamburgers(
        seats: String,
        range: Int
    ): Int {
        val eaten = BooleanArray(seats.length)

        return seats.indices.count { index ->
            seats[index] == 'P' && eatNearestHamburger(seats, eaten, index, range)
        }
    }

    private fun eatNearestHamburger(
        seats: String,
        eaten: BooleanArray,
        personIndex: Int,
        range: Int
    ): Boolean {
        val start = maxOf(0, personIndex - range)
        val end = minOf(seats.lastIndex, personIndex + range)

        for (hamburgerIndex in start..end) {
            if (seats[hamburgerIndex] == 'H' && !eaten[hamburgerIndex]) {
                eaten[hamburgerIndex] = true
                return true
            }
        }
        return false
    }
}
