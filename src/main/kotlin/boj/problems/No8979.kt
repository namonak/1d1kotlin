package boj.problems

import java.io.BufferedReader

class No8979 {
    data class Country(val id: Int, val gold: Int, val silver: Int, val bronze: Int)

    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val countries = mutableListOf<Country>()

        repeat(n) {
            val (id, gold, silver, bronze) = input.readLine().split(" ").map { it.toInt() }
            countries.add(Country(id, gold, silver, bronze))
        }

        countries.sortWith(
            compareByDescending<Country> { it.gold }
                .thenByDescending { it.silver }
                .thenByDescending { it.bronze }
        )

        var rank = 1
        var sameRank = 1
        for (i in 1 until n) {
            if (countries[i].gold == countries[i - 1].gold &&
                countries[i].silver == countries[i - 1].silver &&
                countries[i].bronze == countries[i - 1].bronze
            ) {
                sameRank++
            } else {
                rank += sameRank
                sameRank = 1
            }

            if (countries[i].id == k) {
                return rank.toString()
            }
        }

        if (countries[0].id == k) {
            return "1"
        }

        return rank.toString()
    }
}
